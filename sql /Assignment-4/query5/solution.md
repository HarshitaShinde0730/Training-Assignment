**Query:** Multi-Item Orders (Single Ship Group)
 - Business Problem:
   For analyzing shipping efficiency, some businesses want to know which multi-item orders (more than one product) were fulfilled in one shipment (same ship group).
 - Fields to Retrieve:
   - ORDER_ID
   - TOTAL_ITEMS_IN_ORDER 
   - SHIP_GROUP_SEQ_ID 
   - SHIPMENT_ID 
   - FACILITY_ID 
   - SHIPMENT_DATE

**Query cost**: 49,715.02

**Solution:** 
```sql
select 
    os.order_id, 
    count(distinct oi.order_item_seq_id) as total_item_in_order,
    oisg.ship_group_seq_id, 
    s.shipment_id, 
    oisg.facility_id, 
    oisg.created_stamp as shipment_date
from 
    order_shipment os
join 
    shipment s on os.shipment_id = s.shipment_id
join 
    order_item oi on os.order_id = oi.order_id
join 
    order_item_ship_group oisg on oi.order_id = oisg.order_id and oi.ship_group_seq_id = oisg.ship_group_seq_id
where 
    s.status_id = 'shipment_shipped' 
group by 
    os.order_id, s.shipment_id, oisg.ship_group_seq_id
having 
    total_item_in_order > 1;