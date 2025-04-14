**Input Json**:
```json
 {
    "productStoreId": "SM_STORE",
    "orderId": "3432206",
    "orderName": "SMUS#7261832",
    "orderDate": "2023-07-11T13:54:15-04:00",
    "orderStatusId": "ORDER_APPROVED",
    "entryDate": "2023-07-11T14:03:44-04:00",
    "grandTotal": 420.02,
    "orderItemSeqId": null,
    "itemStatusId": null,
    "unitPrice": null,
    "orderItemExternalId": null,
    "shipGroupSeqId": null,
    "slaShipmentMethodTypeId": null,
    "postalContactMechId": "19010881",
    "telecomContactMechId": null,
    "itemQuantity": null,
    "facilityId": null,
    "facilityExternalId": null,
    "facilityTypeId": null,
    "parentFacilityTypeId": null,
    "statusDatetime": null,
    "productId": null,
    "productTypeId": null,
    "isPhysical": null,
    "isDigital": null,
    "customerFirstName": "Katherine",
    "customerLastName": "Holbrook",
    "currency": "USD",
    "salesChannel": "WEB_CHANNEL",
    "customerPartyId": "2676213",
    "isShippingChargesSent": "Y",
    "orderIdentifications": [
      {
        "idValue": "4702763679877",
        "lastUpdatedStamp": "2023-07-11T14:03:45-04:00",
        "orderId": "3432206",
        "fromDate": "2023-07-11T14:03:45-04:00",
        "orderIdentificationTypeId": "SHOPIFY_ORD_ID",
        "thruDate": null
      },
      {
        "orderIdentificationTypeId": "SHOPIFY_ORD_NAME",
        "lastUpdatedStamp": "2023-07-11T14:03:45-04:00",
        "fromDate": "2023-07-11T14:03:45-04:00",
        "orderId": "3432206",
        "idValue": "SMUS#7261832",
        "thruDate": null
      },
      {
        "orderIdentificationTypeId": "SHOPIFY_ORD_NO",
        "fromDate": "2023-07-11T14:03:45-04:00",
        "lastUpdatedStamp": "2023-07-11T14:03:45-04:00",
        "orderId": "3432206",
        "idValue": "7260832",
        "thruDate": null
      }
    ],
    "customerPartyIdentifications": [
      {
        "idValue": "5244747251845",
        "partyIdentificationTypeId": "SHOPIFY_CUST_ID",
        "lastUpdatedStamp": "2023-05-29T22:22:02-04:00",
        "partyId": "2676213"
      }
    ],
    "payments": [
      {
        "createdDate": "2023-07-11T14:03:44-04:00",
        "paymentMethodCode": "Mastercard",
        "statusId": "PAYMENT_AUTHORIZED",
        "returnId": null,
        "paymentMethodDescription": "Ext Mastercard",
        "paymentMethodTypeId": "EXT_SHOP_MASTERCARD",
        "orderId": "3432206",
        "amount": 420.02
      }
    ],
    "billTo": {
      "contactMechId": "19009597",
      "houseNumberExt": null,
      "address2": null,
      "city": "SAN JOSE",
      "postalCodeGeoId": null,
      "houseNumber": null,
      "encodedAddressKey": null,
      "postalCode": "95517",
      "postalCodeExt": null,
      "countryGeoId": "USA",
      "countryGeoCode": "US",
      "stateProvinceGeoCode": "CA",
      "attnName": null,
      "directions": null,
      "countyGeoId": null,
      "toName": null,
      "cityGeoId": null,
      "municipalityGeoId": null,
      "stateProvinceGeoId": "CA",
      "geoPointId": null,
      "address1": "1220 GARBO WAY APT 204"
    },
    "shipments": [
      {
        "trackingNumber": "781026278006",
        "carrierPartyId": "FEDEX",
        "shipmentMethodTypeId": "SECOND_DAY",
        "trackingUrl": "",
        "shipTo": {
          "houseNumberExt": null,
          "address2": null,
          "contactMechId": "19010881",
          "postalCodeGeoId": null,
          "houseNumber": null,
          "encodedAddressKey": null,
          "toName": "Katherine Holbrook",
          "postalCodeExt": null,
          "postalCode": "79416",
          "countryGeoId": "USA",
          "countryGeoCode": "US",
          "geoPointId": "4151636",
          "attnName": null,
          "directions": null,
          "countyGeoId": null,
          "stateProvinceGeoCode": "TX",
          "cityGeoId": null,
          "municipalityGeoId": null,
          "city": "Lubbock",
          "address1": "110 North Vale Avenue  ",
          "stateProvinceGeoId": "TX"
        },
        "shipmentItems": [
          {
            "productStoreId": "SM_STORE",
            "orderId": "3432206",
            "orderName": "SMUS#7261832",
            "orderDate": "2023-07-11T13:54:15-04:00",
            "orderStatusId": "ORDER_APPROVED",
            "entryDate": "2023-07-11T14:03:44-04:00",
            "grandTotal": 420.02,
            "currency": "USD",
            "salesChannel": "WEB_CHANNEL",
            "orderItemSeqId": "00101",
            "itemStatusId": "ITEM_COMPLETED",
            "unitPrice": 35.97,
            "orderItemExternalId": "11758577287301",
            "customerPartyId": "2676213",
            "customerFirstName": "Katherine",
            "customerLastName": "Holbrook",
            "shipGroupSeqId": "00003",
            "slaShipmentMethodTypeId": "SECOND_DAY",
            "postalContactMechId": "19010881",
            "telecomContactMechId": "19010882",
            "itemQuantity": 1,
            "facilityId": "557",
            "facilityExternalId": "557",
            "facilityTypeId": "OUTLET_STORE",
            "parentFacilityTypeId": "PHYSICAL_STORE",
            "statusDatetime": "2023-07-12T13:28:13-04:00",
            "productId": "284730",
            "internalName": "40129470038149",
            "shippedQuantity": 1,
            "shipmentId": "4094507",
            "shipmentItemSeqId": "00001",
            "shipmentStatusId": "SHIPMENT_SHIPPED",
            "shipToContactMechId": "19010881",
            "shipToTelecomContactMechId": "19010882",
            "shipmentTypeId": "SALES_SHIPMENT",
            "trackingNumber": "781026278006",
            "carrierPartyId": "FEDEX",
            "shipmentMethodTypeId": "SECOND_DAY",
            "productTypeId": "FINISHED_GOOD",
            "isPhysical": "Y",
            "isDigital": "N",
            "goodIdentifications": [
              {
                "fromDate": "2023-02-10T00:27:22-05:00",
                "goodIdentificationTypeId": "SHOPIFY_PROD_ID",
                "lastUpdatedStamp": "2023-07-12T09:24:15-04:00",
                "idValue": "40129470038149",
                "productId": "284730",
                "thruDate": null
              },
              {
                "fromDate": "2023-02-10T00:27:22-05:00",
                "lastUpdatedStamp": "2023-07-12T09:24:15-04:00",
                "idValue": "KNOX",
                "productId": "284730",
                "goodIdentificationTypeId": "SHOPIFY_PROD_SKU",
                "thruDate": null
              },
              {
                "lastUpdatedStamp": "2023-07-12T09:24:15-04:00",
                "fromDate": "2023-02-10T00:27:22-05:00",
                "goodIdentificationTypeId": "SKU",
                "idValue": "KNOX",
                "productId": "284730",
                "thruDate": null
              },
              {
                "fromDate": "2023-02-10T00:27:22-05:00",
                "lastUpdatedStamp": "2023-02-10T00:27:22-05:00",
                "idValue": "197369252000",
                "goodIdentificationTypeId": "UPCA",
                "productId": "284730",
                "thruDate": null
              }
            ]
          }
        ]
      },
      {
        "trackingNumber": "781026277009",
        "carrierPartyId": "FEDEX",
        "shipmentMethodTypeId": "SECOND_DAY",
        "trackingUrl": "",
        "shipTo": {
          "houseNumberExt": null,
          "address2": null,
          "contactMechId": "19010881",
          "postalCodeGeoId": null,
          "houseNumber": null,
          "encodedAddressKey": null,
          "toName": "Katherine Holbrook",
          "postalCodeExt": null,
          "postalCode": "79416",
          "countryGeoId": "USA",
          "countryGeoCode": "US",
          "geoPointId": "4151636",
          "attnName": null,
          "directions": null,
          "countyGeoId": null,
          "stateProvinceGeoCode": "TX",
          "cityGeoId": null,
          "municipalityGeoId": null,
          "city": "Lubbock",
          "address1": "110 North Vale Avenue  ",
          "stateProvinceGeoId": "TX"
        },
        "shipmentItems": [
          {
            "productStoreId": "SM_STORE",
            "orderId": "3432206",
            "orderName": "SMUS#7261832",
            "orderDate": "2023-07-11T13:54:15-04:00",
            "orderStatusId": "ORDER_APPROVED",
            "entryDate": "2023-07-11T14:03:44-04:00",
            "grandTotal": 420.02,
            "currency": "USD",
            "salesChannel": "WEB_CHANNEL",
            "orderItemSeqId": "00102",
            "itemStatusId": "ITEM_COMPLETED",
            "unitPrice": 30.97,
            "orderItemExternalId": "11758577287302",
            "customerPartyId": "2676213",
            "customerFirstName": "Katherine",
            "customerLastName": "Holbrook",
            "shipGroupSeqId": "00003",
            "slaShipmentMethodTypeId": "SECOND_DAY",
            "postalContactMechId": "19010881",
            "telecomContactMechId": "19010882",
            "itemQuantity": 1,
            "facilityId": "557",
            "facilityExternalId": "557",
            "facilityTypeId": "OUTLET_STORE",
            "parentFacilityTypeId": "PHYSICAL_STORE",
            "statusDatetime": "2023-07-12T13:28:13-04:00",
            "productId": "284731",
            "internalName": "40129470038150",
            "shippedQuantity": 1,
            "shipmentId": "4094508",
            "shipmentItemSeqId": "00001",
            "shipmentStatusId": "SHIPMENT_SHIPPED",
            "shipToContactMechId": "19010881",
            "shipToTelecomContactMechId": "19010882",
            "shipmentTypeId": "SALES_SHIPMENT",
            "trackingNumber": "781026277009",
            "carrierPartyId": "FEDEX",
            "shipmentMethodTypeId": "SECOND_DAY",
            "productTypeId": "FINISHED_GOOD",
            "isPhysical": "Y",
            "isDigital": "N",
            "goodIdentifications": [
              {
                "fromDate": "2023-02-10T00:27:22-05:00",
                "goodIdentificationTypeId": "SHOPIFY_PROD_ID",
                "lastUpdatedStamp": "2023-07-12T09:24:15-04:00",
                "idValue": "40129470038150",
                "productId": "284731",
                "thruDate": null
              },
              {
                "fromDate": "2023-02-10T00:27:22-05:00",
                "lastUpdatedStamp": "2023-07-12T09:24:15-04:00",
                "idValue": "KNOX",
                "productId": "284731",
                "goodIdentificationTypeId": "SHOPIFY_PROD_SKU",
                "thruDate": null
              },
              {
                "lastUpdatedStamp": "2023-07-12T09:24:15-04:00",
                "fromDate": "2023-02-10T00:27:22-05:00",
                "goodIdentificationTypeId": "SKU",
                "idValue": "KNOX",
                "productId": "284731",
                "thruDate": null
              },
              {
                "fromDate": "2023-02-10T00:27:22-05:00",
                "lastUpdatedStamp": "2023-02-10T00:27:22-05:00",
                "idValue": "197369252001",
                "goodIdentificationTypeId": "UPCA",
                "productId": "284731",
                "thruDate": null
              }
            ]
          }
        ]
      }
    ]
  },
  {
    "productStoreId": "SM_STORE",
    "orderId": "3433205",
    "orderName": "0562003000427",
    "orderDate": "2023-07-11T17:24:42-04:00",
    "orderStatusId": "ORDER_APPROVED",
    "entryDate": "2023-07-11T17:25:51-04:00",
    "grandTotal": 63.57,
    "orderItemSeqId": null,
    "itemStatusId": null,
    "unitPrice": null,
    "orderItemExternalId": null,
    "shipGroupSeqId": null,
    "slaShipmentMethodTypeId": null,
    "postalContactMechId": "19015449",
    "telecomContactMechId": null,
    "itemQuantity": null,
    "facilityId": null,
    "facilityExternalId": null,
    "facilityTypeId": null,
    "parentFacilityTypeId": null,
    "statusDatetime": null,
    "productId": null,
    "productTypeId": null,
    "isPhysical": null,
    "isDigital": null,
    "customerFirstName": "Thuy",
    "customerLastName": "Le",
    "currency": "USD",
    "salesChannel": "POS_CHANNEL",
    "customerPartyId": "2817031",
    "isShippingChargesSent": "Y",
    "orderIdentifications": [
      {
        "orderId": "3433205",
        "fromDate": "2023-07-11T17:25:51-04:00",
        "lastUpdatedStamp": "2023-07-11T17:25:51-04:00",
        "orderIdentificationTypeId": "XSTORE_ORD_ID",
        "idValue": "0562003000427",
        "thruDate": null
      }
    ],
    "customerPartyIdentifications": [],
    "payments": [
      {
        "paymentMethodCode": null,
        "orderId": "3433205",
        "statusId": "PAYMENT_SETTLED",
        "amount": 63.57,
        "returnId": null,
        "createdDate": "2023-07-11T17:25:51-04:00",
        "paymentMethodTypeId": "CASH",
        "paymentMethodDescription": "Cash"
      }
    ],
    "billTo": {
      "stateProvinceGeoCode": "MD",
      "houseNumberExt": null,
      "address2": null,
      "postalCodeGeoId": null,
      "houseNumber": null,
      "encodedAddressKey": null,
      "postalCodeExt": null,
      "countryGeoId": "USA",
      "countryGeoCode": "US",
      "attnName": null,
      "stateProvinceGeoId": "MD",
      "directions": null,
      "countyGeoId": null,
      "toName": null,
      "address1": "22705 CLAKRSBURG RD APT 126",
      "cityGeoId": null,
      "municipalityGeoId": null,
      "city": "CLARKSBURG",
      "contactMechId": "19015462",
      "postalCode": "20871",
      "geoPointId": null
    },
    "shipments": [
      {
        "trackingNumber": "781026278999",
        "carrierPartyId": "FEDEX",
        "shipmentMethodTypeId": "GROUND_HOME",
        "trackingUrl": "",
        "shipTo": {
          "stateProvinceGeoCode": "MD",
          "houseNumberExt": null,
          "contactMechId": "19015449",
          "address2": null,
          "postalCodeGeoId": null,
          "houseNumber": null,
          "encodedAddressKey": null,
          "postalCodeExt": null,
          "countryGeoId": "USA",
          "countryGeoCode": "US",
          "attnName": null,
          "stateProvinceGeoId": "MD",
          "directions": null,
          "countyGeoId": null,
          "address1": "22705 CLAKRSBURG RD APT 126",
          "cityGeoId": null,
          "municipalityGeoId": null,
          "toName": "Thuy Le ",
          "city": "CLARKSBURG",
          "postalCode": "20871",
          "geoPointId": null
        },
        "shipmentItems": [
          {
            "productStoreId": "SM_STORE",
            "orderId": "3433205",
            "orderName": "0562003000427",
            "orderDate": "2023-07-11T17:24:42-04:00",
            "orderStatusId": "ORDER_APPROVED",
            "entryDate": "2023-07-11T17:25:51-04:00",
            "grandTotal": 63.57,
            "currency": "USD",
            "salesChannel": "POS_CHANNEL",
            "orderItemSeqId": "00102",
            "itemStatusId": "ITEM_COMPLETED",
            "unitPrice": 39.98,
            "orderItemExternalId": "196829565155",
            "customerPartyId": "2817031",
            "customerFirstName": "Thuy",
            "customerLastName": "Le",
            "shipGroupSeqId": "00001",
            "slaShipmentMethodTypeId": "STANDARD",
            "postalContactMechId": "19015449",
            "telecomContactMechId": "19015460",
            "itemQuantity": 1,
            "facilityId": "557",
            "facilityExternalId": "557",
            "facilityTypeId": "OUTLET_STORE",
            "parentFacilityTypeId": "PHYSICAL_STORE",
            "statusDatetime": "2023-07-12T13:28:13-04:00",
            "productId": "259981",
            "internalName": "39893337669765",
            "shippedQuantity": 1,
            "shipmentId": "4094510",
            "shipmentItemSeqId": "00001",
            "shipmentStatusId": "SHIPMENT_SHIPPED",
            "shipToContactMechId": "19015449",
            "shipToTelecomContactMechId": "19015460",
            "shipmentTypeId": "SALES_SHIPMENT",
            "trackingNumber": "781026278999",
            "carrierPartyId": "FEDEX",
            "shipmentMethodTypeId": "GROUND_HOME",
            "productTypeId": "FINISHED_GOOD",
            "isPhysical": "Y",
            "isDigital": "N",
            "goodIdentifications": [
              {
                "productId": "259981",
                "idValue": "39893337669765",
                "goodIdentificationTypeId": "SHOPIFY_PROD_ID",
                "lastUpdatedStamp": "2023-07-12T09:35:44-04:00",
                "fromDate": "2022-12-23T09:09:45-05:00",
                "thruDate": null
              },
              {
                "productId": "259981",
                "fromDate": "2022-09-02T00:23:37-04:00",
                "lastUpdatedStamp": "2023-07-12T09:35:44-04:00",
                "idValue": "RIPLEY",
                "goodIdentificationTypeId": "SHOPIFY_PROD_SKU",
                "thruDate": null
              },
              {
                "productId": "259981",
                "fromDate": "2022-09-02T00:23:37-04:00",
                "goodIdentificationTypeId": "SKU",
                "idValue": "RIPLEY",
                "lastUpdatedStamp": "2023-07-12T09:35:44-04:00",
                "thruDate": null
              },
              {
                "productId": "259981",
                "fromDate": "2022-09-02T00:23:37-04:00",
                "lastUpdatedStamp": "2022-09-02T00:23:37-04:00",
                "goodIdentificationTypeId": "UPCA",
                "idValue": "196829565155",
                "thruDate": null
              }
            ]
          }
        ]
      }
    ]
  },
  {
    "productStoreId": "SM_STORE",
    "orderId": "3433454",
    "orderName": "SMUS#7262810",
    "orderDate": "2023-07-11T17:57:52-04:00",
    "orderStatusId": "ORDER_APPROVED",
    "entryDate": "2023-07-11T18:03:27-04:00",
    "grandTotal": 202.92,
    "orderItemSeqId": null,
    "itemStatusId": null,
    "unitPrice": null,
    "orderItemExternalId": null,
    "shipGroupSeqId": null,
    "slaShipmentMethodTypeId": null,
    "postalContactMechId": "19016208",
    "telecomContactMechId": null,
    "itemQuantity": null,
    "facilityId": null,
    "facilityExternalId": null,
    "facilityTypeId": null,
    "parentFacilityTypeId": null,
    "statusDatetime": null,
    "productId": null,
    "productTypeId": null,
    "isPhysical": null,
    "isDigital": null,
    "customerFirstName": "Jaqueline",
    "customerLastName": "Fuentes",
    "currency": "USD",
    "salesChannel": "WEB_CHANNEL",
    "customerPartyId": "174235",
    "isShippingChargesSent": "N",
    "orderIdentifications": [
      {
        "idValue": "4702982897797",
        "orderId": "3433454",
        "lastUpdatedStamp": "2023-07-11T18:03:27-04:00",
        "fromDate": "2023-07-11T18:03:27-04:00",
        "orderIdentificationTypeId": "SHOPIFY_ORD_ID",
        "thruDate": null
      },
      {
        "lastUpdatedStamp": "2023-07-11T18:03:27-04:00",
        "orderIdentificationTypeId": "SHOPIFY_ORD_NAME",
        "orderId": "3433454",
        "fromDate": "2023-07-11T18:03:27-04:00",
        "idValue": "SMUS#7262810",
        "thruDate": null
      },
      {
        "idValue": "7261810",
        "orderIdentificationTypeId": "SHOPIFY_ORD_NO",
        "orderId": "3433454",
        "fromDate": "2023-07-11T18:03:27-04:00",
        "lastUpdatedStamp": "2023-07-11T18:03:27-04:00",
        "thruDate": null
      }
    ],
    "customerPartyIdentifications": [
      {
        "partyIdentificationTypeId": "SHOPIFY_CUST_ID",
        "lastUpdatedStamp": "2022-02-05T22:23:57-05:00",
        "idValue": "2760989474961",
        "partyId": "174235"
      }
    ],
    "payments": [
      {
        "paymentMethodTypeId": "EXT_SHOP_VISA",
        "paymentMethodDescription": "Ext VISA",
        "amount": 202.92,
        "orderId": "3433454",
        "statusId": "PAYMENT_AUTHORIZED",
        "returnId": null,
        "paymentMethodCode": "VISA",
        "createdDate": "2023-07-11T18:03:27-04:00"
      }
    ],
    "billTo": {
      "stateProvinceGeoCode": "MD",
      "houseNumberExt": null,
      "address2": null,
      "postalCodeGeoId": null,
      "houseNumber": null,
      "encodedAddressKey": null,
      "postalCodeExt": null,
      "countryGeoId": "USA",
      "countryGeoCode": "US",
      "attnName": null,
      "stateProvinceGeoId": "MD",
      "directions": null,
      "countyGeoId": null,
      "toName": null,
      "address1": "22705 CLAKRSBURG RD APT 126",
      "cityGeoId": null,
      "municipalityGeoId": null,
      "city": "CLARKSBURG",
      "contactMechId": "19015462",
      "postalCode": "20871",
      "geoPointId": null
    },
    "shipments": [
      {
        "trackingNumber": "781026278750",
        "carrierPartyId": "FEDEX",
        "shipmentMethodTypeId": "GROUND_HOME",
        "trackingUrl": "",
        "shipTo": {
          "houseNumberExt": null,
          "contactMechId": "19016208",
          "toName": "Jaqueline Fuentes",
          "address1": "30 Healy Street  ",
          "address2": null,
          "geoPointId": "4152681",
          "postalCode": "11743",
          "stateProvinceGeoId": "NY",
          "postalCodeGeoId": null,
          "houseNumber": null,
          "encodedAddressKey": null,
          "postalCodeExt": null,
          "countryGeoId": "USA",
          "countryGeoCode": "US",
          "attnName": null,
          "city": "Huntington",
          "directions": null,
          "countyGeoId": null,
          "cityGeoId": null,
          "municipalityGeoId": null,
          "stateProvinceGeoCode": "NY"
        },
        "shipmentItems": [
          {
            "productStoreId": "SM_STORE",
            "orderId": "3433454",
            "orderName": "SMUS#7262810",
            "orderDate": "2023-07-11T17:57:52-04:00",
            "orderStatusId": "ORDER_APPROVED",
            "entryDate": "2023-07-11T18:03:27-04:00",
            "grandTotal": 202.92,
            "currency": "USD",
            "salesChannel": "WEB_CHANNEL",
            "orderItemSeqId": "00104",
            "itemStatusId": "ITEM_COMPLETED",
            "unitPrice": 35.97,
            "orderItemExternalId": "11759054815365",
            "customerPartyId": "174235",
            "customerFirstName": "Jaqueline",
            "customerLastName": "Fuentes",
            "shipGroupSeqId": "00003",
            "slaShipmentMethodTypeId": "SECOND_DAY",
            "postalContactMechId": "19016208",
            "telecomContactMechId": "19016209",
            "itemQuantity": 1,
            "facilityId": "557",
            "facilityExternalId": "557",
            "facilityTypeId": "OUTLET_STORE",
            "parentFacilityTypeId": "PHYSICAL_STORE",
            "statusDatetime": "2023-07-12T13:28:13-04:00",
            "productId": "271668",
            "internalName": "39999987089541",
            "shippedQuantity": 1,
            "shipmentId": "4094511",
            "shipmentItemSeqId": "00001",
            "shipmentStatusId": "SHIPMENT_SHIPPED",
            "shipToContactMechId": "19016208",
            "shipToTelecomContactMechId": "19016209",
            "shipmentTypeId": "SALES_SHIPMENT",
            "trackingNumber": "781026278750",
            "carrierPartyId": "FEDEX",
            "shipmentMethodTypeId": "GROUND_HOME",
            "productTypeId": "FINISHED_GOOD",
            "isPhysical": "Y",
            "isDigital": "N",
            "goodIdentifications": [
              {
                "goodIdentificationTypeId": "SHOPIFY_PROD_ID",
                "idValue": "39999987089541",
                "productId": "271668",
                "fromDate": "2022-11-01T00:23:33-04:00",
                "lastUpdatedStamp": "2023-07-12T09:23:57-04:00",
                "thruDate": null
              },
              {
                "productId": "271668",
                "fromDate": "2022-11-01T00:23:33-04:00",
                "idValue": "KNOX",
                "lastUpdatedStamp": "2023-07-12T09:23:57-04:00",
                "goodIdentificationTypeId": "SHOPIFY_PROD_SKU",
                "thruDate": null
              },
              {
                "lastUpdatedStamp": "2023-07-12T09:23:57-04:00",
                "goodIdentificationTypeId": "SKU",
                "productId": "271668",
                "fromDate": "2022-11-01T00:23:33-04:00",
                "idValue": "KNOX",
                "thruDate": null
              },
              {
                "productId": "271668",
                "fromDate": "2022-11-01T00:23:33-04:00",
                "goodIdentificationTypeId": "UPCA",
                "lastUpdatedStamp": "2022-11-01T00:23:33-04:00",
                "idValue": "196829850640",
                "thruDate": null
              }
            ]
          },
          {
            "productStoreId": "SM_STORE",
            "orderId": "3433454",
            "orderName": "SMUS#7262810",
            "orderDate": "2023-07-11T17:57:52-04:00",
            "orderStatusId": "ORDER_APPROVED",
            "entryDate": "2023-07-11T18:03:27-04:00",
            "grandTotal": 202.92,
            "currency": "USD",
            "salesChannel": "WEB_CHANNEL",
            "orderItemSeqId": "00106",
            "itemStatusId": "ITEM_COMPLETED",
            "unitPrice": 39.99,
            "orderItemExternalId": "11759054749829",
            "customerPartyId": "174235",
            "customerFirstName": "Jaqueline",
            "customerLastName": "Fuentes",
            "shipGroupSeqId": "00003",
            "slaShipmentMethodTypeId": "SECOND_DAY",
            "postalContactMechId": "19016208",
            "telecomContactMechId": "19016209",
            "itemQuantity": 1,
            "facilityId": "557",
            "facilityExternalId": "557",
            "facilityTypeId": "OUTLET_STORE",
            "parentFacilityTypeId": "PHYSICAL_STORE",
            "statusDatetime": "2023-07-12T13:28:13-04:00",
            "productId": "260304",
            "internalName": "39904828981381",
            "shippedQuantity": 1,
            "shipmentId": "4094511",
            "shipmentItemSeqId": "00002",
            "shipmentStatusId": "SHIPMENT_SHIPPED",
            "shipToContactMechId": "19016208",
            "shipToTelecomContactMechId": "19016209",
            "shipmentTypeId": "SALES_SHIPMENT",
            "trackingNumber": "781026278750",
            "carrierPartyId": "FEDEX",
            "shipmentMethodTypeId": "GROUND_HOME",
            "productTypeId": "FINISHED_GOOD",
            "isPhysical": "Y",
            "isDigital": "N",
            "goodIdentifications": [
              {
                "lastUpdatedStamp": "2023-07-11T21:35:11-04:00",
                "fromDate": "2022-12-30T02:44:34-05:00",
                "goodIdentificationTypeId": "SHOPIFY_PROD_ID",
                "productId": "260304",
                "idValue": "39904828981381",
                "thruDate": null
              },
              {
                "productId": "260304",
                "idValue": "BM304540",
                "lastUpdatedStamp": "2023-07-11T21:35:11-04:00",
                "fromDate": "2022-09-09T00:23:04-04:00",
                "goodIdentificationTypeId": "SHOPIFY_PROD_SKU",
                "thruDate": null
              },
              {
                "lastUpdatedStamp": "2023-07-11T21:35:11-04:00",
                "productId": "260304",
                "idValue": "BM304540",
                "goodIdentificationTypeId": "SKU",
                "fromDate": "2022-09-09T00:23:04-04:00",
                "thruDate": null
              },
              {
                "lastUpdatedStamp": "2022-09-24T03:39:42-04:00",
                "productId": "260304",
                "goodIdentificationTypeId": "UPCA",
                "fromDate": "2022-09-09T00:23:04-04:00",
                "idValue": "824386284713",
                "thruDate": null
              }
            ]
          }
        ]
      }
    ]
  }
]
```

