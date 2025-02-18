**1.INPUT JSON**
```json
{
  "employees": [
    {
      "name": "John",
      "age": 30,
      "salary": 5000
    },
    {
      "name": "Jane",
      "age": 35,
      "salary": 6000
    },
    {
      "name": "Bob",
      "age": 40,
      "salary": 7000
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
      "employees": {
        "*": {
          "name": "employees.[&1].name",
          "age": "employees.[&1].age",
          "salary": {
            "5000": {
              "#5500": "employees.[#4].salary"
            },
            "6000": {
              "#6600": "employees.[#4].salary"
            },
            "7000": {
              "#7700": "employees.[#4].salary"
            }
          }
        }
      }
    }
  }
]
```
**OUTPUT JSON**:
```json
{
  "employees" : [ {
    "name" : "John",
    "age" : 30,
    "salary" : "5500"
  }, {
    "name" : "Jane",
    "age" : 35,
    "salary" : "6600"
  }, {
    "name" : "Bob",
    "age" : 40,
    "salary" : "7700"
  } ]
}
```


