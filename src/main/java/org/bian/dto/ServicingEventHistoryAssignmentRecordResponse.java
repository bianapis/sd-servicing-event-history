package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ServicingEventHistoryAssignmentRecordResponse
 */
public class ServicingEventHistoryAssignmentRecordResponse   {
  private String servicingPositionAssignmentEventRecordReference = null;

  private String customerServicingActivityEventHistoryReference = null;

  private String recordingRecordStatus = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingPositionAssignmentEventRecordReference
  **/

  public String getServicingPositionAssignmentEventRecordReference() {
    return servicingPositionAssignmentEventRecordReference;
  }

  public void setServicingPositionAssignmentEventRecordReference(String servicingPositionAssignmentEventRecordReference) {
    this.servicingPositionAssignmentEventRecordReference = servicingPositionAssignmentEventRecordReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return recordingRecordStatus
  **/

  public String getRecordingRecordStatus() {
    return recordingRecordStatus;
  }

  public void setRecordingRecordStatus(String recordingRecordStatus) {
    this.recordingRecordStatus = recordingRecordStatus;
  }


}

