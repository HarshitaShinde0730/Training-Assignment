// Importing required packages for implementations
import org.moqui.context.ExecutionContext
import org.moqui.entity.EntityCondition // To implement condition
import org.moqui.entity.EntityFind // To implement find
import org.moqui.entity.EntityList //To get the list of EntityValue objects
import org.moqui.entity.EntityValue // To access a single record in the database


ec.logger.info("-----Service was called-----")
ExecutionContext ec =  context.ec // Getting the execution context

// Finding our Customer View entity
EntityFind ef = ec.entity.find('ecommerce.FindCustomerView')

ef.selectField("partyId")

// Getting all list of records based on partyId
//if (partyId) {
//    ef.condition(
//            ec.entity.conditionFactory.makeCondition(
//                    "partyId", EntityCondition.LIKE, (leadingWildcard ? "%" : "") + partyId + "%")
//                    .ignoreCase())
//}

if (firstName) {
    ef.condition(
            ec.entity.conditionFactory.makeCondition(
                    "firstName", EntityCondition.LIKE, (leadingWildcard ? "%" : "") + firstName + "%")
                    .ignoreCase())
}
if (lastName) {
    ef.condition(
            ec.entity.conditionFactory.makeCondition(
                    "lastName", EntityCondition.LIKE, (leadingWildcard ? "%" : "") + lastName + "%")
                    .ignoreCase())
}

if (emailAddress){
    ef.condition(
            ec.entity.conditionFactory.makeCondition(
                    "infoString", EntityCondition.LIKE, (leadingWildcard ? "%" : "") + emailAddress + "%")
                    .ignoreCase())
}

if (countryCode){
    ef.condition(
            ec.entity.conditionFactory.makeCondition(
                    "countryCode", EntityCondition.LIKE, (leadingWildcard ? "%" : "") + countryCode + "%")
                    .ignoreCase())
}


if (areaCode){
    ef.condition(
            ec.entity.conditionFactory.makeCondition(
                    "areaCode", EntityCondition.LIKE, (leadingWildcard ? "%" : "") + areaCode + "%")
                    .ignoreCase())
}

if (contactNumber){
    ef.condition(
            ec.entity.conditionFactory.makeCondition(
                    "contactNumber", EntityCondition.LIKE, (leadingWildcard ? "%" : "") + contactNumber + "%")
                    .ignoreCase())
}

if (address1){
    ef.condition(ec.entity.conditionFactory.makeCondition("address1", EntityCondition.LIKE,
            (leadingWildcard ? "%":"") + address1 + "%"
    ))
}

if (address2){
    ef.condition(ec.entity.conditionFactory.makeCondition("address1", EntityCondition.LIKE,
            (leadingWildcard ? "%":"") + address2 + "%"
    ))
}

if (city){
    ef.condition(
            ec.entity.conditionFactory.makeCondition(
                    "city", EntityCondition.LIKE, (leadingWildcard ? "%" : "") + city + "%")
                    .ignoreCase())
}

if (postalCode){
    ef.condition(
            ec.entity.conditionFactory.makeCondition(
                    "postalCode", EntityCondition.LIKE, (leadingWildcard ? "%" : "") + postalCode + "%")
                    .ignoreCase())
}

//def combinedName = firstName + lastName
//ef.orderBy(combinedName)

EntityList el = ef.list() // Getting the list of EntityValue objects

// Initialize an empty list to store the partyId values
partyIdList = []

// Iterate over the EntityList and add partyId values to the list
partyIdList.add(el)

if (!pageNoLimit) { ef.offset(pageIndex as int, pageSize as int); ef.limit(pageSize as int) }


ec.logger.info("-----------------------------" + el + "-------------------------")
partyIdListCount = ef.count()
partyIdListPageIndex = ef.pageIndex
partyIdListPageSize = ef.pageSize
partyIdListPageMaxIndex = ((BigDecimal) (partyIdListCount - 1)).divide(partyIdListPageSize, 0, BigDecimal.ROUND_DOWN) as int
partyIdListPageRangeLow = partyIdListPageIndex * partyIdListPageSize + 1
partyIdListPageRangeHigh = (partyIdListPageIndex * partyIdListPageSize) + partyIdListPageSize
if (partyIdListPageRangeHigh > partyIdListCount) partyIdListPageRangeHigh = partyIdListCount