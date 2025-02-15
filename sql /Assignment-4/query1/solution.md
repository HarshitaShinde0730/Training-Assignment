**Query:** Total number of shipments in January 2022 first quarter:
 - Business Problem:
   Logistics managers want to see how many shipments went out at the start of 2022. This helps assess shipping volumes and plan for post-holiday periods.
   
**Query cost**: 5500

**Solution:** 
```sql
with shipments1 as (
    select 
        shipment_id,
        created_date,
        origin_facility_id,
        status_id
    from 
        shipment
    where 
        status_id = 'shipment_shipped'
        and created_date >= '2022-01-01'
        and created_date < '2022-02-01'
)
select 
    'overall' as category, 
    null as shipment_id, 
    null as created_date, 
    null as origin_facility_id, 
    null as order_id, 
    sum(case when created_date >= '2022-01-01' and created_date < '2022-02-01' then 1 else 0 end) as jan_2022_shipments
from 
    shipments1
union all
select 
    'details' as category, 
    fs.shipment_id, 
    fs.created_date, 
    fs.origin_facility_id, 
    os.order_id, 
    null as jan_2022_shipments
from 
    shipments1 s1
join 
    order_shipment os on s1.shipment_id = os.shipment_id;


