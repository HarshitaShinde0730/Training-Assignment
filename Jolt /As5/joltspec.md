**INPUT JSON**:
```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "johndoe@example.com",
  "address": {
    "street": "123 Main St",
    "city": "Anytown",
    "state": "CA",
    "zip": "12345"
  }
}
```
**JOLT SPEC**:
```json
[
  {
    "operation": "shift",
    "spec": {
      "firstName": "fN",
      "lastName": "lN",
      "email": "email",
      "address": {
        "city": "City",
        "zip": "Zip"
      }
    }
  },
  {
    "operation": "modify-overwrite-beta",
    "spec": {
      "fullName": "=concat(@(1,fN), ' ', @(1,lN))"
    }
  },
  {
    "operation": "remove",
    "spec": {
      "fN": "",
      "lN": ""
    }
  }
]
```
**OUTPUT JSON**:
```json
{
  "email" : "johndoe@example.com",
  "City" : "Anytown",
  "Zip" : "12345",
  "fullName" : "John Doe"
}
```
