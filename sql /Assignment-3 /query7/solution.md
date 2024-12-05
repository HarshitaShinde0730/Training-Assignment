**Query:** On a city-wise basis, what is the analysis of returns?

**Query-cost**: 40.18

**Solution**:
```sql
select 
    pa.CITY,
    count(rcm.RETURN_ID),
    ri.RETURN_REASON_ID 
from 
    return_contact_mech rcm
join 
    postal_address pa 
    on rcm.CONTACT_MECH_ID = pa.CONTACT_MECH_ID 
join 
    return_item ri 
    on rcm.RETURN_ID = ri.RETURN_ID 
group by 
     pa.CITY
```
**Query_cost:** 61.23

**Solution** 
```sql
select pa.CITY,
       count(rcm.RETURN_ID),
       rr.DESCRIPTION,
       rr.RETURN_REASON_ID 
from 
     return_contact_mech rcm
join 
     postal_address pa 
on 
   rcm.CONTACT_MECH_ID = pa.CONTACT_MECH_ID 
join 
    return_item ri 
on 
   rcm.RETURN_ID = ri.RETURN_ID 
join 
    return_reason rr 
on 
   rr.RETURN_REASON_ID = ri.RETURN_REASON_ID 
group by 
     pa.CITY 
