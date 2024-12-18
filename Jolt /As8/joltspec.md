**INPUT JSON**:-
```json
{
  "employees": [
    {
      "name": "John Doe",
      "salary": 50000,
      "department": "Sales"
    },
    {
      "name": "Jane Smith",
      "salary": 60000
    },
    {
      "name": "Bob Johnson",
      "department": "IT"
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
      "employees": {
        "*": {
          "salary": "employees[#2].salary",
          "department": "employees[#2].department",
          "name": {
            "John Doe": {
              "$": "employees[&3].name",
              "#1000": "employees[&3].bonus"
            },
            "Jane Smith": {
              "$": "employees[&3].name",
              "#Marketing": "employees[&3].department",
              "#1500": "employees[&3].bonus"
            },
            "Bob Johnson": {
              "$": "employees[&3].name",
              "#45000": "employees[&3].salary",
              "#900": "employees[&3].bonus"
            }
          }
        }
      }
    }
  },
  {
    "operation": "shift",
    "spec": {
      "employees": {
        "*": {
          "*": "employees[#2].&",
          "value": ["employees[#2].&", "bonues[]"]
        }
      }
    }
  },
  {
    "operation": "modify-overwrite-beta",
    "spec": {
      "totalBonus": "=doubleSum(@(1,bonues))"
    }
  },
  {
    "operation": "remove",
    "spec": {
      "bonues": ""
    }
  }
]
```

**OUTPUT JSON**:-
```json
{
  "employees": [
    {
      "name": "John Doe",
      "salary": 50000,
      "department": "Sales",
      "bonus": 1000
    },
    {
      "name": "Jane Smith",
      "salary": 60000,
      "department": "Marketing",
      "bonus": 1500
    },
    {
      "name": "Bob Johnson",
      "salary": 45000,
      "department": "IT",
      "bonus": 900
    }
  ],
  "totalBonus": 3400
}
```

