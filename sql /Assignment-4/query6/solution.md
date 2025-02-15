**Query:** Orders Shipped from Stores (25 Days Before New Year)
 - Business Problem: Retailers often run holiday promos in late December and need visibility into orders shipped from stores (as opposed to warehouses) for the final 25 days of the year.
 - Fields to Retrieve:
   - ORDER_ID 
   - SHIPMENT_ID 
   - FACILITY_ID (store ID)
   - SHIPMENT_DATE 
   - ORDER_DATE 
   - TOTAL_ITEMS 
   - CUSTOMER_STATE

**Query cost**: 35,917.66

**Solution:** 
```sql
select 
    oh.order_id,
    s.shipment_id,
    f.facility_id as store_id,
    s.created_date as shipment_date,
    oh.order_date,
    count(oi.order_item_seq_id) as total_items,
    pa.state_province_geo_id as customer_state
from 
    order_header oh
join 
    order_shipment os on oh.order_id = os.order_id
join 
    shipment s on os.shipment_id = s.shipment_id
join 
    order_item oi on oh.order_id = oi.order_id
join 
    order_item_ship_group oisg on oi.order_id = oisg.order_id and oi.ship_group_seq_id = oisg.ship_group_seq_id
join 
    facility f on oisg.facility_id = f.facility_id
join  
    facility_type ft on f.facility_type_id  = ft.facility_type_id 
join 
    order_role or2 on oh.order_id = or2.order_id 
join 
    party p on or2.party_id = p.party_id
join 
    party_contact_mech pcm on p.party_id = pcm.party_id
join 
    contact_mech cm on pcm.contact_mech_id = cm.contact_mech_id
join 
    postal_address pa on cm.contact_mech_id = pa.contact_mech_id
where
    ft.parent_type_id = 'physical_store'  
    and s.created_date between '2024-12-07' and '2024-12-31'
group by 
    oh.order_id, s.shipment_id, f.facility_id, s.created_date , oh.order_date, pa.state_province_geo_id;
