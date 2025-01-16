## Json Restructuring

**1. Problem Statement:** 

**INPUT JSON**
```json
{ 
  "client": { 
    "email": "sample-client@email.com", 
    "ssn": "123.456.789.10", 
    "address": "Sample Client street, 123",
    "country": "United States",
    "number": "8888-8888"
  } 
}
```

**JOLT SPEC**
```json
[
  {
    "operation": "shift",
    "spec": {
      "client": {
        "address": "customer.address.street",
        "country": "customer.address.country",
        "number": ["customer.phoneNumber", "customer.mobileNumber"]
      }
    }
  }
]
```
**OUTPUT JSON**
```json
{
  "customer" : {
    "address" : {
      "street" : "Sample Client street, 123",
      "country" : "United States"
    },
    "phoneNumber" : "8888-8888",
    "mobileNumber" : "8888-8888"
  }
}
```
