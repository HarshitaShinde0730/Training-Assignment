**Query**:Last week imported orders & items count:
 - Identify and count the orders and items that were imported in the system during the last week.

**Query-cost**: 68891.46

**Solution**: 
```sql
select 
   oh.ORDER_DATE as order_date,
   count(distinct oh.ORDER_ID) as order_count, 
   count(oi.ORDER_ITEM_SEQ_ID) as order_item_count ,
   sum(oi.QUANTITY) as total_item_quantity
from
   order_header oh
join
   order_item oi 
   on oh.ORDER_ID = oi.ORDER_ID
   and oh.ORDER_DATE > = now() - interval 7 day
group by 
   oh.ORDER_DATE; 






