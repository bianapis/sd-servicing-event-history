package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * servicing issue events
 */
public class ServicingEventHistoryIssuesWithIdAndRootResponse   {
  private String servicingSessionIssueRecordReference = null;

  private String customerServicingActivityEventHistoryReference = null;

  private Object servicingSessionIssueRecord = null;

  private String servicingPositionReference = null;

  private String servicingPositionSessionReference = null;

  private String employeeBusinessUnitReference = null;

  private String customerContactRecordReference = null;

  private String productionIssueType = null;

  private String productionIssueDescription = null;

  private String productionIssueDiagnosis = null;

  private String productionIssueResolutionTask = null;

  private Object productionIssueRecord = null;

  private String productionIssueStatus = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingSessionIssueRecordReference
  **/

  public String getServicingSessionIssueRecordReference() {
    return servicingSessionIssueRecordReference;
  }

  public void setServicingSessionIssueRecordReference(String servicingSessionIssueRecordReference) {
    this.servicingSessionIssueRecordReference = servicingSessionIssueRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerServicingActivityEventHistoryReference
  **/

  public String getCustomerServicingActivityEventHistoryReference() {
    return customerServicingActivityEventHistoryReference;
  }

  public void setCustomerServicingActivityEventHistoryReference(String customerServicingActivityEventHistoryReference) {
    this.customerServicingActivityEventHistoryReference = customerServicingActivityEventHistoryReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: the event record covering the assignment 
   * @return servicingSessionIssueRecord
  **/

  public Object getServicingSessionIssueRecord() {
    return servicingSessionIssueRecord;
  }

  public void setServicingSessionIssueRecord(Object servicingSessionIssueRecord) {
    this.servicingSessionIssueRecord = servicingSessionIssueRecord;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: customer contact where issue occurred 
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: type of event or error being recorded 
   * @return productionIssueType
  **/

  public String getProductionIssueType() {
    return productionIssueType;
  }

  public void setProductionIssueType(String productionIssueType) {
    this.productionIssueType = productionIssueType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: description of the event error 
   * @return productionIssueDescription
  **/

  public String getProductionIssueDescription() {
    return productionIssueDescription;
  }

  public void setProductionIssueDescription(String productionIssueDescription) {
    this.productionIssueDescription = productionIssueDescription;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: evaluation of the event cause and impact 
   * @return productionIssueDiagnosis
  **/

  public String getProductionIssueDiagnosis() {
    return productionIssueDiagnosis;
  }

  public void setProductionIssueDiagnosis(String productionIssueDiagnosis) {
    this.productionIssueDiagnosis = productionIssueDiagnosis;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: description of corrective action 
   * @return productionIssueResolutionTask
  **/

  public String getProductionIssueResolutionTask() {
    return productionIssueResolutionTask;
  }

  public void setProductionIssueResolutionTask(String productionIssueResolutionTask) {
    this.productionIssueResolutionTask = productionIssueResolutionTask;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: detail of the issue, response and interested parties 
   * @return productionIssueRecord
  **/

  public Object getProductionIssueRecord() {
    return productionIssueRecord;
  }

  public void setProductionIssueRecord(Object productionIssueRecord) {
    this.productionIssueRecord = productionIssueRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: tracking the state of resolution of a reported issue 
   * @return productionIssueStatus
  **/

  public String getProductionIssueStatus() {
    return productionIssueStatus;
  }

  public void setProductionIssueStatus(String productionIssueStatus) {
    this.productionIssueStatus = productionIssueStatus;
  }


}

