**Query:**  Average Shipments per Month (Q1 2022)
 - Business Problem:
   Operations wants to find the average number of shipments from all stores for each month in Q1 2022 (January, February, March).
   **Fields to Retrieve:**
   - MONTH 
   - AVERAGE_SHIPMENTS
   
**Query cost**: 8844.71

**Solution:** 
```sql
select 
    month(s.created_date) as month,
    avg(count(s.shipment_id)) over (partition by month(s.created_date)) as avg_shipments
from
    shipment s
where 
    s.created_date between '2022-01-01' and '2022-03-31'
group by 
    month(s.created_date);
