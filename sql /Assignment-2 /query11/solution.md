**Query:** Fetch all the customers created in June 2023.

**Query cost**: 3484.5

**Solution:**

```sql
select
   *
from 
   party p
where 
  month (p.CREATED_DATE) = 06;
