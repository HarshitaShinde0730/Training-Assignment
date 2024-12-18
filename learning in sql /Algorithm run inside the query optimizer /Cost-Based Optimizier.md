## Cost Based Optimization: 
cost-based optimization (CBO) is an integral part of many modern SQL query optimizers, and it plays a key role in rule engines that evaluate and execute SQL queries. It enables services to create the most efficient execution plan for the SQL query. The cost-based optimizer uses metadata and statistics to estimate the amount of processing (memory, CPU, network traffic, and I/O) required for each operation. It compares the cost of alternative routes and then selects the query execution plan with the least cost.

### How cost-based optimization works:-
**Search space generation** ➡️ **Cardinality Estimation** ➡️ **Cost Estimation** ➡️ **Plan Pruning** ➡️ **Plan Selection** 

**1. Search Space Generation**:- Dynamic programming or memoization is often used in cost-based optimization to encode the search space efficiently.

- **Dynamic Programming**:-

  - Decompose the query:
    - Break it into smaller units and the join condition.
  - Generate all possible execution plans for each subquery:
    - Scanning  Table scan, Index scan.
    - Joining: Nested loop join, Hash join, Merge join.

- **Genetic Algorithms**:-

  - Generate a set of execution plans.
  - Use a fitness value.
  - Based on cost evaluate plans.

**Fitness Value**:-

*Fitness value = I/O Cost + CPU Cost + Memory Cost + Network Cost.*

**2. Cardinality Estimation**:- Cardinality is known to be the number of rows that are returned by performing the operations specified by the query execution plan.

- **Histogram**:- 

  - Used on Column to estimate the filter selectivity.

- **Selectivity calculation**:-

   - Selectivity refers to the number of rows that are selected. The selectivity of any row from the table or any table from 
     the database almost depends upon the condition.

- **Join Cardinality**:-

  - Estimate rows produced by the join.
  - "ROW FROM TABLE 1 * ROW FROM TABLE 2 * JOIN SELECTIVITY".

**3. Cost Estimation**:- Calculate the cost of each plan based on resources used.

- **Access cost**:-

   - Cost of accessing data from the table:
     - Full table scan.
     - Index range scan

- **Join Cost**:-

   - Cost of different join algorithms.
     - Nested Loop Join.
     - Merge Join / Sort Merge Join.
     - Hash Join.

- **Sorting cost**:-

  - Cost of using group by and order by.

- **Total cost**:-

  - Fitness value calculation for each plan.
 
**4. Plan Pruning**:- Reduce search space plan (All possible solutions) by calculation the expensive cost and infeasible 
  plan.

- **Branch-and-Bound**:
  - Discard plans with costs exceeding the best-known plan.

- **Rule-Based Heuristics**:
  - Eliminate plans that violate simple rules, such as selecting full table scans if the index is available.

**5. Final Plan**:
  
  - Among all the execution plans select the lowest cost plan and optimal solution.

#### Image:

![alt text](https://github.com/HarshitaShinde0730/Training-Assignment/blob/main/learning%20in%20sql%20/images/Screenshot%20from%202024-12-18%2010-28-34.png)

###### Note: [Learn](https://www.querifylabs.com/blog/what-is-cost-based-optimization)
COST-BASED OPTIMIZATION IS NOT AN ALGORITHM ITSELF BUT IT IS A METHOD WITHIN AN SQL SERVER THAT LEVERAGES MULTIPLE ALGORITHMS, INCLUDING SEARCH, ESTIMATION, AND PRUNING TECHNIQUES.






