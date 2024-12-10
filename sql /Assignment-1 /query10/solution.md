**Query**: Orders brokered but not shipped:
   - Identify orders that have been brokered (arranged or negotiated) but have not been shipped yet or shipment has not yet been created/initiated.

**Query-cost**: 23044

**Solution**:
```sql
select 
  oisg.ORDER_ID
from 
  order_item_ship_group oisg 
join 
  facility f 
  on f.FACILITY_ID = oisg.FACILITY_ID 
  and f.FACILITY_TYPE_ID not in ('back_order' , 'pre_order' , 'virtual_facility')
union all 
select
  oh.status_id
from 
  order_header oh 
where
  oh.STATUS_ID != 'ORDER_COMPLETED' 
