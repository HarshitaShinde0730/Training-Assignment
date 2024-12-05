**Query:** Find all the orders whose two or more items are cancelled but the orders are still in the approved status.

**Query cost**: 21895.92

**Solution:**
```sql
select 
      oh.order_id,
      count(oi.order_item_seq_id) as ORDER_ITEM
from 
      order_header oh 
join
      order_item oi on oh.ORDER_ID  = oi.ORDER_ID
where 
      oi.STATUS_ID  = 'item_cancelled' and oh.STATUS_ID = 'order_approved'
group by 
      oh.ORDER_ID
having 
      ORDER_ITEM  >= 2 ;
      
