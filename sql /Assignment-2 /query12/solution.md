**Query:** Get all the appeasements in July month.
- How do we differentiate between returns and appeasements?
  - Returns: Typically involves goods being returned by the customer. Returns focus on reversing the transaction for a specific product or order.
  - Appeasement : 
               Appeasements are compensations or discounts given to customers to make up for a problem or inconvenience they faced, without requiring them to return the product.
  - For example:
     - If a customer receives a damaged item and decides to keep it, the company might offer a partial refund or discount as an appeasement.
     - If there's a delay in delivery, the company might offer a voucher or credit to apologize.


**Query cost**: 194.71

**Solution:**
```sql
select 
       rh.RETURN_ID,
       rh.ENTRY_DATE,
       ra.RETURN_TYPE_ID ,
       ra.AMOUNT,
       ra.COMMENTS,
       ra.ORDER_ID,
       oh.ORDER_DATE,
       rh.RETURN_DATE,
       oh.PRODUCT_STORE_ID
from 
     return_header rh 
join 
     return_adjustment ra 
     on rh.RETURN_ID = ra.RETURN_ID 
     and ra.RETURN_ADJUSTMENT_TYPE_ID = 'APPEASEMENT'
join 
     order_header oh 
     on oh.ORDER_ID = ra.ORDER_ID
where 
     rh.RETURN_DATE between '2023-07-01' and '2023-07-31';
```
**Query cost**: 3877315.01

**Solution:**
```sql
select 
       ri.RETURN_ID,
       rh.ENTRY_DATE,
       ra.RETURN_TYPE_ID ,
       ra.AMOUNT,
       ra.COMMENTS,
       ri.ORDER_ID,
       oh.ORDER_DATE,
       rh.RETURN_DATE,
       oh.PRODUCT_STORE_ID
from 
     return_header rh 
join 
     return_item ri on rh.RETURN_ID = ri.RETURN_ID
join 
     return_adjustment ra on ra.RETURN_ADJUSTMENT_TYPE_ID = 'APPEASEMENT'
join 
     return_adjustment_type rat on rat.RETURN_ADJUSTMENT_TYPE_ID = ra.RETURN_ADJUSTMENT_TYPE_ID
join 
     order_header oh on oh.ORDER_ID = ri.ORDER_ID
where 
       month(rh.RETURN_DATE) = 07 
and 
     year(rh.RETURN_DATE) = 2023
