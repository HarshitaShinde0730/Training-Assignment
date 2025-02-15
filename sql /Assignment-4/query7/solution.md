**Query:** Total number of shipments in January 2022 first quarter:
 - Determine the total count of shipments made during the first quarter of 2022, specifically in the month of January.
   
**Query cost**: 1396

**Solution:** 
```sql
select 
     'January_shipment' as Shipment_Type,
      count(*) as Shipment_Count
from 
      shipment s
where 
      s.STATUS_ID = 'shipment_shipped'
      and 
      month(s.CREATED_DATE) = 1
      and 
      year(s.CREATED_DATE) = 2022
union all
select 
      'Total_shipment' as Shipment_Type, 
       count(*) as Shipment_Count
from 
      shipment s2
where 
      s2.STATUS_ID = 'shipment_shipped'
      and 
      date(s2.CREATED_DATE) between '2022-01-01' and '2022-03-31';
