**Input Json:**
```json
{
  "person": {
    "name": "John Doe",
    "age": 30,
    "address": {
      "city": "New York",
      "state": "NY"
    }
  }
}
```
**Jolt Spec:**
```json
[
  {
    "operation": "shift",
    "spec": {
      "person": {
        "name": "person_name",
        "age": "person_age",
        "address": {
          "city": "person_address_city",
          "state": "person_address_state"
        }
      }
    }
  }
]
```
**Output Json:**
```json
{
  "person_name" : "John Doe",
  "person_age" : 30,
  "person_address_city" : "New York",
  "person_address_state" : "NY"
}
```