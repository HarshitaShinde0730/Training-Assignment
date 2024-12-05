**Query:** Fetch the following data for completed order items in July of 2023
- ORDER_ID
- ORDER_ITEM_SEQ_ID
- SHOPIFY_ORDER_ID
- SHOPIFY_PRODUCT_ID

**Query-cost:** 58308.52

**Optimize-Solution:**
```sql
select oi.ORDER_ID,
      oi.ORDER_ITEM_SEQ_ID,
      oi2.ORDER_IDENTIFICATION_TYPE_ID as shopify_order_id,
      gi.GOOD_IDENTIFICATION_TYPE_ID as shopify_product_id
from 
     order_item oi 
join 
     order_identification oi2 
     on oi.ORDER_ID = oi2.ORDER_ID
     and oi2.ORDER_IDENTIFICATION_TYPE_ID = 'shopify_ord_id'
join 
     order_status os 
     on oi.ORDER_ID = os.ORDER_ID 
     and os.STATUS_ID = 'item_completed'
join 
     good_identification gi 
     on gi.PRODUCT_ID = oi.PRODUCT_ID
     and gi.GOOD_IDENTIFICATION_TYPE_ID = 'shopify_prod_id'
where 
	(os.STATUS_DATETIME between "2023-07-01" and "2023-07-31")
group by 
     oi.ORDER_ID;
```

**Query-cost:** 195730.12

**Solution1:**
```sql
select oi.ORDER_ID,
      oi.ORDER_ITEM_SEQ_ID,
      oi2.ORDER_IDENTIFICATION_TYPE_ID as shopify_order_id,
      gi.GOOD_IDENTIFICATION_TYPE_ID as shopify_product_id
from 
     order_item oi 
join 
     order_identification oi2 on oi.ORDER_ID = oi2.ORDER_ID
join 
     good_identification gi on gi.PRODUCT_ID = oi.PRODUCT_ID
where 
     oi2.ORDER_IDENTIFICATION_TYPE_ID = 'shopify_ord_id' 
and 
     gi.GOOD_IDENTIFICATION_TYPE_ID = 'shopify_prod_id'
group by 
     oi.ORDER_ID;
