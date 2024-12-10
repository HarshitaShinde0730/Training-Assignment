**Query**: Shipping Revenue last month:
  - Determine the total revenue generated from shipping in the last month.

  **Query-cost**: 75996.45

  **Solution**:
  ```sql
select
  sum(oa.AMOUNT) as SHIPPING_REVENUE
from 
  order_adjustment oa
join 
  order_header oh 
  on oh.ORDER_ID = oa.ORDER_ID
  and oh.ENTRY_DATE >= curdate() - interval 1 month
where 
  oa.ORDER_ADJUSTMENT_TYPE_ID = 'shipping_charges'
