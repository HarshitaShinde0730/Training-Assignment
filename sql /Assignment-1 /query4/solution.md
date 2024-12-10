**Query:** Shipped units By Location:
 - Identify the number of units that have been shipped, categorized by different locations	;. Gain insights into the distribution of shipped units across various locations.

**Query cost**: 17227.82

**Solution**:
```sql
select
   f.FACILITY_NAME ,
   s.origin_facility_id as location_id,
   sum(si.quantity) as shipped_units
from
   shipment s
join
   shipment_item si 
   on s.shipment_id = si.shipment_id
   and s.status_id = 'SHIPMENT_SHIPPED'
join 
   facility f 
   on s.ORIGIN_FACILITY_ID =f.FACILITY_ID  
group by
   s.origin_facility_id
order by 
   shipped_units desc;
