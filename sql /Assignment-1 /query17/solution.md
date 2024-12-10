**Query**: BOPIS orders Revenue in the last year:
   - Calculate the revenue generated from BOPIS orders over the past year.

**Query-cost**: 5147.86

**Solution**:
```sql
select 
  oi.order_id,
  oi.ORDER_ITEM_SEQ_ID ,
  sum(oi.QUANTITY * oi.UNIT_PRICE) as BOPIS_REVENUE
from 
  order_item oi  
join 
  order_shipment os
  on os.ORDER_ID = oi.ORDER_ID
join 
  shipment s 
  on s.SHIPMENT_ID = os.SHIPMENT_ID
  and s.SHIPMENT_METHOD_TYPE_ID = 'STOREPICKUP'
  and s.CREATED_DATE >= curdate() -interval 1 year
group by
  oi.ORDER_ID;

