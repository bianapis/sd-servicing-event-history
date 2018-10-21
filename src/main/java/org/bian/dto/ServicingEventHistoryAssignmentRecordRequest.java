package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ServicingEventHistoryAssignmentRecordRequest
 */
public class ServicingEventHistoryAssignmentRecordRequest   {
  private Object servicingPositionAssignmentEventRecord = null;

  private String servicingPositionReference = null;

  private String servicingPositionSessionReference = null;

  private String employeeBusinessUnitReference = null;

  private String dateTimeLocation = null;

  private Object servicingPositionActivityReport = null;

  private String servicingPositionActivityStatistics = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: the event record covering the assignment 
   * @return servicingPositionAssignmentEventRecord
  **/

  public Object getServicingPositionAssignmentEventRecord() {
    return servicingPositionAssignmentEventRecord;
  }

  public void setServicingPositionAssignmentEventRecord(Object servicingPositionAssignmentEventRecord) {
    this.servicingPositionAssignmentEventRecord = servicingPositionAssignmentEventRecord;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: log of servicing activity 
   * @return servicingPositionActivityReport
  **/

  public Object getServicingPositionActivityReport() {
    return servicingPositionActivityReport;
  }

  public void setServicingPositionActivityReport(Object servicingPositionActivityReport) {
    this.servicingPositionActivityReport = servicingPositionActivityReport;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return servicingPositionActivityStatistics
  **/

  public String getServicingPositionActivityStatistics() {
    return servicingPositionActivityStatistics;
  }

  public void setServicingPositionActivityStatistics(String servicingPositionActivityStatistics) {
    this.servicingPositionActivityStatistics = servicingPositionActivityStatistics;
  }


}

