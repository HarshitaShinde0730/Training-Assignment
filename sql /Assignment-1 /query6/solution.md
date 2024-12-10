**Query**: Total $ value of shipments shipped from facility 904/906 to first quarter:
  - Calculate the total monetary value of shipments that originated from facilities 904 and 906 during the first quarter.

**Query-cost**: 2869.15

**Updated-Solution**: 
```sql
select
   sum(oh.grand_total) as _$_VALUE,
   sum(oi.UNIT_PRICE * oi.QUANTITY) as Total_value
from
   order_header oh
join 
   order_item oi 
   on oh.ORDER_ID = oi.ORDER_ID 
join 
   order_shipment os 
   on oh.ORDER_ID = os.ORDER_ID
join 
   shipment s 
   on os.SHIPMENT_ID = s.SHIPMENT_ID
   and s.CREATED_DATE between '2024-01-01' and '2024-03-31'
   and s.STATUS_ID = 'SHIPMENT_SHIPPED'
join 
   order_item_ship_group oisg 
   on oh.ORDER_ID = oisg.ORDER_ID
join 
   facility f 
   on f.FACILITY_ID = oisg.FACILITY_ID
   and f.FACILITY_ID in ('904', '906')
join 
   order_payment_preference opp  
   on opp.ORDER_ID = oh.ORDER_ID
   and opp.STATUS_ID = 'payment_settled'
```
**Query-cost**: 2914.13

**Solution**: 
```sql
select
   SUM(oh.grand_total) AS _$_VALUE,
   sum(oi.UNIT_PRICE * oi.QUANTITY) as Total_value
from
     order_header oh
join 
      order_item oi on oh.ORDER_ID = oi.ORDER_ID 
join 
      order_shipment os on oh.ORDER_ID = os.ORDER_ID
join 
      shipment s on os.SHIPMENT_ID = s.SHIPMENT_ID
join 
      order_item_ship_group oisg on oh.ORDER_ID = oisg.ORDER_ID
join 
       facility f on f.FACILITY_ID = oisg.FACILITY_ID
join 
       order_payment_preference opp  on opp.ORDER_ID = oh.ORDER_ID 
where
   f.FACILITY_ID IN ('904', '906') and opp.STATUS_ID = 'payment_settled'
   AND s.CREATED_DATE BETWEEN '2024-01-01' AND '2024-03-31'
   and s.STATUS_ID = 'SHIPMENT_SHIPPED';
