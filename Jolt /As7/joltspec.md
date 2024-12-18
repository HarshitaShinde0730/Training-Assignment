**INPUT JSON**:
```json
{
  "students": [
    {
      "name": "John Doe",
      "age": 23,
      "email": "john.doe@example.com"
    },
    {
      "name": "Jane Smith",
      "age": 25,
      "email": "jane.smith@example.com"
    }
  ]
}
```

**JOLT SPEC**:
```json
[
  {
    "operation": "shift",
    "spec": {
      "students": {
        "*": {
          "name": "[&1].Name",
          "age": "[&1].Age",
          "email": "[&1].email"
        }
      }
    }
  },
  {
    "operation": "modify-overwrite-beta",
    "spec": {
      "*": {
        "Domain1": "=split(@(1,email), '@example.com')"
      }
    }
  },
  {
    "operation": "modify-overwrite-beta",
    "spec": {
      "*": {
        "Domain": "=firstElement(@(1,Domain1))"
      }
    }
  },
  {
    "operation": "remove",
    "spec": {
      "*": {
        "email": "",
        "Domain1": ""
      }
    }
  }
]
```

**OUTPUT JSON**:
```json
[  {   
        "Name": "John Doe",   
        "Age": 23,  
        "Domain": "example.com" 
    },  
    {   
        "Name": "Jane Smith", 
        "Age": 25,   
        "Domain": "example.com" 
    }
]
```
