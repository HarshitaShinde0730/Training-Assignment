**1.INPUT JSON**
```json
{
  "products": [
    {
      "id": "1001",
      "name": "Product 1",
      "price": 10.99
    },
    {
      "id": "1002",
      "name": "Product 2",
      "price": 15.99
    },
    {
      "id": "1003",
      "name": "Product 3",
      "price": 20.99
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
      "products": {
        "*": {
          "id": "products.[&1].id",
          "name": "products.[&1].name",
          "price": {
            "10.99": {
              "#10.99": "products.[#4].price"
            },
            "15.99": {
              "#31.98": "products.[#4].price"
            },
            "20.99": {
              "#41.98": "products.[#4].price"
            }
          }
        }
      }
    }
  }
]
```
**OUTPUT JSON**:
```json
{
  "products" : [ {
    "id" : "1001",
    "name" : "Product 1",
    "price" : "10.99"
  }, {
    "id" : "1002",
    "name" : "Product 2",
    "price" : "31.98"
  }, {
    "id" : "1003",
    "name" : "Product 3",
    "price" : "41.98"
  } ]
}
```


