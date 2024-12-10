**Query**: Shipping Refund in the last month:
  - Calculate the refunds issued specifically for shipping charges in the last month.

**Query-cost**: 927.35

**Solution**:
```sql
select 
  'shipping charge' as TOTAL_REFUND, 
   sum(ra.AMOUNT) AS REFUND,
   rh.RETURN_ID,
   ra.RETURN_ADJUSTMENT_TYPE_ID
from
   return_adjustment ra
join
   return_header rh 
   on rh.RETURN_ID = ra.RETURN_ID
   and rh.ENTRY_DATE >= curdate() - interval 1 month
where 
   rh.ENTRY_DATE >= curdate() - interval 1 month
group by  
   rh.RETURN_ID, ra.RETURN_ADJUSTMENT_TYPE_ID
union all
select 
  'total_refund' as TOTAL_REFUND, 
   sum(ra.AMOUNT) as REFUND,
   rh.RETURN_ID, 
   ra.RETURN_ADJUSTMENT_TYPE_ID
from 
   return_adjustment ra 
join 
   return_header rh 
   on ra.RETURN_ID = rh.RETURN_ID 
where 
   rh.ENTRY_DATE >= curdate() - interval 1 month;