**Jolt Spec**:
```json
[
  {
    "operation": "shift",
    "spec": {
      "*": {
        "orderIdentifications": {
          "*": {
            "orderIdentificationTypeId": {
              "SHOPIFY_ORD_ID": {
                "#yes": "[#6].shopifyOrderIdExist",
                "@(2,idValue)": "[#6].shopifyOrderId"
              }
            }
          }
        },
        "@": "[&]"
      }
    }
  },
  {
    "operation": "shift",
    "spec": {
      "*": {
        "shopifyOrderIdExist": {
          "yes": {
            "@(2,shipments)": {
              "*": {
                "@(4,orderId)": "[#6].ItemMap&1.orderId",
                "@(4,orderName)": "[#6].ItemMap&1.orderName",
                "@(4,shopifyOrderId)": "[#6].ItemMap&1.shopifyOrderId",
                "trackingNumber": "[#6].ItemMap&1.trackingNumber",
                "trackingUrl": "[#6].ItemMap&1.trackingUrl",
                "carrierPartyId": "[#6].ItemMap&1.carrierPartyId",
                "shipmentMethodTypeId": "[#6].ItemMap&1.shipmentMethodTypeId",
                "shipTo": "[#6].ItemMap&1.shipTo",
                "shipmentItems": {
                  "*": {
                    "shipmentId": "[#8].ItemMap&3.shipmentItems[#2].shipmentId",
                    "shipmentItemSeqId": "[#8].ItemMap&3.shipmentItems[#2].shipmentItemSeqId",
                    "orderId": "[#8].ItemMap&3.shipmentItems[#2].orderId",
                    "orderItemSeqId": "[#8].ItemMap&3.shipmentItems[#2].orderItemSeqId",
                    "orderItemExternalId": "[#8].ItemMap&3.shipmentItems[#2].shopifyOrderLineId",
                    "shipGroupSeqId": "[#8].ItemMap&3.shipmentItems[#2].shipGroupSeqId",
                    "shippedQuantity": "[#8].ItemMap&3.shipmentItems[#2].quantity"
                  }
                }
              }
            }
          }
        }
      }
    }
  },
  {
    "operation": "shift",
    "spec": {
      "*": {
        "ItemMap*": "[]"
      }
    }
  }
]
```

