package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * session activity events
 */
public class ServicingEventHistorySessionRecordRequest   {
  private Object servicingSessionEventRecord = null;

  private String servicingPositionReference = null;

  private String servicingPositionSessionReference = null;

  private String employeeBusinessUnitReference = null;

  private String dateTimeLocation = null;

  private String servicingLogReference = null;

  private String customerContactReference = null;

  private String sessionMechanism = null;

  private String servicingFacilityType = null;

  private String servicingFacilityInstanceReference = null;

  private String sessionStartEndTime = null;

  private Object contactDialogueRecord = null;

  private String contactDialogueType = null;

  private String contactDialogueScript = null;

  private String contactDialogueLogReference = null;

  private String contactDialogueLog = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: the event record covering the customer servicing session 
   * @return servicingSessionEventRecord
  **/

  public Object getServicingSessionEventRecord() {
    return servicingSessionEventRecord;
  }

  public void setServicingSessionEventRecord(Object servicingSessionEventRecord) {
    this.servicingSessionEventRecord = servicingSessionEventRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingPositionReference
  **/

  public String getServicingPositionReference() {
    return servicingPositionReference;
  }

  public void setServicingPositionReference(String servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingPositionSessionReference
  **/

  public String getServicingPositionSessionReference() {
    return servicingPositionSessionReference;
  }

  public void setServicingPositionSessionReference(String servicingPositionSessionReference) {
    this.servicingPositionSessionReference = servicingPositionSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return dateTimeLocation
  **/

  public String getDateTimeLocation() {
    return dateTimeLocation;
  }

  public void setDateTimeLocation(String dateTimeLocation) {
    this.dateTimeLocation = dateTimeLocation;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingLogReference
  **/

  public String getServicingLogReference() {
    return servicingLogReference;
  }

  public void setServicingLogReference(String servicingLogReference) {
    this.servicingLogReference = servicingLogReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: contact record reference for serviced customers during session 
   * @return customerContactReference
  **/

  public String getCustomerContactReference() {
    return customerContactReference;
  }

  public void setCustomerContactReference(String customerContactReference) {
    this.customerContactReference = customerContactReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return sessionMechanism
  **/

  public String getSessionMechanism() {
    return sessionMechanism;
  }

  public void setSessionMechanism(String sessionMechanism) {
    this.sessionMechanism = sessionMechanism;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: servicing facility used during the session 
   * @return servicingFacilityType
  **/

  public String getServicingFacilityType() {
    return servicingFacilityType;
  }

  public void setServicingFacilityType(String servicingFacilityType) {
    this.servicingFacilityType = servicingFacilityType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: record of any output or action generated using the facility 
   * @return servicingFacilityInstanceReference
  **/

  public String getServicingFacilityInstanceReference() {
    return servicingFacilityInstanceReference;
  }

  public void setServicingFacilityInstanceReference(String servicingFacilityInstanceReference) {
    this.servicingFacilityInstanceReference = servicingFacilityInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return sessionStartEndTime
  **/

  public String getSessionStartEndTime() {
    return sessionStartEndTime;
  }

  public void setSessionStartEndTime(String sessionStartEndTime) {
    this.sessionStartEndTime = sessionStartEndTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: session dialogue log of actions returned to SD-Contact Handler 
   * @return contactDialogueRecord
  **/

  public Object getContactDialogueRecord() {
    return contactDialogueRecord;
  }

  public void setContactDialogueRecord(Object contactDialogueRecord) {
    this.contactDialogueRecord = contactDialogueRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return contactDialogueType
  **/

  public String getContactDialogueType() {
    return contactDialogueType;
  }

  public void setContactDialogueType(String contactDialogueType) {
    this.contactDialogueType = contactDialogueType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: a prompt provided to structure the interaction for self-service and assisted interactions 
   * @return contactDialogueScript
  **/

  public String getContactDialogueScript() {
    return contactDialogueScript;
  }

  public void setContactDialogueScript(String contactDialogueScript) {
    this.contactDialogueScript = contactDialogueScript;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return contactDialogueLogReference
  **/

  public String getContactDialogueLogReference() {
    return contactDialogueLogReference;
  }

  public void setContactDialogueLogReference(String contactDialogueLogReference) {
    this.contactDialogueLogReference = contactDialogueLogReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return contactDialogueLog
  **/

  public String getContactDialogueLog() {
    return contactDialogueLog;
  }

  public void setContactDialogueLog(String contactDialogueLog) {
    this.contactDialogueLog = contactDialogueLog;
  }


}

