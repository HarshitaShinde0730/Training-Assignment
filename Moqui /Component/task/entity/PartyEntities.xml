```xml
<?xml version="1.0" encoding="UTF-8"?>
<entities xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:noNamespaceSchemaLocation="http://moqui.org/xsd/entity-definition-2.1.xsd">
   <!-- PARTY -->
    <entity entity-name="Party" package="task">
        <field name="partyId" type="id-long" is-pk="true"/>
        <field name="partyType" type="text-short" not-null="true"/>
        <field name="firstname" type="text-short"/>
        <field name="lastname" type="text-short"/>
    </entity>
    <!-- CONTACT_MECH -->
    <entity entity-name="ContactMech" package="task">
        <field name="contactMechId" type="id-long" is-pk="true"/>
        <field name="partyId" type="id-long"/>
        <field name="streetAddress" type="text-long" not-null="true"/>
        <field name="city" type="text-medium"/>
        <field name="state" type="text-short"/>
        <field name="postalCode" type="number-integer"/>
        <relationship type="many" related="Party">
            <key-map field-name="partyId" related="partyId"/>
        </relationship>
    </entity>
    <!-- PRODUCT -->
    <entity entity-name="Product" package="task">
        <field name="productId" type="id-long" is-pk="true"/>
        <field name="productName" type="text-long" not-null="true"/>
        <field name="color" type="text-short"/>
        <field name="size" type="text-short"/>
    </entity>
    <!-- ORDER_HEADER -->
    <entity entity-name="OrderHeader" package="task">
        <field name="orderId" type="id-long" is-pk="true"/>
        <field name="orderDate" type="date" not-null="true"/>
        <field name="partyId" type="id-long"/>
        <field name="shippingContactMechId" type="id-long"/>
        <field name="billingContactMechId" type="id-long"/>
        <relationship type="many" related="Party">
            <key-map field-name="partyId" related="partyId"/>
        </relationship>
        <relationship type="many" related="ContactMech">
            <key-map field-name="shippingContactMechId" related="contactMechId"/>
        </relationship>
        <relationship type="many" related="ContactMech">
            <key-map field-name="billingContactMechId" related="contactMechId"/>
        </relationship>
    </entity>
    <!-- ORDER_ITEM-->
    <entity entity-name="OrderItem" package="task">
        <field name="orderItemSeqId" type="id-long" is-pk="true"/>
        <field name="orderId" type="id-long"/>
        <field name="productId" type="id-long"/>
        <field name="quantity" type="number-integer" not-null="true"/>
        <field name="status" type="text-short"/>
        <relationship type="many" related="OrderHeader">
            <key-map field-name="orderId" related="orderId"/>
        </relationship>
        <relationship type="many" related="Product">
            <key-map field-name="productId" related="productId"/>
        </relationship>
    </entity>
</entities>
```
