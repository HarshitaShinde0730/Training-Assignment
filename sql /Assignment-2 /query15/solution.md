**Query:** Find all the orders that have more than one return.

**Query cost**: 908.38

**Solution:**
```sql
select 
      ri.ORDER_ID, 
      count(distinct rh.RETURN_ID) as single_order
from
     return_item ri
join 
     return_header rh on ri.RETURN_ID = rh.RETURN_ID 
group by 
      ri.ORDER_ID 
having 
     single_order > 1;
