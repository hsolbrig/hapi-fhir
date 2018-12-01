#! /bin/bash
# Rename r4 terminology classes to reflect case change
: ${1?"Usage: $0 hapi_fhir_base"}

base=$1/hapi-fhir-structures-r4/src/main/java/org/hl7/fhir/r4/model/codesystems/
mv $base/MedicationRequestStatus.java $base/MedicationrequestStatus.java
mv $base/MedicationDispenseStatus.java $base/MedicationdispenseStatus.java
mv $base/MedicationDispenseCategoryEnumFactory.java $base/MedicationdispenseCategoryEnumFactory.java
mv $base/MedicationDispenseStatusEnumFactory.java $base/MedicationdispenseStatusEnumFactory.java
mv $base/MedicationRequestCategoryEnumFactory.java $base/MedicationrequestCategoryEnumFactory.java
mv $base/MedicationRequestIntentEnumFactory.java $base/MedicationrequestIntentEnumFactory.java
mv $base/MedicationRequestCategory.java $base/MedicationrequestCategory.java
mv $base/MedicationKnowledgeStatus.java $base/MedicationknowledgeStatus.java
mv $base/MedicationRequestStatusEnumFactory.java $base/MedicationrequestStatusEnumFactory.java
mv $base/MedicationKnowledgeStatusEnumFactory.java $base/MedicationknowledgeStatusEnumFactory.java
mv $base/MedicationRequestIntent.java $base/MedicationrequestIntent.java
mv $base/MedicationDispenseCategory.java $base/MedicationdispenseCategory.java
