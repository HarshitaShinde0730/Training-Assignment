**Query:** Fetch all the physical items ordered in the month of September 2023.

**Query cost**: 16352.91

**Solution:**
```sql
select 
     oh.ORDER_ID ,
     oi.ORDER_ITEM_SEQ_ID ,
     pt.IS_PHYSICAL,
     oi.STATUS_ID,
     oh.ENTRY_DATE
from
     product_type pt
join  
     product p on pt.PRODUCT_TYPE_ID = p.PRODUCT_TYPE_ID
join
	 order_item oi on oi.PRODUCT_ID = p.PRODUCT_ID
join 
     order_header oh on  oh.ORDER_ID = oi.ORDER_ID
where 
      IS_PHYSICAL = 'Y'
and  
     oi.STATUS_ID = 'item_created'
and 
    oh.ORDER_DATE between  '2023-09-01' and '2023-09-30'
