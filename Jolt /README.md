# JOLT Transformation:-
The full form of JOLT in the context of data transformation is not officially defined as an acronym. It is simply the name of the library/tool used for JSON-to-JSON transformation. JOLT stands for Java Object Language Transformation, reflecting its core function of transforming JSON data structures programmatically using Java.

It is widely used for reshaping, filtering, and manipulating JSON data, particularly in tools like Apache NiFi.

## The component is useful to:
- modify the structure of a JSON and keep its values;
- add, extract, and remove data from a JSON;
- sort the structure of a JSON;
- modify the values contained in a JSON through functions, such as text manipulation, mathematical calculations, and conversions 
  between data types, among others;
- access and manipulate data from arrays.

**Remember**:
```json
[ 
  { 
    "operation": "", 
    "spec": { 
        
    } 
  } 
]
```
###### Where:
- **"operations"**: type of transformation that will be applied.
- **"spec"**: area where to put the transformation.
- **"[]"**: the JOLT self-base structure is also a JSON, and with it, there is an array that allows chaining many operations.

### JOLT OPERATIONS:-
**1. Shift**: Changes the structure of a JSON, keeping the values contained in that same JSON file.
###### Example:
```json
[
  {
    "operation": "shift",
    "spec": {
      "client": {
        "name": "customer.fullName",
        "birthDate": "customer.birthDate",
        "address": "customer.address.street",
        "country": "customer.address.country",
        "number": ["customer.phoneNumber", "customer.mobileNumber"]
      }
    }
  }
]
```
**2.Remove**: Used to remove fields or objects from a JSON.
###### Example:
```json
[
  {
    "operation": "remove",
    "spec": {
      "customer": {
        "birthDate": ""
      }
    }
  }
]
```
**3.Default**: Used to add new fields or objects in a JSON, if they do not already exist.
###### Example:
```json
[  {    
  {
    "operation": "default",
    "spec": {
      "customer": {
        "birthDate": "01/01/1970"
      }
    }
  }
]
```
**More**: [Learn here](https://docs.digibee.com/documentation/components/tools/transformer-jolt/transformer-getting-to-know-jolt#operations)






