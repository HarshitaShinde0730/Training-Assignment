**Query:** Brokered but Not Shipped Orders
 - Business Problem:
   Merchandising teams need to track orders that have been brokered (allocated to a facility) but not shipped. They also want to know how long it has been since the order was brokered.
 - **Fields to Retrieve:**
   - ORDER_ID 
   - BROKERED_DATE 
   - BROKERED_FACILITY_ID 
   - SHIPMENT_STATUS 
   - TIME_SINCE_BROKERING

**Query cost**: 40,356.58

**Solution:** 
```sql
with unshipped as (
    select shipment_id
    from shipment
    where status_id != 'shipment_shipped'
)
select
    oisg.order_id,
    oisg.created_stamp as brokered_date,
    oisg.facility_id as brokered_facility_id,
    s.status_id as shipment_status,
    timestampdiff(day ,oisg.created_stamp, now()) as time_since_brokering
from
    order_item_ship_group oisg
join
    order_shipment os on oisg.order_id = os.order_id
join
    shipment s on os.shipment_id = s.shipment_id
where
    s.shipment_id in (select shipment_id from unshipped);
