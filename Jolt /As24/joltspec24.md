**Input Json:**
```json
[
  {
    "returnId": "151",
    "returnItemAdjustments": [
      {
        "returnItemSeqId": "00001",
        "amount": 28.64,
        "returnAdjustmentTypeId": "RET_SALES_TAX_ADJ",
        "description": "Return Sales Tax",
        "createdDate": null,
        "returnId": "151",
        "returnAdjustmentId": "",
        "comments": "Return Sales Tax",
        "shipGroupSeqId": null
      },
      {
        "returnItemSeqId": "00001",
        "amount": 58.64,
        "returnAdjustmentTypeId": "RET_SALES_TAX_ADJ",
        "description": "Return Sales Tax",
        "createdDate": null,
        "returnId": "151",
        "returnAdjustmentId": "",
        "comments": "Return Sales Tax",
        "shipGroupSeqId": null
      }
    ]
  },
  {
    "returnId": "152",
    "returnItemAdjustments": [
      {
        "returnItemSeqId": "00002",
        "amount": 38.64,
        "returnAdjustmentTypeId": "RET_SALES_TAX_ADJ",
        "description": "Return Sales Tax",
        "createdDate": null,
        "returnId": "152",
        "returnAdjustmentId": "",
        "comments": "Return Sales Tax",
        "shipGroupSeqId": null
      }
    ]
  }
]
```
**Jolt spec**:
```json
[{
    "operation": "shift",
    "spec": {
      "*": {
        "returnId": "[&1].returnId",
        "returnItemAdjustments": {
          "*": {
            "@(0,amount)": "[&3].return.returnTax.[]"
          }
        }
      }
    }
},
  {
    "operation": "modify-overwrite-beta",
    "spec": {
      "*": {
        "return": {
          "returnTax1": "=doubleSum(@(1,returnTax))"
        }
      }
    }
  },
  {
    "operation": "shift",
    "spec": {
      "*": {
        "returnId": "[&1].returnId",
        "return": {
          "returnTax1": "[#3].returnTax"
        }
      }
    }
  }
]
```
**Output json:**
```json
[ {
  "returnId" : "151",
  "returnTax" : 87.28
}, {
  "returnId" : "152",
  "returnTax" : 38.64
} ]
```