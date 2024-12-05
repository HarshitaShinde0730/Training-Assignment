**Query**: Send sale orders shipped from the warehouse:
   - Identify send sale orders that have been shipped from the warehouse.\

**Query-cost**: 4230.09

**Solution**:
```sql
select 
       oh.ORDER_ID as Send_sale_order
from 
     order_header oh
join
    order_shipment os on oh.ORDER_ID = os.ORDER_ID
join
   shipment s on os.SHIPMENT_ID = s.SHIPMENT_ID
join
      facility f on f.FACILITY_ID  = s.ORIGIN_FACILITY_ID 
join 
     facility_type ft on ft.FACILITY_TYPE_ID = f.FACILITY_TYPE_ID
where 
      (s.SHIPMENT_METHOD_TYPE_ID = 'standard' and oh.SALES_CHANNEL_ENUM_ID = 'pos_sales_channel')
and 
    ft.PARENT_TYPE_ID = 'distribution_center' and s.STATUS_ID = 'shipment_shipped'

