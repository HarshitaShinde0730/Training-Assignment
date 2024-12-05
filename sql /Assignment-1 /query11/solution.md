**Query**: Orders completed hourly:
  - Analyze and present the distribution of completed orders on an hourly basis.

**Query-cost**:

**solution**:
```sql
select 
       os.ORDER_ID as completed_order,
       date_format(os.STATUS_DATETIME , '%Y-%m-%d') AS order_date,
       HOUR(os.STATUS_DATETIME) AS hour_of_day
from
      order_status os
where 
      os.STATUS_ID = 'order_completed'
group by 
      os.STATUS_DATETIME
order by 
        order_date;

