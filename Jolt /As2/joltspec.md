**INPUT JSON**:
```json
{
  "name": "John",
  "age": 35,
  "city": "New York"
}
```
**JOLT SPEC**:
```json
[
  {
    "operation": "shift",
    "spec": {
      "name": "Name",
      "age": "Age",
      "city": "City"
    }
  }
]
```
**OUTPUT JSON**:
```json
{
  "Name" : "John",
  "Age" : 35,
  "City" : "New York"
}
```
