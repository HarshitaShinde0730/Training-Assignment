**Query:** Fetch the following columns for completed return items of SM_STORE for ecom return channel.
- RETURN_ID 
- ORDER_ID
- PRODUCT_STORE_ID 
- STATUS_DATETIME
- ORDER_NAME 
- FROM_PARTY_ID 
- RETURN_DATE 
- ENTRY_DATE
- RETURN_CHANNEL_ENUM_ID

**Query-cost**: 900.72

**Optimize-solution**:
```sql
SELECT
    ri.RETURN_ID,
    ri.ORDER_ID,
    oh.PRODUCT_STORE_ID,
    rs.STATUS_DATETIME,
    oh.ORDER_NAME,
    rh.FROM_PARTY_ID,
    rh.RETURN_DATE,
    rh.ENTRY_DATE,
    rh.RETURN_CHANNEL_ENUM_ID
FROM 
     return_header rh 
JOIN 
     return_item ri 
     ON rh.RETURN_ID = ri.RETURN_ID
     AND rh.RETURN_CHANNEL_ENUM_ID = 'ecom_rtn_channel'
JOIN 
     order_header oh 
     ON ri.ORDER_ID = oh.ORDER_ID
     AND oh.PRODUCT_STORE_ID = 'SM_STORE'
JOIN 
     return_status rs 
     ON rh.RETURN_ID = rs.RETURN_ID 
     AND ri.RETURN_ITEM_SEQ_ID = rs.RETURN_ITEM_SEQ_ID 
     AND rs.STATUS_ID = 'return_completed';
```
**Query-cost:** 20091.36

**Solution1:**
```sql
select 
    ri.RETURN_ID,
    ri.ORDER_ID,
    oh.PRODUCT_STORE_ID,
    rs.STATUS_DATETIME,
    oh.ORDER_NAME,
    rh.FROM_PARTY_ID,
    rh.RETURN_DATE,
    rh.ENTRY_DATE,
    rh.RETURN_CHANNEL_ENUM_ID
from 
     return_header rh 
join 
     return_item ri on rh.RETURN_ID = ri.RETURN_ID
join 
     order_header oh on ri.ORDER_ID = oh.ORDER_ID
join 
     return_status rs on rh.STATUS_ID = rs.STATUS_ID
where 
     ri.STATUS_ID = 'return_completed' 
and 
     oh.PRODUCT_STORE_ID = 'sm_store' 
and 
     rh.RETURN_CHANNEL_ENUM_ID = 'ecom_rtn_channel';
```
