**INPUT JSON**:
``` json
{
  "name": "John Smith",
  "age": 35,
  "address": {
    "street": "123 Main St",
    "city": "Anytown",
    "state": "CA",
    "zip": "12345"
  },
  "phone_numbers": [
    {
      "type": "home",
      "number": "555-1234"
    },
    {
      "type": "work",
      "number": "555-5678"
    }
  ]
}
```

**JOLT SPEC**:
``` json
[
  {
    "operation": "modify-overwrite-beta",
    "spec": {
      "name": "=split(' ',@(1,name))",
      "first_name": "=firstElement(@(1,name))",
      "last_name": "=lastElement(@(1,name))",
      "phone_number_count": "=size(@(1,phone_numbers))"
    }
  },
  {
    "operation": "remove",
    "spec": {
      "name": ""
    }
  },
  {
    "operation": "shift",
    "spec": {
      "first_name": "first_name",
      "last_name": "last_name",
      "age": "age",
      "address": "address",
      "phone_numbers": "phone_numbers",
      "phone_number_count": "phone_number_count"
    }
  }
]
```

**OUTPUT JSON**:
``` json
{
  "first_name" : "John",
  "last_name" : "Smith",
  "age" : 35,
  "address" : {
    "street" : "123 Main St",
    "city" : "Anytown",
    "state" : "CA",
    "zip" : "12345"
  },
  "phone_numbers" : [ {
    "type" : "home",
    "number" : "555-1234"
  }, {
    "type" : "work",
    "number" : "555-5678"
  } ],
  "phone_number_count" : 2
}
```
