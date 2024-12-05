**Query**:Last week imported orders & items count:
 - Identify and count the orders and items that were imported in the system during the last week.

**Query-cost**: 68891.46

**Solution**: 
```sql
select 
   oh.ORDER_DATE AS order_date,
   COUNT(distinct oh.ORDER_ID) AS order_count, 
   COUNT(distinct oi.ORDER_ITEM_SEQ_ID) AS order_item_count ,
   sum(oi.QUANTITY) as total_item_quantity
from
   order_header oh
join
   order_item oi ON oh.ORDER_ID = oi.ORDER_ID
where
   oh.ORDER_DATE >= NOW() - INTERVAL 7 DAY
group by 
   DATE(oh.ORDER_DATE); 



