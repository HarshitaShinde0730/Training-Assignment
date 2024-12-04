**Query:** How many orders with a single return were recorded in the last month?

**Query_cost:** 

**Solution:**
```sql
select 
       count(ri.ORDER_ID) as SINGLE_ORDER_RETURN
from 
     return_header rh 
join
     return_item ri 
on 
  ri.RETURN_ID = rh.RETURN_ID 
where 
     rh.RETURN_DATE >=DATE_ADD(current_date(), interval - 1 month)
and 
     rh.RETURN_DATE < current_date()
group by 
     ri.RETURN_ID, ri.ORDER_ID 
having 
     SINGLE_ORDER_RETURN = 1 ;
