**Query:** In New York, which product has the highest sales

**Query cost:** 

**Solution:**
```sql
select p.PRODUCT_ID,
      p.PRODUCT_NAME,
      pa.CITY ,
      sum(oi.QUANTITY) as TOTAL_SALE
from 
      order_item oi 
join 
     product p 
on 
    p.PRODUCT_ID = oi.PRODUCT_ID
Join 
    order_item_ship_group oisg 
on 
    oisg.ORDER_ID = oi.ORDER_ID
join 
     order_contact_mech ocm 
on 
    ocm.ORDER_ID = oi.ORDER_ID 
join 
     postal_address pa 
on
    pa.CONTACT_MECH_ID = ocm.CONTACT_MECH_ID
where
    pa.CITY = 'New york'
and 
    ocm.CONTACT_MECH_PURPOSE_TYPE_ID = 'BILLING_LOCATION'
group by 
    p.PRODUCT_ID
order by 
    TOTAL_SALE desc
limit 1;
