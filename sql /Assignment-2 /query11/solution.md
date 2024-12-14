**Query:** Fetch all the customers created in June 2023.

**Query-cost**: 16.28

**Updated-Query**:
```sql
select
   p.*
from 
   party p
join 
   party_status ps 
   on p.PARTY_ID = ps.PARTY_ID
   and ps.STATUS_ID = 'party_enabled'
where 
  p.CREATED_TX_STAMP between '2023-06-01' and '2023-06-30';
```
**Query cost**: 3484.5

**Solution:**

```sql
select
   *
from 
   party p
where 
  month (p.CREATED_DATE) = 06;
