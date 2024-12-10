**PROBLEM: FETCH DATA FROM DATABASE USING SQL RECORD WHERE EACH FILE HAS A LIMIT OF 100 RECORDS AND IS PLACED IN A DIRECTORY SCHEDULED FOR EVERY 10 MIN.**

**SOLUTION:**

 I create a basic flow regarding this problem using the Nifi Processor:
 1. EXECUTE SQL RECORD.
 2. SPLIT RECORD.
 3. PUTFILE.

Why I choose EXECUTE SQL RECORD PROCESSOR:-

- we have more processors for fetching data from databases like QUERY DATABASE TABLE RECORD, EXECUTE SQL, etc.
- EXECUTE SQL RECORD converts the data into CSV, JSON, and many more formats the reason I chose EXECUTE SQL RECORD is to convert 
  data in JSON.
- In EXECUTE SQL RECORD create DatabaseConnectionPool service where I configure database to Nifi using JDBC Driver and Database 
  Connection Url.

Why I choose EXECUTE SQL RECORD PROCESSOR:-

- In this configuration, RECORD READER is set to be JSONTREEREADER to read JSON data.
- In this configuration, RECORD WRITER is set to be CSVSETWRITE to parse JSON data in CSV data.
- In this configuration, RECORDS PER SPLIT is set be 100.

Why I choose PUTFILE PROCESSOR:-

- PUTFILE PROCESSOR used to place Flow file in directory or any remote path.
- This processor is scheduled to be run every 10 min.
  
### PROCESSOR FLOWS ARE:-
 
EXECUTE SQL RECORD ➡️ SPLIT RECORD ➡️ PUTFILE PROCESSOR
-

  
  
