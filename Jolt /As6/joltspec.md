**INPUT JSON**:-
```json
{
  "users": [
    {
      "name": "John Doe",
      "age": 35,
      "address": {
        "street": "123 Main St",
        "city": "Anytown",
        "state": "CA",
        "zip": "12345"
      },
      "hobbies": [
        {
          "name": "reading",
          "type": "indoor"
        },
        {
          "name": "hiking",
          "type": "outdoor"
        }
      ]
    },
    {
      "name": "Jane Doe",
      "age": 30,
      "address": {
        "street": "456 First St",
        "city": "Othertown",
        "state": "NY",
        "zip": "67890"
      },
      "hobbies": [
        {
          "name": "swimming",
          "type": "outdoor"
        },
        {
          "name": "painting",
          "type": "indoor"
        }
      ]
    }
  ]
}
```

**JOLT SPEC**:-
```json
[
  {
    "operation": "shift",
    "spec": {
      "users": {
        "*": {
          "name": "[&1].Name",
          "address": {
            "street": "[&2].Address.street",
            "city": "[&2].Address.city",
            "state": "[&2].Address.state",
            "zip": "[&2].Address.zip"
          },
          "hobbies": {
            "*": {
              "name": "[&3].Hobbies"
            }
          }
        }
      }
    }
  },
    {
    "operation": "modify-overwrite-beta",
    "spec": {
        "*": {
          "Address": "=concat(@(1,Address.street),', ',@(1,Address.city),', ',@(1,Address.state),',',@(1,Address.zip))"
        }
    }
  }
]
```

**OUTPUT JSON**:-
```json
[  {  
    "Name": "John Doe",
    "Address": "123 Main St, Anytown, CA 12345", 
    "Hobbies": [ "reading", "hiking" ]
  },
  {
    "Name": "Jane Doe",
    "Address": "456 First St, Othertown, NY 67890",
    "Hobbies": [
      "swimming",
      "painting"
    ]
  }
]
```


