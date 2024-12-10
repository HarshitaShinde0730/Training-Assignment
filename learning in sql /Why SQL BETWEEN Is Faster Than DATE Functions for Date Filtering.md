**The query using BETWEEN is less costly than the query using Date function in sql. Why?** 

**1. Use of Indexes**:

- BETWEEN:-
   - When you use BETWEEN, the query operates directly on the raw column.
   - If an index exists on the column, the database can quickly locate the relevant rows within the specified range. This 
     minimizes the number of rows scanned and improves performance.

- DATE FUNCTION:- 
  - The Date functions calculate values for every row in the table, even if an index exists on column where we apply Date 
    Function.
  - This effectively disables the index and forces a full table scan.
    Result: Higher query cost.

**2. Range Filtering vs. Row-by-Row Evaluation** :

- BETWEEN:-
  - Filters rows based on a continuous range in a single operation. The database doesn't need to calculate anything for each 
    row it just checks if the date is within the range.
  - This is highly efficient for large datasets.

- Date Functions:-
  - These functions extract parts of the column for every row in the table. This means the database must process each row 
    individually.

**Why BETWEEN Is Less Costly** :
- **Direct Access:** Operates directly on indexed columns.
- **No Computation:** Doesn't require function calls on every row.
- **Optimized Execution:** Designed for range-based filtering, which is faster for large datasets.
    




