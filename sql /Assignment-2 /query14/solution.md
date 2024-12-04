**Query:** Fetch the inventory variances of the products where the reason is ‘VAR_LOST’ or VAR_DAMAGED.

**Query cost**: 446905.12

**Solution:**
```sql
select 
      ii.PRODUCT_ID,
      p.PRODUCT_ID,
      iid.REASON_ENUM_ID 
from 
     inventory_item ii 
join 
     product p on ii.PRODUCT_ID = p.PRODUCT_ID
join 
     inventory_item_detail iid on iid.INVENTORY_ITEM_ID = ii.INVENTORY_ITEM_ID
where 
      iid.REASON_ENUM_ID in ('VAR_LOST', 'VAR_DAMAGED');
