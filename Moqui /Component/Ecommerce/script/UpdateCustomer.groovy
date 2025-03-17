// Importing required packages for implementations
import org.moqui.context.ExecutionContext
import org.moqui.entity.EntityCondition // To implement condition
import org.moqui.entity.EntityFind // To implement find
import org.moqui.entity.EntityList //To get the list of EntityValue objects
import org.moqui.entity.EntityValue // To access a single record in the database

ExecutionContext ec =  context.ec // Getting the execution context

EntityFind customerView = ec.entity.find('ecommerce.FindCustomerView')
customerView.condition("infoString", EntityCondition.EQUALS, emailAddress)
EntityValue customerValue = customerView.one()
if (customerValue){
    EntityFind partyContactMech1 = ec.entity.find('ecommerce.PartyContactMech')
    partyContactMech1.condition("partyId", EntityCondition.EQUALS, customerValue.partyId)
    EntityList partyContactMechList = partyContactMech1.list()
    contactMechIdList = []
    for (EntityValue ev in partyContactMechList){
        if (ev.contactMechPurposeId != 'EmailPrimary'){
            contactMechIdList.add(ev.contactMechId)
        }
    }
    for (id in contactMechIdList){
        EntityFind partyContactMech2 = ec.entity.find('ecommerce.PartyContactMech')
        partyContactMech2.condition("contactMechId", EntityCondition.EQUALS, id)
        EntityValue pcm_ev = partyContactMech2.one()
        pcm_ev.set("thruDate", System.currentTimeMillis())
        pcm_ev.update()
    }

    if (areaCode || countryCode || contactNumber){
//        Creating a new contact mechanism
        EntityValue ev_cm_1 = ec.entity.makeValue('ecommerce.ContactMech')
        def contactMechId = ec.entity.sequencedIdPrimary('ecommerce.ContactMech', null, null)
        ev_cm_1.set('contactMechId', contactMechId)
        ev_cm_1.set('contactMechTypeEnumId', 'ctyTelecomNumber')
        ev_cm_1.create()

//        Creating a telecom number
        EntityValue ev_tn_1 = ec.entity.makeValue('ecommerce.TelecomNumber')
        ev_tn_1.set('contactMechId', contactMechId)
        ev_tn_1.set('countryCode', countryCode)
        ev_tn_1.set('areaCode', areaCode)
        ev_tn_1.set('contactNumber', contactNumber)
        ev_tn_1.create()

//        Party Contact Mech
        EntityValue partyContactMech_1 = ec.entity.makeValue('ecommerce.PartyContactMech')
        partyContactMech_1.set('partyId', customerValue.partyId)
        partyContactMech_1.set('contactMechId', contactMechId)
        partyContactMech_1.set('contactMechPurposeId', contactMechPurpose)
        partyContactMech_1.set('fromDate', System.currentTimeMillis())
        partyContactMech_1.create()
    }
    if (address1 || address2 || city || postalCode){
        // Creating a new contact mechanism
        EntityValue ev_cm_1 = ec.entity.makeValue('ecommerce.ContactMech')
        def contactMechId = ec.entity.sequencedIdPrimary('ecommerce.ContactMech', null, null)
        ev_cm_1.set('contactMechId', contactMechId)
        ev_cm_1.set('contactMechTypeEnumId', 'ctyPostalAddress')
        ev_cm_1.create()

//        Creating a new postal address
        EntityValue ev_pa = ec.entity.makeValue('ecommerce.PostalAddress')
        ev_pa.set('contactMechId', contactMechId)
        ev_pa.set('toName', toName)
        ev_pa.set('attnName', attnName)
        ev_pa.set('address1', address1)
        ev_pa.set('address2', address2)
        ev_pa.set('city', city)
        ev_pa.set('postalCode', postalCode)
        ev_pa.create()

        //        Party Contact Mech
        EntityValue partyContactMech_1 = ec.entity.makeValue('ecommerce.PartyContactMech')
        partyContactMech_1.set('partyId', customerValue.partyId)
        partyContactMech_1.set('contactMechId', contactMechId)
        partyContactMech_1.set('contactMechPurposeId', contactMechPurpose)
        partyContactMech_1.set('fromDate', System.currentTimeMillis())
        partyContactMech_1.create()
    }
}else{
    ec.message.addError("Record doesn't exist")
}