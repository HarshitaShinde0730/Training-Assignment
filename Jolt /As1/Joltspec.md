**1.INPUT JSON**
```json
{
  "orders": [
    {
      "orderId": 1,
      "orderDate": "2022-02-20T12:34:56Z",
      "customer": {
        "customerId": 1,
        "firstName": "John",
        "lastName": "Doe",
        "email": "johndoe@example.com",
        "address": {
          "street": "123 Main St",
          "city": "Anytown",
          "state": "CA",
          "zip": "12345"
        }
      },
      "items": [
        {
          "itemId": 1,
          "name": "Product A",
          "quantity": 2,
          "price": 10.0
        },
        {
          "itemId": 2,
          "name": "Product B",
          "quantity": 1,
          "price": 20.0
        }
      ]
    },
    {
      "orderId": 2,
      "orderDate": "2022-02-21T09:12:34Z",
      "customer": {
        "customerId": 2,
        "firstName": "Jane",
        "lastName": "Smith",
        "email": "janesmith@example.com",
        "address": {
          "street": "456 Oak St",
          "city": "Somewhere",
          "state": "NY",
          "zip": "67890"
        }
      },
      "items": [
        {
          "itemId": 3,
          "name": "Product C",
          "quantity": 3,
          "price": 15.0
        }
      ]
    }
  ]
}
```
**JOLT SPEC**:
```json
[
  {
    "operation": "modify-overwrite-beta",
    "spec": {
      "orders": {
        "*": {
          "items": {
            "*": {
              "quantityInverse": "=divide(1,@(1,quantity))",
              "totalPrice": "=divide(@(1,price), @(1,quantityInverse))"
            }
          },
          "customer": {
            "fullName": "=concat(@(1,firstName), ' ', @(1,lastName))",
            "address": "=concat(@(0,street), ', ', @(0,city), ', ', @(0,state), ' ' , @(0,zip))"
          }
        }
      }
    }
  },
  {
    "operation": "shift",
    "spec": {
      "orders": {
        "*": {
          "*": "&2[#2].&",
          "items": {
            "*": {
              "*": "&4[#4].&2[#2].&",
              "totalPrice": "&4[#4].total"
            }
          }
        }
      }
    }
  },
  {
    "operation": "modify-overwrite-beta",
    "spec": {
      "orders": {
        "*": {
          "total": "=doubleSum(@(1,total))"
        }
      }
    }
  },
  {
    "operation": "remove",
    "spec": {
      "orders": {
        "*": {
          "customer": {
            "firstName": "",
            "lastName": ""
          },
          "items": {
            "*": {
              "quantityInverse": ""
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
  "orders": [
    {
      "orderId": 1,
      "orderDate": "2022-02-20T12:34:56Z",
      "customer": {
        "customerId": 1,
        "fullName": "John Doe",
        "email": "johndoe@example.com",
        "address": "123 Main St, Anytown, CA 12345"
      },
      "items": [
        {
          "itemId": 1,
          "name": "Product A",
          "quantity": 2,
          "price": 10.0
        },
        {
          "itemId": 2,
          "name": "Product B",
          "quantity": 1,
          "price": 20.0
        }
      ],
      "total": 40.0
    },
    {
      "orderId": 2,
      "orderDate": "2022-02-21T09:12:34Z",
      "customer": {
        "customerId": 2,
        "fullName": "Jane Smith",
        "email": "janesmith@example.com",
        "address": "456 Oak St, Somewhere, NY 67890"
      },
      "items": [
        {
          "itemId": 3,
          "name": "Product C",
          "quantity": 3,
          "price": 15.0
        }
      ],
      "total": 45.0
    }
  ]
}
```

