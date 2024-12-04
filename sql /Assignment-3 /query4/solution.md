**Query:** What is the total number of orders originating from New York?

**Query cost:** 7,942.97

**Solution:**
```sql
select 
       count(distinct ocm.ORDER_ID)
from 
      order_contact_mech ocm
join 
      contact_mech cm 
on 
      ocm.CONTACT_MECH_ID = cm.CONTACT_MECH_ID 
join 
      postal_address pa 
on 
      cm.CONTACT_MECH_ID = pa.CONTACT_MECH_ID 
where 
      ocm.CONTACT_MECH_PURPOSE_TYPE_ID = 'BILLING_LOCATION'
and 
     pa.CITY = 'NEW YORK';
