// Importing required packages for implementations
import org.moqui.context.ExecutionContext
import org.moqui.entity.EntityCondition // To implement condition
import org.moqui.entity.EntityFind // To implement find
import org.moqui.entity.EntityValue // To access a single record in the database

ExecutionContext ec =  context.ec // Getting the execution context

// Checking if our email address already exist in contact mech entity
EntityFind ef_cm = ec.entity.find('ecommerce.ContactMech')

if (emailAddress){
    ef_cm.condition("infoString", EntityCondition.EQUALS, emailAddress)
}
EntityValue ev_cm = ef_cm.one()
if (ev_cm){
    ec.message.addError("Record already exists")
}else{
    //    If email address doesn't exist

    //    Creating a record in the party entity
    String partyId = ec.entity.sequencedIdPrimary("ecommerce.Party", null, null)
    partyId = 'PER' + partyId
    EntityValue ev_pe = ec.entity.makeValue('ecommerce.Party')
    ev_pe.set('partyId', partyId)
    ev_pe.set('partyTypeEnumId', 'PtyPerson')
    ev_pe.create()

    // Creating a record in the person entity
    EntityValue ev_per = ec.entity.makeValue('ecommerce.Person')
    ev_per.set('partyId', partyId)
    ev_per.set('firstName', firstName)
    ev_per.set('lastName', lastName)
    ev_per.create()

    //    Creating a record in party role
    EntityValue ev_pr = ec.entity.makeValue('ecommerce.PartyRole')
    ev_pr.set('partyId', partyId)
    ev_pr.set('roleTypeId', 'CUSTOMER')
    ev_pr.create()

    // Creating email address
    EntityValue ev_cm_1 = ec.entity.makeValue('ecommerce.ContactMech')
    def contactMechId1 = ec.entity.sequencedIdPrimary('ecommerce.ContactMech', null, null)
    ev_cm_1.set('contactMechId', contactMechId1)
    ev_cm_1.set('contactMechTypeEnumId', 'ctyEmailAddress')
    ev_cm_1.set('infoString', emailAddress)
    ev_cm_1.create()

    EntityValue ev_pcm_1 = ec.entity.makeValue('ecommerce.PartyContactMech')
    ev_pcm_1.set('partyId', partyId)
    ev_pcm_1.set('contactMechId', contactMechId1)
    ev_pcm_1.set('contactMechPurposeId', 'PRIMARY_EMAIL')
    ev_pcm_1.set('fromDate', System.currentTimeMillis())
    ev_pcm_1.create()

    // --------
    // Creating postal address
    EntityValue ev_cm_2 = ec.entity.makeValue('ecommerce.ContactMech')
    def contactMechId2 = ec.entity.sequencedIdPrimary('ecommerce.ContactMech', null, null)
    ev_cm_2.set('contactMechId', contactMechId2)
    ev_cm_2.set('contactMechTypeEnumId', 'ctyPostalAddress')
    ev_cm_2.create()

    EntityValue postalAddress = ec.entity.makeValue('ecommerce.PostalAddress')
    postalAddress.set('contactMechId', contactMechId2)
    postalAddress.set('address1', address1)
    if (address2){
        postalAddress.set('address2', address2)
    }
    postalAddress.set('city', city)
    postalAddress.set('postalCode', postalCode)
    postalAddress.create()

    EntityValue ev_pcm_2 = ec.entity.makeValue('ecommerce.PartyContactMech')
    ev_pcm_2.set('partyId', partyId)
    ev_pcm_2.set('contactMechId', contactMechId2)
    ev_pcm_2.set('contactMechPurposeId', 'PRIMARY_LOCATION')
    ev_pcm_2.set('fromDate', System.currentTimeMillis())
    ev_pcm_2.create()

    // Creating Telecom Number
    if (contactNumber.length() > 10 || contactNumber.length() < 10){
        ec.message.addError("Invalid contact number. It must be 10 digits.")
    }
    EntityValue ev_cm_3 = ec.entity.makeValue('ecommerce.ContactMech')
    def contactMechId3 = ec.entity.sequencedIdPrimary('ecommerce.ContactMech', null, null)
    ev_cm_3.set('contactMechId', contactMechId3)
    ev_cm_3.set('contactMechTypeEnumId', 'ctyTelecomNumber')
    ev_cm_3.create()

    EntityValue telecomNumber = ec.entity.makeValue('ecommerce.TelecomNumber')
    telecomNumber.set('contactMechId', contactMechId3)
    telecomNumber.set('countryCode', countryCode)
    telecomNumber.set('areaCode', areaCode)
    telecomNumber.set('contactNumber', contactNumber)
    telecomNumber.create()

    EntityValue ev_pcm_3 = ec.entity.makeValue('ecommerce.PartyContactMech')
    ev_pcm_3.set('partyId', partyId)
    ev_pcm_3.set('contactMechId', contactMechId3)
    ev_pcm_3.set('contactMechPurposeId', 'PRIMARY_PHONE')
    ev_pcm_3.set('fromDate', System.currentTimeMillis())
    ev_pcm_3.create()
}