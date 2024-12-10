**Optimizing SQL Joins: Filtering in ON Clause vs WHERE Clause**

**First- Query**:

**Example**:
```sql
JOIN
  return_item ri
  ON rh.RETURN_ID = ri.RETURN_ID
  AND rh.RETURN_CHANNEL_ENUM_ID = 'ecom_rtn_channel';
```
- All tables are joined first, and then filtering (conditions) is applied using the WHERE clause.
  - Problem:
     - The database processes all the records first (from all tables) and then removes the extra ones that don’t match the WHERE 
       conditions.
- This makes the process slow because it handles a lot of unnecessary data before filtering.
- Cost: 20091.36 (high because it processes too much data).

**Second- Query**:

**Example**:
```sql
JOIN
  return_item ri 
  ON rh.RETURN_ID = ri.RETURN_ID
  AND rh.RETURN_CHANNEL_ENUM_ID = 'ecom_rtn_channel';
```
- Filtering is added directly in the ON condition when joining the tables.
  - Example: Only join return_item if RETURN_CHANNEL_ENUM_ID = 'ecom_rtn_channel'.
  - Benefit:
    - The database filters out unwanted data while joining the tables.
    - This reduces the amount of data being processed, making it faster.
- Cost: 900.72 (low because it processes only the required data).

**Key Difference:**
- First Query:
  - Joins everything first, then filters → **Slow and costly**.
- Second Query:
  - Filters while joining → **Fast and cheaper**.

**Tutorial to learn about query-optimization**: 
[Query-optimization](https://www.google.com/search?sca_esv=3b91e47ab754cb87&q=execution+flow+of+date+function+in+sql+with+diagram&udm=7&fbs=AEQNm0Aa4sjWe7Rqy32pFwRj0UkWd8nbOJfsBGGB5IQQO6L3J9LTkYkTMsFy3KExiuH6ofO9k4fklbg-dHv8qWa0fUb_b9pU6N0PYQYkHPJveIzUCnC9Ko6wTULCndh2ijbl5espd1t1e8fieAki5GcIWTKxx9GdNXufsU0l4Hg-1cY-eKoSXFBG9lse2O1_02qeMe67fULN9iDwZZv1jIEvIv4Xdzp9mg&sa=X&ved=2ahUKEwjowqb2ypyKAxUEsVYBHZCbIycQtKgLegQIFxAB&biw=1366&bih=649&dpr=1#fpstate=ive&vld=cid:3b15740b,vid:t2R0-xcKw44,st:0)


