**Query:** Average number of shipments per month:	
- Calculate the average number of shipments made per month by dividing the total number of shipments by the number of months.

**Query cost**: 21262.20

**Solution**:
```sql
SELECT
   MAX(CREATED_DATE) Maximum_date,
   MIN(CREATED_DATE) minimum_date,
   COUNT(SHIPMENT_ID) / (TIMESTAMPDIFF(MONTH,MIN(CREATED_DATE), MAX(CREATED_DATE)) + 1) AS "avg_shipment"
FROM
   shipment s;
