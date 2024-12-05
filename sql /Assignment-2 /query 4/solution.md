**Query:** Fetch the following columns for created orders. These should be sales orders.
- ORDER_ID
- TOTAL_AMOUNT
- PAYMENT_METHOD
- SHOPIFY_ORDER_NAME
  
**NOTE:** 
- The total amount represents the total amount of the order.
- The payment method is the method by which payment was made, like Cash, mastercard, visa, paypal, etc.

**Query-cost:** 2250.39

**Optimize-Solution:**
```sql
SELECT
      oh.ORDER_ID,
      oh.GRAND_TOTAL AS TOTAL_AMOUNT,
      opp.PAYMENT_METHOD_TYPE_ID AS PAYMENT_METHOD,
      oi.ORDER_IDENTIFICATION_TYPE_ID AS SHOPIFY_ORDER_NAME
FROM
     order_header oh
JOIN
     order_identification oi 
     ON oh.ORDER_ID = oi.ORDER_ID
     AND oi.ORDER_IDENTIFICATION_TYPE_ID = 'shopify_ord_name'
JOIN
     order_payment_preference opp 
     ON opp.ORDER_ID = oh.ORDER_ID
WHERE
     oh.STATUS_ID = 'order_created'
     AND  
     oh.ORDER_TYPE_ID = 'sales_order'
GROUP BY 
    ORDER_ID;
```
**Query-cost:** 3096.51

**Solution:**
```sql 
select
      oh.ORDER_ID,
      oh.GRAND_TOTAL AS TOTAL_AMOUNT,
      opp.PAYMENT_METHOD_TYPE_ID AS PAYMENT_METHOD,
      oi.ORDER_IDENTIFICATION_TYPE_ID AS SHOPIFY_ORDER_NAME
from
     order_header oh
join
     order_identification oi on oh.ORDER_ID = oi.ORDER_ID
join
     order_payment_preference opp on opp.ORDER_ID = oh.ORDER_ID
where
     oh.STATUS_ID = 'order_created'
and  
    oh.ORDER_TYPE_ID = 'sales_order'
and  
    oi.ORDER_IDENTIFICATION_TYPE_ID = 'shopify_ord_name'
group by 
    ORDER_ID;
``` 
