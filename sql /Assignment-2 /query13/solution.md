**Query:** Fetch the following details for orders completed in August of 2023.
- PRODUCT_ID
- PRODUCT_TYPE_ID
- PRODUCT_STORE_ID 
- TOTAL_QUANTITY
- INTERNAL_NAME 
- FACILITY_ID
- EXTERNAL_ID 
- FACILITY_TYPE_ID 
- ORDER_HISTORY_ID 
- ORDER_ID
- ORDER_ITEM_SEQ_ID
- SHIP_GROUP_SEQ_ID

**Query cost**: 188763.6

**Solution:**
```sql
select 
    p.PRODUCT_ID,
    p.PRODUCT_TYPE_ID,
    oh.PRODUCT_STORE_ID,
    oi.QUANTITY,
    p.INTERNAL_NAME,
    f.FACILITY_ID,
    oh.EXTERNAL_ID,
    f.FACILITY_TYPE_ID,
    oh2.ORDER_HISTORY_ID,
    oh2.ORDER_ID,
    oh2.ORDER_ITEM_SEQ_ID,
    oh2.SHIP_GROUP_SEQ_ID
from 
    product p 
join 
    order_item oi 
    on p.PRODUCT_ID = oi.PRODUCT_ID
join
    order_header oh 
    on oh.ORDER_ID = oi.ORDER_ID
    and oh.STATUS_ID = 'order_completed'
    and oh.ORDER_DATE between '2023-08-01' and '2023-08-31'
join 
    order_item_ship_group oisg 
    on oisg.ORDER_ID = oh.ORDER_ID
join
    facility f 
    on f.FACILITY_ID  = oisg.FACILITY_ID
join 
    order_history oh2 
    on oh2.ORDER_ID = oh.ORDER_ID
```
**Query cost**: 642968.91

**Solution:**
```sql
select p.PRODUCT_ID,
     p.PRODUCT_TYPE_ID,
     oh.PRODUCT_STORE_ID,
     oi.QUANTITY,
     p.INTERNAL_NAME,
     f.FACILITY_ID,
     oh.EXTERNAL_ID,
     f.FACILITY_TYPE_ID,
     oh2.ORDER_HISTORY_ID,
     oh2.ORDER_ID,
     oh2.ORDER_ITEM_SEQ_ID,
     oisg.SHIP_GROUP_SEQ_ID
from 
     product p 
join 
     order_item oi on p.PRODUCT_ID = oi.PRODUCT_ID
join 
	 order_header oh on oh.ORDER_ID = oi.ORDER_ID
join 
	 order_item_ship_group oisg on oisg.ORDER_ID = oh.ORDER_ID
join 
	 facility f on f.FACILITY_ID  = oisg.FACILITY_ID
join 
	 order_history oh2 on oh2.ORDER_ID = oh.ORDER_ID
where oh.STATUS_ID = 'order_completed' 
and month(oh.ORDER_DATE) = 08 
and year(oh.ORDER_DATE) = 2023;
