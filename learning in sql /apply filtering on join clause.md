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
[Query-optimization](https://www.youtube.com/watch?v=AFY3z4FwRg0)


