**Query:** In the period following the New Year, what is the number of orders shipped from stores in the first 25 days?

**Query cost:** 

**Solution:**
```sql
select 
      count(distinct os.ORDER_ID)
from 
     order_item oi 
join 
     order_status os 
on 
     os.STATUS_ID = oi.STATUS_ID 
join 
     order_item_ship_group oisg 
on 
     oi.ORDER_ID = oisg.ORDER_ID 
join 
     facility f 
on 
    oisg.FACILITY_ID = f.FACILITY_ID
join 
     facility_type ft
on 
     ft.FACILITY_TYPE_ID = f.FACILITY_TYPE_ID 
where 
      os.STATUS_ID = 'item_completed'
and 
      ft.PARENT_TYPE_ID = 'physical_store'
and
      os.STATUS_DATETIME between '2024-01-01' and date_add('2024-01-01', interval 25 day);
