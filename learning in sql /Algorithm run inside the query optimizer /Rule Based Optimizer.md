## Rule Based Optimization: 
A Rule-Based Optimizer (RBO) is an approach to query optimization in database management systems where a set of predefined rules is used to determine the best execution plan for a query. These rules are based on heuristic methods and are designed to improve query performance without requiring detailed information about the data distribution or table statistics.

### How rule-based optimization works:-
**Predefined Rules** ➡️ **Static Cost Model** ➡️ **Execution Plan Selection** ➡️ **Query Transformation**  

**1. Predefined Rules**:

- The optimizer uses a set of heuristics or "rules of thumb" to decide on query execution plans.
- These rules prioritize specific actions, such as preferring indexed scans over full table scans or executing filters early 
  to reduce data size.

**2. Static Cost Model:**

- The rules are static and do not adapt to changing data distributions or system conditions.
- No cost estimation based on runtime statistics is involved.

**3. Execution Plan Selection:**

- The optimizer evaluates the SQL query and applies the rules in a hierarchical manner.
- For example, rules might dictate:
  - Apply filters before joins.
  - Use indexes wherever possible.
  - Avoid sorting operations unless necessary.

**4. Query Transformation:**

- The RBO may rewrite the query into an equivalent form that aligns better with the rules, potentially making the query easier to execute.

###### Note: [Learn-1](https://celerdata.com/glossary/rule-based-optimizer)
RULE-BASED OPTIMIZATION IS NOT AN ALGORITHM ITSELF BUT IT IS A METHOD WITHIN AN SQL SERVER.







