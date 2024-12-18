**INPUT JSON**:-
```json
{
  "name": "John",
  "age": 30,
  "address": {
    "street": "123 Main St",
    "city": "Anytown",
    "state": "CA",
    "zip": "12345"
  }
}
```

**JOLT SPEC**:-
```json
[
  {
    "operation": "remove",
    "spec": {
      "address": {
        "state": ""
      }
    }
  }
]
```

**OUTPUT JSON**:-
```json
{
  "name": "John",
  "age": 30,
  "address": {
    "street": "123 Main St",
    "city": "Anytown",
    "zip": "12345"
  }
}
```
