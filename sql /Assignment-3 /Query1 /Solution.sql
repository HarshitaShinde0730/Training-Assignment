**Query:** How many single-item orders were fulfilled from warehouses in the last month? 
  
**Query cost:** 
  
**Solution:** 
```sql
  
select 
      count(oi.ORDER_ITEM_SEQ_ID) as single_item_in_order,
      oh.ORDER_ID,
      f.FACILITY_TYPE_ID,
      oh.STATUS_ID,
      oh.ORDER_DATE
from 
order_item oi 
join 
order_header oh 
on  
oi.ORDER_ID = oh.ORDER_ID
join 
order_item_ship_group oisg  
on 
oisg.ORDER_ID = oi.ORDER_ID
join 
facility f 
on 
f.FACILITY_ID = oisg.FACILITY_ID
join 
facility_type ft 
on 
f.FACILITY_TYPE_ID = ft.FACILITY_TYPE_ID
where 
ft.PARENT_TYPE_ID = 'distribution_center' 
and 
oi.STATUS_ID = 'item_completed' 
and 
oh.ORDER_DATE >= DATE_ADD(CURDATE(), INTERVAL -1 MONTH)
and 
oh.ORDER_DATE < CURDATE()
group by 
oi.ORDER_ID
having 
single_item_in_order = 1 ;
