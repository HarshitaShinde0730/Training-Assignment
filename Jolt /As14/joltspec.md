**1.INPUT JSON**
```json
{
  "employees": [
    {
      "id": "001",
      "name": "John",
      "department": "HR",
      "phone": [
        {
          "type": "home",
          "number": "555-555-1234"
        },
        {
          "type": "work",
          "number": "555-555-5678"
        }
      ]
    },
    {
      "id": "002",
      "name": "Jane",
      "department": "Sales",
      "phone": [
        {
          "type": "home",
          "number": "555-555-4567"
        },
        {
          "type": "work",
          "number": "555-555-8901"
        }
      ]
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
          "id": "employees.[&1].id",
          "name": "employees.[&1].name",
          "department": "employees.[&1].department",
          "phone": {
            "*": {
              "type": {
                "home": {
                  "@(2,number)": "employees.[&5].homephone"
                },
                "work": {
                  "@(2,number)": "employees.[&5].workphone"
                }
              }
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
    "id" : "001",
    "name" : "John",
    "department" : "HR",
    "homephone" : "555-555-1234",
    "workphone" : "555-555-5678"
  }, {
    "id" : "002",
    "name" : "Jane",
    "department" : "Sales",
    "homephone" : "555-555-4567",
    "workphone" : "555-555-8901"
  } ]
}
```