**Output Json**: 
```json
[
  {
    "orderId": "3432206",
    "orderName": "SMUS#7261832",
    "shopifyOrderId": "4702763679877",
    "trackingNumber": "781026278006",
    "trackingUrl": "",
    "carrierPartyId": "FEDEX",
    "shipmentMethodTypeId": "SECOND_DAY",
    "shipTo": {
      "houseNumberExt": null,
      "address2": null,
      "contactMechId": "19010881",
      "postalCodeGeoId": null,
      "houseNumber": null,
      "encodedAddressKey": null,
      "toName": "Katherine Holbrook",
      "postalCodeExt": null,
      "postalCode": "79416",
      "countryGeoId": "USA",
      "countryGeoCode": "US",
      "geoPointId": "4151636",
      "attnName": null,
      "directions": null,
      "countyGeoId": null,
      "stateProvinceGeoCode": "TX",
      "cityGeoId": null,
      "municipalityGeoId": null,
      "city": "Lubbock",
      "address1": "110 North Vale Avenue  ",
      "stateProvinceGeoId": "TX"
    },
    "shipmentItems": [
      {
        "shipmentId": "4094507",
        "shipmentItemSeqId": "00001",
        "orderId": "3432206",
        "orderItemSeqId": "00101",
        "shopifyOrderLineId": "11758577287301",
        "shipGroupSeqId": "00003",
        "quantity": 1
      }
    ]
  },
  {
    "orderId": "3432206",
    "orderName": "SMUS#7261832",
    "shopifyOrderId": "4702763679877",
    "trackingNumber": "781026277009",
    "trackingUrl": "",
    "carrierPartyId": "FEDEX",
    "shipmentMethodTypeId": "SECOND_DAY",
    "shipTo": {
      "houseNumberExt": null,
      "address2": null,
      "contactMechId": "19010881",
      "postalCodeGeoId": null,
      "houseNumber": null,
      "encodedAddressKey": null,
      "toName": "Katherine Holbrook",
      "postalCodeExt": null,
      "postalCode": "79416",
      "countryGeoId": "USA",
      "countryGeoCode": "US",
      "geoPointId": "4151636",
      "attnName": null,
      "directions": null,
      "countyGeoId": null,
      "stateProvinceGeoCode": "TX",
      "cityGeoId": null,
      "municipalityGeoId": null,
      "city": "Lubbock",
      "address1": "110 North Vale Avenue  ",
      "stateProvinceGeoId": "TX"
    },
    "shipmentItems": [
      {
        "shipmentId": "4094508",
        "shipmentItemSeqId": "00001",
        "orderId": "3432206",
        "orderItemSeqId": "00102",
        "shopifyOrderLineId": "11758577287302",
        "shipGroupSeqId": "00003",
        "quantity": 1
      }
    ]
  },
  {
    "orderId": "3433454",
    "orderName": "SMUS#7262810",
    "shopifyOrderId": "4702982897797",
    "trackingNumber": "781026278750",
    "trackingUrl": "",
    "carrierPartyId": "FEDEX",
    "shipmentMethodTypeId": "GROUND_HOME",
    "shipTo": {
      "houseNumberExt": null,
      "contactMechId": "19016208",
      "toName": "Jaqueline Fuentes",
      "address1": "30 Healy Street  ",
      "address2": null,
      "geoPointId": "4152681",
      "postalCode": "11743",
      "stateProvinceGeoId": "NY",
      "postalCodeGeoId": null,
      "houseNumber": null,
      "encodedAddressKey": null,
      "postalCodeExt": null,
      "countryGeoId": "USA",
      "countryGeoCode": "US",
      "attnName": null,
      "city": "Huntington",
      "directions": null,
      "countyGeoId": null,
      "cityGeoId": null,
      "municipalityGeoId": null,
      "stateProvinceGeoCode": "NY"
    },
    "shipmentItems": [
      {
        "shipmentId": "4094511",
        "shipmentItemSeqId": "00001",
        "orderId": "3433454",
        "orderItemSeqId": "00104",
        "shopifyOrderLineId": "11759054815365",
        "shipGroupSeqId": "00003",
        "quantity": 1
      },
      {
        "shipmentId": "4094511",
        "shipmentItemSeqId": "00002",
        "orderId": "3433454",
        "orderItemSeqId": "00106",
        "shopifyOrderLineId": "11759054749829",
        "shipGroupSeqId": "00003",
        "quantity": 1
      }
    ]
  }
]
```

