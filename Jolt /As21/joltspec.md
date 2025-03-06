**Input Json:**
```json
{
  "restaurant": {
    "rating": {
      "value": 3
    },
    "address": {
      "value": "India"
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
      "restaurant": {
        "rating": {
          "@(0,value)": "Restaurant Rating"
        }
      }
    }
  }
]
```
**Output Json:**
```json
{
  "Restaurant Rating" : 3
}
```