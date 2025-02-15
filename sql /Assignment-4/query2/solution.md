**Query:**  Shipments by Tracking Number
 - Business Problem:
   Customer Service often needs to look up shipments by tracking number to answer delivery queries quickly.
   
**Query cost**: 70731.55

**Solution:** 
```sql
select 
    s.ESTIMATED_SHIP_DATE as shipment_date,
    s.SHIPMENT_ID,
    os.ORDER_ID,
    srs.TRACKING_ID_NUMBER as tracking_number,
    csm.PARTY_ID  as carrier_party_id,
    s.STATUS_ID 
from
    shipment s 
join
    shipment_route_segment srs 
on
    s.SHIPMENT_ID = srs.SHIPMENT_ID 
join
    order_shipment os 
on 
    s.SHIPMENT_ID = os.SHIPMENT_ID  
join 
    shipment_method_type smt 
on
    smt.SHIPMENT_METHOD_TYPE_ID = srs.SHIPMENT_METHOD_TYPE_ID
join 
    carrier_shipment_method csm 
on 
    csm.SHIPMENT_METHOD_TYPE_ID = smt.SHIPMENT_METHOD_TYPE_ID 
where 
    srs.TRACKING_ID_NUMBER is not null
and 
    s.ESTIMATED_SHIP_DATE is not null	


	