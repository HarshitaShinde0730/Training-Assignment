**INPUT JSON**:
```json
[
  {
    "productStoreId": "SM_STORE",
    "orderId": "68731",
    "orderName": "SM00002823",
    "orderDate": "2024-10-07T09:16:25-04:00",
    "orderTypeId": null,
    "orderStatusId": "ORDER_APPROVED",
    "entryDate": "2024-10-07T09:19:15-04:00",
    "grandTotal": 232.91,
    "shopId": null,
    "orderItemSeqId": null,
    "itemStatusId": null,
    "unitPrice": null,
    "orderItemExternalId": null,
    "shipGroupSeqId": null,
    "slaShipmentMethodTypeId": null,
    "postalContactMechId": null,
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
    "salesChannel": "POS_CHANNEL",
    "orderExternalId": "SM00002823",
    "customerFirstName": "mar",
    "customerLastName": "srr",
    "currency": "USD",
    "customerPartyId": "50790",
    "isShippingChargesSent": "N",
    "orderIdentifications": [
      {
        "orderIdentificationTypeId": "PS_ORD_ID",
        "fromDate": "2024-10-07T09:19:15-04:00",
        "lastUpdatedStamp": "2024-10-07T09:19:15-04:00",
        "orderId": "68731",
        "idValue": "SM00002823",
        "thruDate": null
      }
    ],
    "orderAttributes": [
      {
        "attrValue": "1f7e59a3-ff94-45ad-940b-9369501e76b7",
        "attrDescription": null,
        "lastUpdatedStamp": "2024-10-07T09:19:15-04:00",
        "orderId": "68731",
        "attrName": "ps_installation_id"
      }
    ],
    "customerPartyIdentifications": [],
    "payments": [
      {
        "createdDate": "2024-10-07T09:19:15-04:00",
        "manualAuthCode": "a04c18f1-39cc-449a-bd14-41e62cd25285",
        "statusId": "PAYMENT_SETTLED",
        "paymentMode": "NoReader",
        "applicationIdentifier": null,
        "paymentMethodCode": "Cash",
        "requestId": null,
        "returnId": null,
        "paymentMethodTypeId": "CASH",
        "amount": 232.91,
        "manualRefNum": "133-ANY-20241007161619-3-4",
        "orderId": "68731",
        "paymentMethodDescription": "Cash"
      }
    ],
    "billTo": {
      "email": null,
      "phone": null
    },
    "orderAdjustments": [
      {
        "customerReferenceId": null,
        "correspondingProductId": null,
        "orderItemSeqId": "_NA_",
        "includeInShipping": null,
        "description": null,
        "exemptAmount": null,
        "productPromoId": null,
        "taxAuthPartyId": null,
        "lastModifiedByUserLogin": null,
        "oldPercentage": null,
        "primaryGeoId": null,
        "taxAuthGeoId": null,
        "originalAdjustmentId": null,
        "secondaryGeoId": null,
        "createdByUserLogin": null,
        "orderAdjustmentId": null,
        "amountAlreadyIncluded": null,
        "lastUpdatedStamp": null,
        "comments": null,
        "recurringAmount": null,
        "lastModifiedDate": null,
        "sourceReferenceId": null,
        "productPromoRuleId": null,
        "isManual": null,
        "productFeatureId": null,
        "taxAuthorityRateSeqId": null,
        "overrideGlAccountId": null,
        "oldAmountPerQuantity": null,
        "shipGroupSeqId": null,
        "includeInTax": null,
        "createdDate": null,
        "productPromoActionSeqId": null,
        "sourcePercentage": null,
        "orderAdjustmentTypeId": "SHIPPING_CHARGES",
        "orderId": "68731",
        "amount": 18
      }
    ],
    "shipments": [
      {
        "trackingNumber": null,
        "carrierPartyId": null,
        "actualCarrierCode": null,
        "shipmentMethodTypeId": null,
        "trackingUrl": "",
        "shipTo": {
          "email": "marsrr@yahoo.com",
          "phone": null
        },
        "shipmentItems": [
          {
            "productStoreId": "SM_STORE",
            "orderId": "68731",
            "orderName": "SM00002823",
            "orderDate": "2024-10-07T09:16:25-04:00",
            "orderStatusId": "ORDER_APPROVED",
            "orderExternalId": "SM00002823",
            "entryDate": "2024-10-07T09:19:15-04:00",
            "grandTotal": 232.91,
            "currency": "USD",
            "salesChannel": "POS_CHANNEL",
            "orderItemSeqId": "00102",
            "itemStatusId": "ITEM_COMPLETED",
            "unitPrice": 50,
            "orderItemExternalId": "SM00002823-2",
            "customerPartyId": "50790",
            "customerFirstName": "mar",
            "customerLastName": "srr",
            "shipGroupSeqId": "00002",
            "maySplit": "Y",
            "slaShipmentMethodTypeId": "POS_COMPLETED",
            "postalContactMechId": null,
            "telecomContactMechId": null,
            "orderFacilityId": "133",
            "itemQuantity": 1,
            "facilityId": "133",
            "facilityExternalId": "133",
            "facilityTypeId": "RETAIL_STORE",
            "parentFacilityTypeId": "PHYSICAL_STORE",
            "statusDatetime": "2024-10-07T09:19:15-04:00",
            "productId": "97241",
            "internalName": "39441630756935",
            "shippedQuantity": 1,
            "shipmentId": null,
            "shipmentItemSeqId": null,
            "shipmentStatusId": null,
            "shipToContactMechId": null,
            "shipToTelecomContactMechId": null,
            "shipmentTypeId": null,
            "trackingNumber": null,
            "carrierPartyId": null,
            "shipmentMethodTypeId": null,
            "productTypeId": "FINISHED_GOOD",
            "isPhysical": "Y",
            "isDigital": "N",
            "actualCarrierCode": null,
            "goodIdentifications": [
              {
                "productId": "97241",
                "idValue": "KENL02S1001060",
                "lastUpdatedStamp": "2024-09-29T00:00:29-04:00",
                "fromDate": "2024-05-13T12:40:58-04:00",
                "goodIdentificationTypeId": "ERP_ID",
                "thruDate": null
              },
              {
                "productId": "97241",
                "fromDate": "2024-05-14T15:00:23-04:00",
                "idValue": "39441630756935",
                "goodIdentificationTypeId": "SHOPIFY_PROD_ID",
                "lastUpdatedStamp": "2024-10-04T07:10:11-04:00",
                "thruDate": null
              },
              {
                "productId": "97241",
                "fromDate": "2021-08-11T17:31:44-04:00",
                "idValue": "KENLEY",
                "lastUpdatedStamp": "2024-10-04T07:10:11-04:00",
                "goodIdentificationTypeId": "SHOPIFY_PROD_SKU",
                "thruDate": null
              },
              {
                "productId": "97241",
                "lastUpdatedStamp": "2024-10-04T07:10:11-04:00",
                "goodIdentificationTypeId": "SKU",
                "idValue": "KENLEY",
                "fromDate": "2022-05-16T02:29:15-04:00",
                "thruDate": null
              },
              {
                "productId": "97241",
                "fromDate": "2021-08-11T17:31:44-04:00",
                "goodIdentificationTypeId": "UPCA",
                "lastUpdatedStamp": "2024-06-09T05:18:18-04:00",
                "idValue": "195189746396",
                "thruDate": null
              }
            ],
            "orderItemAdjustments": [],
            "orderItemAttributes": [
              {
                "attrDescription": null,
                "orderItemSeqId": "00102",
                "lastUpdatedStamp": "2024-10-07T09:19:15-04:00",
                "orderId": "68731",
                "attrName": "approvingManagerId",
                "attrValue": "ser01"
              },
              {
                "attrDescription": null,
                "orderItemSeqId": "00102",
                "orderId": "68731",
                "attrValue": "ser01",
                "attrName": "StoreAssociatedExternalId",
                "lastUpdatedStamp": "2024-10-07T09:19:15-04:00"
              }
            ],
            "facilityGroupMembers": [
              {
                "facilityId": "133",
                "fromDate": "2024-05-14T05:42:52-04:00",
                "sequenceNum": null,
                "lastUpdatedStamp": "2024-05-14T05:42:52-04:00",
                "facilityGroupId": "ALL_SM_M3_LOCATIONS",
                "thruDate": null
              },
              {
                "facilityId": "133",
                "fromDate": "2024-07-20T11:24:43-04:00",
                "sequenceNum": null,
                "facilityGroupId": "ALL_SM_M3_LOCATIONS",
                "lastUpdatedStamp": "2024-07-20T11:24:45-04:00",
                "thruDate": null
              },
              {
                "facilityId": "133",
                "sequenceNum": null,
                "fromDate": "2024-07-20T11:25:08-04:00",
                "facilityGroupId": "ALL_SM_M3_LOCATIONS",
                "lastUpdatedStamp": "2024-07-20T11:25:12-04:00",
                "thruDate": null
              },
              {
                "sequenceNum": 300,
                "facilityId": "133",
                "facilityGroupId": "AUTO_SHIPPING_LABEL",
                "fromDate": "2020-06-25T12:41:23-04:00",
                "thruDate": null,
                "lastUpdatedStamp": "2021-09-29T01:16:19-04:00"
              },
              {
                "sequenceNum": 300,
                "facilityId": "133",
                "facilityGroupId": "DO_PICKING",
                "fromDate": "2020-06-25T12:41:23-04:00",
                "lastUpdatedStamp": "2021-09-29T01:16:19-04:00",
                "thruDate": null
              },
              {
                "sequenceNum": 300,
                "facilityId": "133",
                "lastUpdatedStamp": "2021-09-29T01:16:19-04:00",
                "fromDate": "2020-06-25T12:41:23-04:00",
                "facilityGroupId": "DO_RATE_SHOP",
                "thruDate": null
              },
              {
                "facilityId": "133",
                "sequenceNum": null,
                "facilityGroupId": "M3_FAC",
                "fromDate": "2024-05-15T06:44:44-04:00",
                "thruDate": null,
                "lastUpdatedStamp": "2024-05-15T06:44:47-04:00"
              },
              {
                "fromDate": "2024-05-13T05:39:15-04:00",
                "facilityId": "133",
                "lastUpdatedStamp": "2024-05-13T05:39:15-04:00",
                "sequenceNum": null,
                "facilityGroupId": "M3_STORES",
                "thruDate": null
              },
              {
                "facilityGroupId": "OMS_FULFILLMENT",
                "sequenceNum": 300,
                "facilityId": "133",
                "lastUpdatedStamp": "2021-09-29T01:16:19-04:00",
                "fromDate": "2020-06-25T12:41:23-04:00",
                "thruDate": null
              },
              {
                "facilityId": "133",
                "fromDate": "2023-10-19T08:18:04-04:00",
                "sequenceNum": null,
                "facilityGroupId": "SMUS_BROKERING_GROUP",
                "thruDate": null,
                "lastUpdatedStamp": "2023-10-19T08:18:04-04:00"
              },
              {
                "facilityId": "133",
                "sequenceNum": null,
                "lastUpdatedStamp": "2023-10-19T08:24:39-04:00",
                "facilityGroupId": "SMUS_ST_BRK_GRP",
                "fromDate": "2023-10-19T08:24:39-04:00",
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
    "orderId": "68732",
    "orderName": "SM00002824",
    "orderDate": "2024-10-07T09:17:55-04:00",
    "orderTypeId": null,
    "orderStatusId": "ORDER_APPROVED",
    "entryDate": "2024-10-07T09:19:15-04:00",
    "grandTotal": 223.05,
    "shopId": null,
    "orderItemSeqId": null,
    "itemStatusId": null,
    "unitPrice": null,
    "orderItemExternalId": null,
    "shipGroupSeqId": null,
    "slaShipmentMethodTypeId": null,
    "postalContactMechId": null,
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
    "salesChannel": "POS_CHANNEL",
    "orderExternalId": "SM00002824",
    "customerFirstName": "mar",
    "customerLastName": "srr",
    "currency": "USD",
    "customerPartyId": "50790",
    "isShippingChargesSent": "N",
    "orderIdentifications": [
      {
        "idValue": "SM00002824",
        "orderIdentificationTypeId": "PS_ORD_ID",
        "fromDate": "2024-10-07T09:19:15-04:00",
        "lastUpdatedStamp": "2024-10-07T09:19:15-04:00",
        "orderId": "68732",
        "thruDate": null
      }
    ],
    "orderAttributes": [
      {
        "lastUpdatedStamp": "2024-10-07T09:19:15-04:00",
        "attrValue": "1f7e59a3-ff94-45ad-940b-9369501e76b7",
        "attrDescription": null,
        "orderId": "68732",
        "attrName": "ps_installation_id"
      }
    ],
    "customerPartyIdentifications": [],
    "payments": [
      {
        "manualAuthCode": "ef418b65-e17c-4d87-a4c8-4a0560b8646b",
        "statusId": "PAYMENT_SETTLED",
        "createdDate": "2024-10-07T09:19:15-04:00",
        "manualRefNum": "133-ANY-20241007161750-4-4",
        "paymentMode": "NoReader",
        "applicationIdentifier": null,
        "paymentMethodCode": "Cash",
        "requestId": null,
        "returnId": null,
        "paymentMethodTypeId": "CASH",
        "orderId": "68732",
        "amount": 223.05,
        "paymentMethodDescription": "Cash"
      }
    ],
    "billTo": {
      "email": null,
      "phone": null
    },
    "orderAdjustments": [
      {
        "customerReferenceId": null,
        "amount": 8.95,
        "correspondingProductId": null,
        "orderItemSeqId": "_NA_",
        "includeInShipping": null,
        "description": null,
        "exemptAmount": null,
        "productPromoId": null,
        "taxAuthPartyId": null,
        "lastModifiedByUserLogin": null,
        "oldPercentage": null,
        "primaryGeoId": null,
        "taxAuthGeoId": null,
        "originalAdjustmentId": null,
        "secondaryGeoId": null,
        "createdByUserLogin": null,
        "orderAdjustmentId": null,
        "amountAlreadyIncluded": null,
        "lastUpdatedStamp": null,
        "comments": null,
        "recurringAmount": null,
        "lastModifiedDate": null,
        "sourceReferenceId": null,
        "productPromoRuleId": null,
        "isManual": null,
        "productFeatureId": null,
        "taxAuthorityRateSeqId": null,
        "overrideGlAccountId": null,
        "oldAmountPerQuantity": null,
        "shipGroupSeqId": null,
        "includeInTax": null,
        "createdDate": null,
        "productPromoActionSeqId": null,
        "sourcePercentage": null,
        "orderAdjustmentTypeId": "SHIPPING_CHARGES",
        "orderId": "68732"
      }
    ],
    "shipments": [
      {
        "trackingNumber": null,
        "carrierPartyId": null,
        "actualCarrierCode": null,
        "shipmentMethodTypeId": null,
        "trackingUrl": "",
        "shipTo": {
          "email": "marsrr@yahoo.com",
          "phone": null
        },
        "shipmentItems": [
          {
            "productStoreId": "SM_STORE",
            "orderId": "68732",
            "orderName": "SM00002824",
            "orderDate": "2024-10-07T09:17:55-04:00",
            "orderStatusId": "ORDER_APPROVED",
            "orderExternalId": "SM00002824",
            "entryDate": "2024-10-07T09:19:15-04:00",
            "grandTotal": 223.05,
            "currency": "USD",
            "salesChannel": "POS_CHANNEL",
            "orderItemSeqId": "00102",
            "itemStatusId": "ITEM_COMPLETED",
            "unitPrice": 50,
            "orderItemExternalId": "SM00002824-2",
            "customerPartyId": "50790",
            "customerFirstName": "mar",
            "customerLastName": "srr",
            "shipGroupSeqId": "00002",
            "maySplit": "Y",
            "slaShipmentMethodTypeId": "POS_COMPLETED",
            "postalContactMechId": null,
            "telecomContactMechId": null,
            "orderFacilityId": "133",
            "itemQuantity": 1,
            "facilityId": "133",
            "facilityExternalId": "133",
            "facilityTypeId": "RETAIL_STORE",
            "parentFacilityTypeId": "PHYSICAL_STORE",
            "statusDatetime": "2024-10-07T09:19:15-04:00",
            "productId": "97241",
            "internalName": "39441630756935",
            "shippedQuantity": 1,
            "shipmentId": null,
            "shipmentItemSeqId": null,
            "shipmentStatusId": null,
            "shipToContactMechId": null,
            "shipToTelecomContactMechId": null,
            "shipmentTypeId": null,
            "trackingNumber": null,
            "carrierPartyId": null,
            "shipmentMethodTypeId": null,
            "productTypeId": "FINISHED_GOOD",
            "isPhysical": "Y",
            "isDigital": "N",
            "actualCarrierCode": null,
            "goodIdentifications": [
              {
                "productId": "97241",
                "idValue": "KENL02S1001060",
                "lastUpdatedStamp": "2024-09-29T00:00:29-04:00",
                "fromDate": "2024-05-13T12:40:58-04:00",
                "goodIdentificationTypeId": "ERP_ID",
                "thruDate": null
              },
              {
                "productId": "97241",
                "fromDate": "2024-05-14T15:00:23-04:00",
                "idValue": "39441630756935",
                "goodIdentificationTypeId": "SHOPIFY_PROD_ID",
                "lastUpdatedStamp": "2024-10-04T07:10:11-04:00",
                "thruDate": null
              },
              {
                "productId": "97241",
                "fromDate": "2021-08-11T17:31:44-04:00",
                "idValue": "KENLEY",
                "lastUpdatedStamp": "2024-10-04T07:10:11-04:00",
                "goodIdentificationTypeId": "SHOPIFY_PROD_SKU",
                "thruDate": null
              },
              {
                "productId": "97241",
                "lastUpdatedStamp": "2024-10-04T07:10:11-04:00",
                "goodIdentificationTypeId": "SKU",
                "idValue": "KENLEY",
                "fromDate": "2022-05-16T02:29:15-04:00",
                "thruDate": null
              },
              {
                "productId": "97241",
                "fromDate": "2021-08-11T17:31:44-04:00",
                "goodIdentificationTypeId": "UPCA",
                "lastUpdatedStamp": "2024-06-09T05:18:18-04:00",
                "idValue": "195189746396",
                "thruDate": null
              }
            ],
            "orderItemAdjustments": [],
            "orderItemAttributes": [
              {
                "attrDescription": null,
                "lastUpdatedStamp": "2024-10-07T09:19:15-04:00",
                "orderItemSeqId": "00102",
                "orderId": "68732",
                "attrName": "approvingManagerId",
                "attrValue": "ser01"
              },
              {
                "lastUpdatedStamp": "2024-10-07T09:19:15-04:00",
                "attrDescription": null,
                "orderItemSeqId": "00102",
                "orderId": "68732",
                "attrValue": "ser01",
                "attrName": "StoreAssociatedExternalId"
              }
            ],
            "facilityGroupMembers": [
              {
                "facilityId": "133",
                "fromDate": "2024-05-14T05:42:52-04:00",
                "sequenceNum": null,
                "lastUpdatedStamp": "2024-05-14T05:42:52-04:00",
                "facilityGroupId": "ALL_SM_M3_LOCATIONS",
                "thruDate": null
              },
              {
                "facilityId": "133",
                "fromDate": "2024-07-20T11:24:43-04:00",
                "sequenceNum": null,
                "facilityGroupId": "ALL_SM_M3_LOCATIONS",
                "lastUpdatedStamp": "2024-07-20T11:24:45-04:00",
                "thruDate": null
              },
              {
                "facilityId": "133",
                "sequenceNum": null,
                "fromDate": "2024-07-20T11:25:08-04:00",
                "facilityGroupId": "ALL_SM_M3_LOCATIONS",
                "lastUpdatedStamp": "2024-07-20T11:25:12-04:00",
                "thruDate": null
              },
              {
                "sequenceNum": 300,
                "facilityId": "133",
                "facilityGroupId": "AUTO_SHIPPING_LABEL",
                "fromDate": "2020-06-25T12:41:23-04:00",
                "thruDate": null,
                "lastUpdatedStamp": "2021-09-29T01:16:19-04:00"
              },
              {
                "sequenceNum": 300,
                "facilityId": "133",
                "facilityGroupId": "DO_PICKING",
                "fromDate": "2020-06-25T12:41:23-04:00",
                "lastUpdatedStamp": "2021-09-29T01:16:19-04:00",
                "thruDate": null
              },
              {
                "sequenceNum": 300,
                "facilityId": "133",
                "lastUpdatedStamp": "2021-09-29T01:16:19-04:00",
                "fromDate": "2020-06-25T12:41:23-04:00",
                "facilityGroupId": "DO_RATE_SHOP",
                "thruDate": null
              },
              {
                "facilityId": "133",
                "sequenceNum": null,
                "facilityGroupId": "M3_FAC",
                "fromDate": "2024-05-15T06:44:44-04:00",
                "thruDate": null,
                "lastUpdatedStamp": "2024-05-15T06:44:47-04:00"
              },
              {
                "fromDate": "2024-05-13T05:39:15-04:00",
                "facilityId": "133",
                "lastUpdatedStamp": "2024-05-13T05:39:15-04:00",
                "sequenceNum": null,
                "facilityGroupId": "M3_STORES",
                "thruDate": null
              },
              {
                "facilityGroupId": "OMS_FULFILLMENT",
                "sequenceNum": 300,
                "facilityId": "133",
                "lastUpdatedStamp": "2021-09-29T01:16:19-04:00",
                "fromDate": "2020-06-25T12:41:23-04:00",
                "thruDate": null
              },
              {
                "facilityId": "133",
                "fromDate": "2023-10-19T08:18:04-04:00",
                "sequenceNum": null,
                "facilityGroupId": "SMUS_BROKERING_GROUP",
                "thruDate": null,
                "lastUpdatedStamp": "2023-10-19T08:18:04-04:00"
              },
              {
                "facilityId": "133",
                "sequenceNum": null,
                "lastUpdatedStamp": "2023-10-19T08:24:39-04:00",
                "facilityGroupId": "SMUS_ST_BRK_GRP",
                "fromDate": "2023-10-19T08:24:39-04:00",
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
    "orderId": "68541",
    "orderName": "SMUS#14553",
    "orderDate": "2024-10-03T17:06:18-04:00",
    "orderTypeId": null,
    "orderStatusId": "ORDER_COMPLETED",
    "entryDate": "2024-10-03T18:08:27-04:00",
    "grandTotal": 127.95,
    "shopId": "10000",
    "orderItemSeqId": null,
    "itemStatusId": null,
    "unitPrice": null,
    "orderItemExternalId": null,
    "shipGroupSeqId": null,
    "slaShipmentMethodTypeId": null,
    "postalContactMechId": null,
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
    "salesChannel": "CSR_CHANNEL",
    "orderExternalId": "5640454373447",
    "customerFirstName": "cat",
    "customerLastName": "lin",
    "currency": "USD",
    "customerPartyId": "50459",
    "isShippingChargesSent": "N",
    "orderIdentifications": [
      {
        "fromDate": "2024-10-03T18:08:27-04:00",
        "lastUpdatedStamp": "2024-10-03T18:08:27-04:00",
        "orderId": "68541",
        "idValue": "5640454373447",
        "orderIdentificationTypeId": "SHOPIFY_ORD_ID",
        "thruDate": null
      },
      {
        "lastUpdatedStamp": "2024-10-03T18:08:27-04:00",
        "idValue": "SMUS#14553",
        "fromDate": "2024-10-03T18:08:27-04:00",
        "orderIdentificationTypeId": "SHOPIFY_ORD_NAME",
        "orderId": "68541",
        "thruDate": null
      },
      {
        "idValue": "14553",
        "lastUpdatedStamp": "2024-10-03T18:08:27-04:00",
        "orderIdentificationTypeId": "SHOPIFY_ORD_NO",
        "fromDate": "2024-10-03T18:08:27-04:00",
        "orderId": "68541",
        "thruDate": null
      }
    ],
    "orderAttributes": [
      {
        "lastUpdatedStamp": "2024-10-03T18:08:27-04:00",
        "attrDescription": "Shopify User Id",
        "orderId": "68541",
        "attrName": "shopify_user_id",
        "attrValue": "29451485255"
      }
    ],
    "customerPartyIdentifications": [
      {
        "partyId": "50459",
        "idValue": "7007978782791",
        "partyIdentificationTypeId": "SHOPIFY_CUST_ID",
        "lastUpdatedStamp": "2024-09-09T13:20:10-04:00"
      }
    ],
    "payments": [
      {
        "paymentMethodCode": null,
        "paymentMethodTypeId": "EXT_SHOP_OTHR_GTWAY",
        "paymentMethodDescription": "Ext Other Gateways",
        "paymentMode": null,
        "statusId": "PAYMENT_SETTLED",
        "manualAuthCode": null,
        "manualRefNum": "7127202660423",
        "applicationIdentifier": null,
        "createdDate": "2024-10-03T18:08:28-04:00",
        "requestId": null,
        "returnId": null,
        "orderId": "68541",
        "amount": 127.95
      }
    ],
    "billTo": {
      "email": null,
      "phone": null
    },
    "orderAdjustments": [
      {
        "customerReferenceId": null,
        "correspondingProductId": null,
        "orderItemSeqId": "_NA_",
        "includeInShipping": null,
        "description": null,
        "exemptAmount": null,
        "productPromoId": null,
        "taxAuthPartyId": null,
        "lastModifiedByUserLogin": null,
        "oldPercentage": null,
        "orderAdjustmentTypeId": "SHIPPING_SALES_TAX",
        "primaryGeoId": null,
        "orderId": "68541",
        "taxAuthGeoId": null,
        "originalAdjustmentId": null,
        "secondaryGeoId": null,
        "createdByUserLogin": null,
        "orderAdjustmentId": null,
        "amountAlreadyIncluded": null,
        "lastUpdatedStamp": null,
        "comments": null,
        "recurringAmount": null,
        "lastModifiedDate": null,
        "sourceReferenceId": null,
        "productPromoRuleId": null,
        "isManual": null,
        "productFeatureId": null,
        "taxAuthorityRateSeqId": null,
        "overrideGlAccountId": null,
        "oldAmountPerQuantity": null,
        "shipGroupSeqId": null,
        "includeInTax": null,
        "createdDate": null,
        "amount": 1.07,
        "productPromoActionSeqId": null,
        "sourcePercentage": null
      },
      {
        "customerReferenceId": null,
        "correspondingProductId": null,
        "orderItemSeqId": "_NA_",
        "includeInShipping": null,
        "description": null,
        "exemptAmount": null,
        "productPromoId": null,
        "taxAuthPartyId": null,
        "lastModifiedByUserLogin": null,
        "oldPercentage": null,
        "primaryGeoId": null,
        "orderId": "68541",
        "taxAuthGeoId": null,
        "originalAdjustmentId": null,
        "secondaryGeoId": null,
        "createdByUserLogin": null,
        "orderAdjustmentId": null,
        "amountAlreadyIncluded": null,
        "lastUpdatedStamp": null,
        "comments": null,
        "recurringAmount": null,
        "lastModifiedDate": null,
        "sourceReferenceId": null,
        "productPromoRuleId": null,
        "isManual": null,
        "productFeatureId": null,
        "taxAuthorityRateSeqId": null,
        "overrideGlAccountId": null,
        "oldAmountPerQuantity": null,
        "shipGroupSeqId": null,
        "includeInTax": null,
        "createdDate": null,
        "productPromoActionSeqId": null,
        "sourcePercentage": null,
        "orderAdjustmentTypeId": "SHIPPING_CHARGES",
        "amount": 18
      }
    ],
    "shipments": [
      {
        "trackingNumber": null,
        "carrierPartyId": "_NA_",
        "actualCarrierCode": null,
        "shipmentMethodTypeId": "SECOND_DAY",
        "trackingUrl": "",
        "shipTo": {
          "countryGeoCode": "US",
          "stateProvinceGeoCode": "CT",
          "stateProvinceGeoName": "Connecticut",
          "countryGeoName": "United States",
          "contactMechId": "256644",
          "toName": "cat lin",
          "attnName": null,
          "address1": "16 Fair St",
          "address2": null,
          "houseNumber": null,
          "houseNumberExt": null,
          "directions": null,
          "city": "Norwalk",
          "cityGeoId": null,
          "postalCode": "06851",
          "postalCodeExt": null,
          "countryGeoId": "USA",
          "stateProvinceGeoId": "CT",
          "countyGeoId": null,
          "municipalityGeoId": null,
          "postalCodeGeoId": null,
          "geoPointId": "61147",
          "encodedAddressKey": null,
          "latitude": 41.121398,
          "longitude": -73.4206872,
          "email": "kitcat@yahoo.com",
          "phone": {
            "contactMechId": "256645",
            "countryCode": "1",
            "areaCode": null,
            "askForName": null,
            "lastUpdatedStamp": "2024-10-03T18:08:27-04:00",
            "contactNumber": "6767788878"
          }
        },
        "shipmentItems": [
          {
            "productStoreId": "SM_STORE",
            "orderId": "68541",
            "orderName": "SMUS#14553",
            "orderDate": "2024-10-03T17:06:18-04:00",
            "orderStatusId": "ORDER_COMPLETED",
            "orderExternalId": "5640454373447",
            "entryDate": "2024-10-03T18:08:27-04:00",
            "grandTotal": 127.95,
            "currency": "USD",
            "salesChannel": "CSR_CHANNEL",
            "orderItemSeqId": "00101",
            "itemStatusId": "ITEM_COMPLETED",
            "unitPrice": 109.95,
            "orderItemExternalId": "14014481825863",
            "customerPartyId": "50459",
            "customerFirstName": "cat",
            "customerLastName": "lin",
            "shipGroupSeqId": "00001",
            "maySplit": "Y",
            "slaShipmentMethodTypeId": "SECOND_DAY",
            "postalContactMechId": "256644",
            "telecomContactMechId": "256645",
            "orderFacilityId": null,
            "itemQuantity": 1,
            "facilityId": "990",
            "facilityExternalId": "990",
            "facilityTypeId": "RETAIL_STORE",
            "parentFacilityTypeId": "PHYSICAL_STORE",
            "statusDatetime": "2024-10-07T09:22:13-04:00",
            "productId": "82290",
            "internalName": "39441107517511",
            "shippedQuantity": 1,
            "shipmentId": "37593",
            "shipmentItemSeqId": "00001",
            "shipmentStatusId": "SHIPMENT_SHIPPED",
            "shipToContactMechId": "256644",
            "shipToTelecomContactMechId": "256645",
            "shipmentTypeId": "SALES_SHIPMENT",
            "trackingNumber": null,
            "carrierPartyId": "_NA_",
            "shipmentMethodTypeId": "SECOND_DAY",
            "productTypeId": "FINISHED_GOOD",
            "isPhysical": "Y",
            "isDigital": "N",
            "actualCarrierCode": null,
            "goodIdentifications": [
              {
                "productId": "82290",
                "goodIdentificationTypeId": "SHOPIFY_PROD_ID",
                "fromDate": "2024-10-03T19:10:13-04:00",
                "idValue": "39441107517511",
                "lastUpdatedStamp": "2024-10-03T19:10:13-04:00",
                "thruDate": null
              },
              {
                "fromDate": "2021-08-11T10:39:14-04:00",
                "idValue": "LESSA",
                "productId": "82290",
                "lastUpdatedStamp": "2024-10-03T19:10:13-04:00",
                "goodIdentificationTypeId": "SHOPIFY_PROD_SKU",
                "thruDate": null
              },
              {
                "idValue": "LESSA",
                "productId": "82290",
                "fromDate": "2022-05-16T02:31:05-04:00",
                "goodIdentificationTypeId": "SKU",
                "lastUpdatedStamp": "2024-10-03T19:10:13-04:00",
                "thruDate": null
              },
              {
                "fromDate": "2021-08-11T10:39:14-04:00",
                "idValue": "195945736371",
                "productId": "82290",
                "lastUpdatedStamp": "2021-08-11T15:09:13-04:00",
                "goodIdentificationTypeId": "UPCA",
                "thruDate": null
              }
            ],
            "orderItemAdjustments": [
              {
                "customerReferenceId": null,
                "correspondingProductId": null,
                "includeInShipping": null,
                "description": null,
                "exemptAmount": null,
                "productPromoId": null,
                "taxAuthPartyId": null,
                "lastModifiedByUserLogin": null,
                "oldPercentage": null,
                "primaryGeoId": null,
                "orderId": "68541",
                "taxAuthGeoId": null,
                "originalAdjustmentId": null,
                "secondaryGeoId": null,
                "createdByUserLogin": null,
                "orderAdjustmentId": null,
                "amountAlreadyIncluded": null,
                "orderAdjustmentTypeId": "SALES_TAX",
                "lastUpdatedStamp": null,
                "comments": null,
                "recurringAmount": null,
                "lastModifiedDate": null,
                "sourceReferenceId": null,
                "productPromoRuleId": null,
                "isManual": null,
                "productFeatureId": null,
                "taxAuthorityRateSeqId": null,
                "overrideGlAccountId": null,
                "oldAmountPerQuantity": null,
                "shipGroupSeqId": null,
                "includeInTax": null,
                "amount": 6.56,
                "createdDate": null,
                "productPromoActionSeqId": null,
                "sourcePercentage": null,
                "orderItemSeqId": "00101"
              }
            ],
            "orderItemAttributes": [],
            "facilityGroupMembers": [
              {
                "facilityId": "990",
                "lastUpdatedStamp": "2021-09-29T01:16:19-04:00",
                "facilityGroupId": "AUTO_SHIPPING_LABEL",
                "sequenceNum": 725,
                "fromDate": "2020-06-25T12:41:24-04:00",
                "thruDate": null
              },
              {
                "facilityId": "990",
                "lastUpdatedStamp": "2021-09-29T01:16:19-04:00",
                "facilityGroupId": "DO_PICKING",
                "fromDate": "2020-06-25T12:41:24-04:00",
                "sequenceNum": 725,
                "thruDate": null
              },
              {
                "facilityId": "990",
                "lastUpdatedStamp": "2021-09-29T01:16:19-04:00",
                "fromDate": "2020-06-25T12:41:24-04:00",
                "sequenceNum": 725,
                "facilityGroupId": "DO_RATE_SHOP",
                "thruDate": null
              },
              {
                "facilityId": "990",
                "fromDate": "2024-10-03T02:24:54-04:00",
                "lastUpdatedStamp": "2024-10-03T02:25:00-04:00",
                "sequenceNum": null,
                "facilityGroupId": "FAC_ALOW_NEG_INV_RES",
                "thruDate": null
              },
              {
                "facilityId": "990",
                "facilityGroupId": "OMS_FULFILLMENT",
                "lastUpdatedStamp": "2021-09-29T01:16:19-04:00",
                "sequenceNum": 725,
                "fromDate": "2020-06-25T12:41:24-04:00",
                "thruDate": null
              },
              {
                "facilityId": "990",
                "fromDate": "2024-10-03T02:41:45-04:00",
                "sequenceNum": null,
                "lastUpdatedStamp": "2024-10-03T02:41:51-04:00",
                "facilityGroupId": "ORSI_FAC",
                "thruDate": null
              },
              {
                "facilityId": "990",
                "sequenceNum": null,
                "lastUpdatedStamp": "2024-01-19T05:03:43-05:00",
                "facilityGroupId": "SUPERGA_FAC_GRP",
                "fromDate": "2024-01-19T05:03:35-05:00",
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
**JOLT SPEC**:
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
                "#Y": "[#6].isShopifyOrderIdExist"
              }
            }
          }
        },
        "shipments": {
          "*": {
            "@(2,orderIdentifications)": {
              "*": {
                "orderIdentificationTypeId": {
                  "SHOPIFY_ORD_ID": {
                    "@(2,idValue)": "[#8].&6.[&5].shopifyOrderId"
                  }
                }
              }
            }
          }
        },
        "@": "[&]"
      }
    }
  },
  {
    "operation": "modify-default-beta",
    "spec": {
      "*": {
        "shipments": {
          "*": {
            "shipmentItems": {
              "*": {
                "shipmentItemQuantity": ["=notNull(@(1,shippedQuantity))", "@(1,itemQuantity)"]
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
        "isShopifyOrderIdExist": {
          "Y": {
            "@(2,shipments)": {
              "*": {
                "@(4,orderId)": "[#6].shipmentMap&1.orderId",
                "@(4,orderName)": "[#6].shipmentMap&1.orderName",
                "shopifyOrderId": "[#6].shipmentMap&1.shopifyOrderId",
                "trackingNumber": "[#6].shipmentMap&1.trackingNumber",
                "trackingUrl": "[#6].shipmentMap&1.trackingUrl",
                "carrierPartyIdField": "[#6].shipmentMap&1.carrierPartyId",
                "shipmentMethodTypeId": "[#6].shipmentMap&1.shipmentMethodTypeId",
                "shipTo": "[#6].shipmentMap&1.shipTo",
                "shipmentItems": {
                  "*": {
                    "shipmentId": "[#8].shipmentMap&3.shipmentItems[#2].shipmentId",
                    "shipmentItemSeqId": "[#8].shipmentMap&3.shipmentItems[#2].shipmentItemSeqId",
                    "orderId": "[#8].shipmentMap&3.shipmentItems[#2].orderId",
                    "orderItemSeqId": "[#8].shipmentMap&3.shipmentItems[#2].orderItemSeqId",
                    "orderItemExternalId": "[#8].shipmentMap&3.shipmentItems[#2].shopifyOrderLineId",
                    "shipGroupSeqId": "[#8].shipmentMap&3.shipmentItems[#2].shipGroupSeqId",
                    "shipmentItemQuantity": "[#8].shipmentMap&3.shipmentItems[#2].quantity"
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
        "shipmentMap*": "[]"
      }
    }
  }
]
```
**OUTPUT JSON**:
```json
[ {
  "orderId" : "68541",
  "orderName" : "SMUS#14553",
  "shopifyOrderId" : "5640454373447",
  "trackingNumber" : null,
  "trackingUrl" : "",
  "shipmentMethodTypeId" : "SECOND_DAY",
  "shipTo" : {
    "countryGeoCode" : "US",
    "stateProvinceGeoCode" : "CT",
    "stateProvinceGeoName" : "Connecticut",
    "countryGeoName" : "United States",
    "contactMechId" : "256644",
    "toName" : "cat lin",
    "attnName" : null,
    "address1" : "16 Fair St",
    "address2" : null,
    "houseNumber" : null,
    "houseNumberExt" : null,
    "directions" : null,
    "city" : "Norwalk",
    "cityGeoId" : null,
    "postalCode" : "06851",
    "postalCodeExt" : null,
    "countryGeoId" : "USA",
    "stateProvinceGeoId" : "CT",
    "countyGeoId" : null,
    "municipalityGeoId" : null,
    "postalCodeGeoId" : null,
    "geoPointId" : "61147",
    "encodedAddressKey" : null,
    "latitude" : 41.121398,
    "longitude" : -73.4206872,
    "email" : "kitcat@yahoo.com",
    "phone" : {
      "contactMechId" : "256645",
      "countryCode" : "1",
      "areaCode" : null,
      "askForName" : null,
      "lastUpdatedStamp" : "2024-10-03T18:08:27-04:00",
      "contactNumber" : "6767788878"
    }
  },
  "shipmentItems" : [ {
    "shipmentId" : "37593",
    "shipmentItemSeqId" : "00001",
    "orderId" : "68541",
    "orderItemSeqId" : "00101",
    "shopifyOrderLineId" : "14014481825863",
    "shipGroupSeqId" : "00001",
    "quantity" : 1
  } ]
} ]
```