**Query:** Single-Item Orders Fulfilled from Warehouses (Last Month)
 - Business Problem:
   Identify how many single-item orders were fulfilled from warehouse facilities in the previous month, to assess picking/packing efficiency.
 - Fields to Retrieve:
   - ORDER_ID 
   - TOTAL_ORDER_ITEMS 
   - FACILITY_ID 
   - SHIPMENT_ID 
   - SHIPMENT_DATE 
   - ORDER_COMPLETION_DATE

**Query cost**: 37092.91

**Solution:** 
```sql
select 
    os.order_id,
    os.shipment_id,
    f.facility_id,
    s.created_date as shipment_date,
    oh.order_date as order_date,
    count(oi.order_item_seq_id) as single_item
from 
    order_header oh
join 
    order_shipment os on oh.order_id = os.order_id
join 
    shipment s on os.shipment_id = s.shipment_id
join 
    order_item oi on oh.order_id = oi.order_id
join 
    order_item_ship_group oisg on oi.order_id = oisg.order_id 
    and oi.ship_group_seq_id = oisg.ship_group_seq_id
join 
    facility f on oisg.facility_id = f.facility_id
join  
    facility_type ft on f.facility_type_id = ft.facility_type_id 
where 
    ft.parent_type_id = 'distribution_center'  
    and month(oh.created_stamp) = 1
    and oh.status_id = 'order_completed'
    and s.status_id = 'shipment_shipped'
group by 
    os.order_id, os.shipment_id, f.facility_id, s.created_date , oh.order_date
having 
    count(oi.order_item_seq_id) = 1;
