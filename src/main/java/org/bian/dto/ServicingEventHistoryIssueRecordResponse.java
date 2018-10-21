package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * servicing issue events
 */
public class ServicingEventHistoryIssueRecordResponse   {
  private String servicingSessionIssueRecordReference = null;

  private String customerServicingActivityEventHistoryReference = null;

  private String recordingRecordStatus = null;


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

