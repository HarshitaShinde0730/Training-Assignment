**Query**: Orders completed hourly:
  - Analyze and present the distribution of completed orders on an hourly basis.

**Query-cost**: 12800.6

**solution**:
```sql
select
  os.ORDER_ID as completed_order,
  date_format(os.STATUS_DATETIME , '%Y-%m-%d')as order_date,
  hour(os.STATUS_DATETIME) as hour_of_day
from
  order_status os
where 
  os.STATUS_ID = 'order_completed'
group by 
  os.STATUS_DATETIME
order by 
  order_date;


