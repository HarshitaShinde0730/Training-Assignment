**INPUT JSON**:
```json
{
  "employee": {
    "firstName": "John",
    "lastName": "Doe",
    "address": {
      "street": "123 Main St",
      "city": "Anytown",
      "state": "CA",
      "zip": "12345"
    },
    "phones": [
      {
        "type": "home",
        "number": "555-555-1234"
      },
      {
        "type": "work",
        "number": "555-555-5678"
      }
    ]
  }
}
```
**JOLT SPEC**:
```json
[
  {
    "operation": "shift",
    "spec": {
      "*": {
        "firstName": "firstName",
        "lastName": "lastName",
        "address": {
          "street": "street",
          "city": "city",
          "state": "state",
          "zip": "zip"
        },
        "phones": "phonesNumbers"
      }
    }
  },
  {
    "operation": "modify-overwrite-beta",
    "spec": {
      "name": "=concat(@(1,firstName),' ',@(1,lastName))",
      "address": "=concat(@(1,street),' ',@(1,city),' ',@(1,state),' ',@(1,zip))"
    }
  },
  {
    "operation": "remove",
    "spec": {
      "firstName": "",
      "lastName": "",
      "street": "",
      "city": "",
      "state": "",
      "zip": ""
    }
  },
  {
    "operation": "shift",
    "spec": {
      "name": "name",
      "address": "address",
      "phonesNumbers": "phonesNumbers"
    }
  }
]
```
**OUTPUT JSON**:
```json
{
  "name" : "John Doe",
  "address" : "123 Main St Anytown CA 12345",
  "phonesNumbers" : [ {
    "type" : "home",
    "number" : "555-555-1234"
  }, {
    "type" : "work",
    "number" : "555-555-5678"
  } ]
}

```
