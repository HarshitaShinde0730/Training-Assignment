**Input Json:**
```json
[
  {
    "restaurant": {
      "rating": {
        "value": 9
      },
      "address": {
        "value": "India"
      }
    }
  },
  {
    "restaurant": {
      "rating": {
        "value": 7
      },
      "address": {
        "value": "United States"
      }
    }
  }
]
```
**Jolt spec:**
```json
[
  {
    "operation": "shift",
    "spec": {
      "*": {
        "restaurant": {
          "rating": {
            "@(0,value)": "[&3].Restaurant Rating"
          }
        }
      }
    }
  }
]
```
**Output Json**:
```json
[{
	"Restaurant Rating": 9
}, {
	"Restaurant Rating": 7
}]
```