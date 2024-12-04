**Query:** In the past month, which store has the highest number of one-day shipped orders?

**Query_Cost:** 10977.48

**Solution:** 
```sql
select 
      f.FACILITY_NAME as STORE_NAME,
      count(oisg.order_id) as TOTAL_ORDER,
      f.FACILITY_ID 
from 
     order_header oh 
join 
     order_item_ship_group oisg 
on
     oisg.ORDER_ID = oh.ORDER_ID 
join 
     facility f
on 
    f.FACILITY_ID = oisg.FACILITY_ID
join
    facility_type ft  
on 
    ft.FACILITY_TYPE_ID = f.FACILITY_TYPE_ID 
join 
     order_shipment os 
on 
    os.ORDER_ID = oh.ORDER_ID 
join 
     shipment s 
on 
    s.SHIPMENT_ID = os.SHIPMENT_ID 
where 
    s.SHIPMENT_METHOD_TYPE_ID = 'next_day'
and 
    ft.PARENT_TYPE_ID = 'physical_store'
and 
    oh.ORDER_DATE >=DATE_ADD(current_date(),interval -1 month)
and 
    oh.STATUS_ID = 'order_completed' 
group by  
     oisg.ORDER_ID 
order by 
     TOTAL_ORDER desc
limit 1;
