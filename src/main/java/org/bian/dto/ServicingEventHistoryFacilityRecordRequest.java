package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ServicingEventHistoryFacilityRecordRequest
 */
public class ServicingEventHistoryFacilityRecordRequest   {
  private Object servicingSessionFacilityUseRecord = null;

  private String servicingFacilityType = null;

  private String servicingFacilityReference = null;

  private String servicingFacilityInstanceReference = null;

  private String servicingFacilityRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: the event record covering the use of a supporting facility 
   * @return servicingSessionFacilityUseRecord
  **/

  public Object getServicingSessionFacilityUseRecord() {
    return servicingSessionFacilityUseRecord;
  }

  public void setServicingSessionFacilityUseRecord(Object servicingSessionFacilityUseRecord) {
    this.servicingSessionFacilityUseRecord = servicingSessionFacilityUseRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return servicingFacilityType
  **/

  public String getServicingFacilityType() {
    return servicingFacilityType;
  }

  public void setServicingFacilityType(String servicingFacilityType) {
    this.servicingFacilityType = servicingFacilityType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: access to facility 
   * @return servicingFacilityReference
  **/

  public String getServicingFacilityReference() {
    return servicingFacilityReference;
  }

  public void setServicingFacilityReference(String servicingFacilityReference) {
    this.servicingFacilityReference = servicingFacilityReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: reference to the result of using the facility in a servicing session 
   * @return servicingFacilityInstanceReference
  **/

  public String getServicingFacilityInstanceReference() {
    return servicingFacilityInstanceReference;
  }

  public void setServicingFacilityInstanceReference(String servicingFacilityInstanceReference) {
    this.servicingFacilityInstanceReference = servicingFacilityInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: result of using the facility 
   * @return servicingFacilityRecord
  **/

  public String getServicingFacilityRecord() {
    return servicingFacilityRecord;
  }

  public void setServicingFacilityRecord(String servicingFacilityRecord) {
    this.servicingFacilityRecord = servicingFacilityRecord;
  }


}

