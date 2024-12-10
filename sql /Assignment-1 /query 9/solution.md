**Query**: Find orders where multiple items are grouped and shipped together in a single shipment:

**Query-cost**: 59012.45

**solution**:
```sql
select 
  oi.ORDER_ID,
  count(oi.ORDER_ITEM_SEQ_ID) as MULTIPLE_ITEM
from
  order_item oi 
join 
  order_item_ship_group oisg 
  on oisg.ORDER_ID = oi.ORDER_ID
  and oi.STATUS_ID = 'item_completed'
group by 
  oi.ORDER_ID 
having 
  MULTIPLE_ITEM > 1;
