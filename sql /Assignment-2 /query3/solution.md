**Query:** Fetch the order id and contact mech id for the shipping address of the orders completed in October of 2023.

**Query-cost:** 20110.66

**Optimize-Solution:** 
```sql
SELECT
      oh.ORDER_ID,
      ocm.CONTACT_MECH_ID,
      os.STATUS_DATETIME 
FROM
     order_header oh
JOIN 
     order_contact_mech ocm 
     ON oh.ORDER_ID = ocm.ORDER_ID
     AND ocm.CONTACT_MECH_PURPOSE_TYPE_ID = 'SHIPPING_LOCATION'
JOIN
     order_status os 
     ON oh.ORDER_ID = os.ORDER_ID
     AND os.STATUS_ID = 'ORDER_COMPLETED'  
where
     (os.STATUS_DATETIME BETWEEN '2023-10-01' AND '2023-10-31');
```
**Query-cost:** 110731.46

**Solution1:** 
```sql
select 
      oh.ORDER_ID,
      ocm.CONTACT_MECH_ID
from 
     order_header oh
join 
     order_contact_mech ocm on oh.ORDER_ID = ocm.ORDER_ID
join 
     order_status os on  os.ORDER_ID = oh.ORDER_ID
where  
     ocm.CONTACT_MECH_PURPOSE_TYPE_ID = 'SHIPPING_LOCATION'
 and  
     oh.STATUS_ID = 'ORDER_COMPLETED'
 and  
     (os.STATUS_DATETIME between '2023-10-01' and '2023-10-31');
