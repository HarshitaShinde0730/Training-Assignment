**Another interesting topic in SQL Learning is why and when to use** **Select*** **and select table_name.*** **in SQL**:

**Select table_name.***:
If we are joining multiple tables then in this case this statement only fetches all the columns of the table that are specifically mentioned with the select statement.

###### For example:
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
**Select***: If we are joining multiple tables then in this case this statement selects all the columns of tables that are joined.

###### For example:
```sql
select
   *
from 
   party p
join 
   party_status ps 
   on p.PARTY_ID = ps.PARTY_ID
   and ps.STATUS_ID = 'party_enabled'
where 
   p.CREATED_TX_STAMP between '2023-06-01' and '2023-06-30';
```
**NOTE**: It only optimizes the execution time of the query.



