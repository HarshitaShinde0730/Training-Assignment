**Input Json:**
```json
{
  "name": "John",
  "hobby_1": "reading",
  "level_1": "advanced",
  "hobby_2": "swimming",
  "level_2": "beginner"
}
```
**Jolt Spec:**
```json
[
  {
    "operation": "shift",
    "spec": {
      "name": "name1",
      "hobby_1": "hobbies.hobbies1.name",
      "level_1": "hobbies.hobbies1.level",
      "hobby_2": "hobbies.hobbies2.name",
      "level_2": "hobbies.hobbies2.level"
    }
  },
  {
    "operation": "shift",
    "spec": {
      "name1": "name",
      "hobbies": {
        "hobbies1": "hobbies",
        "hobbies2": "hobbies"
      }
    }
  }
]

```
**Output Json:**
```json
{
  "name" : "John",
  "hobbies" : [ 
    {
    "name" : "reading",
    "level" : "advanced"
    }, 
    {
    "name" : "swimming",
    "level" : "beginner"
    }
  ]
}

```