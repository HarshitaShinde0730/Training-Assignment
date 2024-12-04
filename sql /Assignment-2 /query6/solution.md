**Query:** Fetch all the physical items completed from Warehouse in September of 2023.
- ORDER_ID
- ORDER_ITEM_SEQ_ID
- PRODUCT_ID
- QUANTITY
- FACILITY_ID
- SHIP_GROUP_SEQ_ID
- ORDER_STATUS
- STATUS_DATETIME

**Query cost**: 25877401.35

**Solution:** 
```sql
select 
    oi.ORDER_ID, 
    oi.ORDER_ITEM_SEQ_ID,
    p.PRODUCT_ID,
    oi.QUANTITY,
    f.FACILITY_ID,
    oisg.SHIP_GROUP_SEQ_ID,
    os.STATUS_ID,
    os.STATUS_DATETIME
from
     product p
join 
    product_type pt on pt.PRODUCT_TYPE_ID = p.PRODUCT_TYPE_ID
join 
    order_item oi on oi.PRODUCT_ID = p.PRODUCT_ID
join 
    order_status os on oi.STATUS_ID = 'item_completed'
join 
    order_item_ship_group oisg on oisg.ORDER_ID = oi.ORDER_ID
join 
    facility f on f.FACILITY_ID = oisg.FACILITY_ID
where 
     pt.IS_PHYSICAL = 'Y'
and 
     f.FACILITY_TYPE_ID in (
          select 
               ft.FACILITY_TYPE_ID
      from 
             facility_type ft 
      where 
      		ft.parent_type_id = 'distribution_center'
)
and os.STATUS_DATETIME between '2023-09-01' and '2023-09-30';
