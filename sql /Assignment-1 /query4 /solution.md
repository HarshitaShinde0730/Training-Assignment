**Query:** Shipped units By Location:
 - Identify the number of units that have been shipped, categorized by different locations	;. Gain insights into the distribution of shipped units across various locations.

**Query cost**: 17227.82

**Solution**:
```sql
select
  f.FACILITY_NAME ,
  s.origin_facility_id AS location_id,
  SUM(si.quantity) AS shipped_units
FROM
  shipment s
JOIN
  shipment_item si ON s.shipment_id = si.shipment_id
join facility f on s.ORIGIN_FACILITY_ID =f.FACILITY_ID  
WHERE
  s.status_id = 'SHIPMENT_SHIPPED'
GROUP BY
  s.origin_facility_id
order by shipped_units desc;

