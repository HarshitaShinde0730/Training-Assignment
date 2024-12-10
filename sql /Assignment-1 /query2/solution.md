**Query:** Shipment by Tracking number:
  - View or analyze shipments based on their unique tracking numbers. Each shipment is identified and tracked using a specific tracking number.

**Query cost**: 17216.45

**Solution**:
```sql
select 
   srs.SHIPMENT_ID,
   srs.TRACKING_ID_NUMBER,
   s.SHIPMENT_ID
from 
   shipment_route_segment srs 
join 
   shipment s on srs.SHIPMENT_ID = s.SHIPMENT_ID 
   and srs.TRACKING_ID_NUMBER is not null;
