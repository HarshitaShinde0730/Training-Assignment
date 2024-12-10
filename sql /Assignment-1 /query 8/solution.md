**Query**: Orders that have more than one item in a single ship group:

**Query-cost**: 18866.35

**Soutlion**: 
```sql
select 
   oi.ORDER_ID,
   oi.SHIP_GROUP_SEQ_ID,
   count(oi.ORDER_ITEM_SEQ_ID) as ITEM_IN_SHIP_GROUP
from 
   order_item oi
 where 
   oi.ORDER_ITEM_SEQ_ID is not null
group by 
   oi.ORDER_ID
having 
   ITEM_IN_SHIP_GROUP > 1;
