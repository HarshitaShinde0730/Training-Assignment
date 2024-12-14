**INPUT JSON**:
```json
{
  "name": "John",
  "age": 35,
  "city": "New York",
  "phone": "+1-555-123-4567"
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
      "city": "Contact.City",
      "phone": "Contact.Phone"
    }
  }
]

```
**OUTPUT JSON**:
```json
{
  "Name": "John",
  "Age": 35,
  "Contact": {
    "City": "New York",
    "Phone": "+1-555-123-4567"
  }
}
```
