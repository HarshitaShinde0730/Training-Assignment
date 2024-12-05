**Query:** Fetch the following columns for completed order items for sales orders of SM_STORE product store and that are physical items.
- ORDER_ID
- ORDER_ITEM_SEQ_ID
- PRODUCT_ID
- PRODUCT_TYPE_ID
- IS_PHYSICAL
- IS_DIGITAL
- SALES_CHANNEL_ENUM_ID
- ORDER_DATE
- ENTRY_DATE
- STATUS_ID
- STATUS_DATETIME
- ORDER_TYPE_ID
- PRODUCT_STORE_ID 

**Query-cost:** 70053.26

**Solution** 
```sql
SELECT 
    oh.ORDER_ID,
    oi.ORDER_ITEM_SEQ_ID,
    p.PRODUCT_ID,
    oh.SALES_CHANNEL_ENUM_ID,
    oh.ORDER_DATE,
    oh.ENTRY_DATE,
    oh.STATUS_ID AS ORDER_STATUS_ID,
    oi.STATUS_ID AS ITEM_STATUS_ID,
    oh.ORDER_TYPE_ID,
    os.STATUS_DATETIME,
    oh.PRODUCT_STORE_ID
FROM
    order_header oh
JOIN
    order_item oi 
    ON oh.ORDER_ID = oi.ORDER_ID
JOIN
    product p 
    ON p.PRODUCT_ID = oi.PRODUCT_ID
JOIN 
    order_status os 
    ON oh.ORDER_ID = os.ORDER_ID
WHERE
    oh.PRODUCT_STORE_ID = 'SM_STORE' 
    AND oi.STATUS_ID = 'ITEM_COMPLETED'
    AND oh.ORDER_TYPE_ID = 'SALES_ORDER' 
    AND EXISTS (
        SELECT 1
        FROM product_type pt
        WHERE pt.PRODUCT_TYPE_ID = p.PRODUCT_TYPE_ID
          AND pt.IS_PHYSICAL = 'Y'
);
