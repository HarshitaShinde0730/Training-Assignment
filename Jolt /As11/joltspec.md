**INPUT JSON**:
```json
{
  "items": [
    {
      "name": "item1",
      "value": 10
    },
    {
      "name": "item2",
      "value": 20
    }
  ]
}
```

**JOLT SPEC**:
```json
[
  {
    "operation": "shift",
    "spec": {
      "items": {
        "*": {
          "name": "items.[#2].itemName",
          "value": "items.[#2].itemValue"
        }
      }
    }
  }
]
```

**OUTPUT JSON**:
```json
{
  "items" : [ {
    "itemName" : "item1",
    "itemValue" : 10
  }, {
    "itemName" : "item2",
    "itemValue" : 20
  } ]
}
```

