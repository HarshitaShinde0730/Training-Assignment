**INPUT JSON**:
```json
{
  "name": "John",
  "age": 35,
  "hobbies": [
    "reading",
    "movies",
    "travel"
  ]
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
      "hobbies": {
        "*": {
          "@": "Hobbies[#2].name"
        }
      },
      "*": {
        "@": "Hobbies[#2].Name"
      }
    }
  }
]
```
**OUTPUT JSON**:
```json
{
  "Name" : "John",
  "Age" : 35,
  "Hobbies" :
[
  {
    "name" : "reading"
  },
  {
    "name" : "movies"
  },
  {
    "name" : "travel"
  }
]
}
```
