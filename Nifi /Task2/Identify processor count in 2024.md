### How to Identify and Track Processor Count in 2024:

**1. Step - 1:** I used NiFi API **ACCESS** to generate a Bearer Token

**2. Step - 2:** After generating the token, I hit the **FLOW** API with filtration parameters like startDate and endDate because I specifically needed the data for 2024

**3. Step - 3:** After hitting the API, the JSON data received was filtered to include only user_identity, source_name, and source_type where the value of source_type is 'processor', and this was done through JavaScript.

```javascript
const fs = require('fs');
const inputFilePath = '/home/harshita/egh.json';

const outputFilePath = '/home/harshita/filtered_egh.json';

fs.readFile(inputFilePath, 'utf8', (err, data) => {
    if (err) {
        console.error('Error reading file:', err);
        return;
    }
    try {
        const jsonData = JSON.parse(data);
        const actions = jsonData.history?.actions || [];

        const filteredActions = actions
            .map(action => action.action)
            .filter(action => action?.userIdentity?.includes('cn=') && action?.sourceType === 'Processor')
            .map(action => ({
                Source_id: action.sourceId,
                Source_name: action.sourceName,
                User_identity: action.userIdentity,
                Source_type: action.sourceType,
            }));
        fs.writeFile(outputFilePath, JSON.stringify(filteredActions, null, 4), 'utf8', err => {
            if (err) {
                console.error('Error writing file:', err);
                return;
            }
            console.log('Filtered JSON saved to', outputFilePath);
        });
    } catch (parseErr) {
        console.error('Error parsing JSON:', parseErr);
    }
});
```

**4. Step - 4:** Then, a flow was generated through NiFi in which the JSON data was converted into CSV.

**5. Step - 5:** Then, the CSV data received was modified through JavaScript to count the processors.

```javascript
const fs = require('fs');
const readline = require('readline');

const inputFilePath = '/home/harshita/output/Nifi.output.txt'; // Path to the .txt file
const outputFilePath = '/home/harshita/output/Nifio1.csv'; // Path to save the .csv file

const inputStream = fs.createReadStream(inputFilePath);
const outputStream = fs.createWriteStream(outputFilePath);
const rl = readline.createInterface({
  input: inputStream,
  output: outputStream,
  terminal: false
});

outputStream.write('user_identity,cn,processor_count\n');

let processorCount = {};

rl.on('line', (line) => {
 
  let modifiedLine = line.replace('user_identity=cn=user, dc=hotwax, dc=io', '');

  let user_identity = 'user_identity=' + modifiedLine;

  const cnMatch = modifiedLine.match(/cn=([a-zA-Z0-9_-]+)/);
  let cn = cnMatch ? cnMatch[1] : ''; // Extract the value of cn, or empty if not found

  const processors = modifiedLine.match(/processor\s+(\w+)/g); 
  if (processors) {
    processors.forEach((processor) => {
      const processorName = processor.split(' ')[1]; // Extract processor name
      processorCount[processorName] = (processorCount[processorName] || 0) + 1;
    });
  }

  outputStream.write(`${user_identity},${cn},${Object.keys(processorCount).length}\n`);
});

rl.on('close', () => {
  console.log('File converted to CSV successfully.');
  console.log('Processor Count:', processorCount);
});
```

**6. Step - 6:** Reviewed the CSV file and made the final submission.

