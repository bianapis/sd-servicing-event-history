package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ServicingEventHistoryUpdateRequest
 */
public class ServicingEventHistoryUpdateRequest   {
  private String servicingPositionReference = null;

  private String employeeBusinessUnitReference = null;

  private Object customerServicingActivityEventHistoryRecord = null;

  private String customerServicingActivityEventHistoryReportType = null;

  private String parameters = null;

  private Object customerServicingActivityEventHistoryReport = null;


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
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerServicingActivityEventHistoryRecord
  **/

  public Object getCustomerServicingActivityEventHistoryRecord() {
    return customerServicingActivityEventHistoryRecord;
  }

  public void setCustomerServicingActivityEventHistoryRecord(Object customerServicingActivityEventHistoryRecord) {
    this.customerServicingActivityEventHistoryRecord = customerServicingActivityEventHistoryRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerServicingActivityEventHistoryReportType
  **/

  public String getCustomerServicingActivityEventHistoryReportType() {
    return customerServicingActivityEventHistoryReportType;
  }

  public void setCustomerServicingActivityEventHistoryReportType(String customerServicingActivityEventHistoryReportType) {
    this.customerServicingActivityEventHistoryReportType = customerServicingActivityEventHistoryReportType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return parameters
  **/

  public String getParameters() {
    return parameters;
  }

  public void setParameters(String parameters) {
    this.parameters = parameters;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerServicingActivityEventHistoryReport
  **/

  public Object getCustomerServicingActivityEventHistoryReport() {
    return customerServicingActivityEventHistoryReport;
  }

  public void setCustomerServicingActivityEventHistoryReport(Object customerServicingActivityEventHistoryReport) {
    this.customerServicingActivityEventHistoryReport = customerServicingActivityEventHistoryReport;
  }


}

