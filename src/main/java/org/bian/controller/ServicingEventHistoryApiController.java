/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Track;

@BianRestController
public class ServicingEventHistoryApiController {

	@Autowired
	ServicingEventHistoryApiService service;
	
	@BQ("assignments")
	@Track.Record
	public BianResponse<ServicingEventHistoryAssignmentRecordResponse> recordAssignments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ServicingEventHistoryAssignmentRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.recordAssignments(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("facilities")
	@Track.Record
	public BianResponse<ServicingEventHistoryFacilityRecordResponse> recordFacilities(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ServicingEventHistoryFacilityRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.recordFacilities(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("issues")
	@Track.Record
	public BianResponse<ServicingEventHistoryIssueRecordResponse> recordIssues(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ServicingEventHistoryIssueRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.recordIssues(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("sessions")
	@Track.Record
	public BianResponse<ServicingEventHistorySessionRecordResponse> recordSessions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ServicingEventHistorySessionRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.recordSessions(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Track.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Track.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Track.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("issues")
	@Track.Retrieve
	public BianResponse<ServicingEventHistoryIssuesWithIdAndRootResponse> retrieveIssues(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveIssues(crReferenceId, bqReferenceId));
	}
	
	@Track.Retrieve
	public BianResponse<ServicingEventHistoryResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("assignments")
	@Track.Retrieve
	public BianResponse<ServicingEventHistoryAssignmentWithIdAndRootResponse> retrieveAssignments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssignments(crReferenceId, bqReferenceId));
	}
	
	@BQ("facilities")
	@Track.Retrieve
	public BianResponse<ServicingEventHistoryFacilityWithIdAndRootResponse> retrieveFacilities(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFacilities(crReferenceId, bqReferenceId));
	}
	
	@BQ("sessions")
	@Track.Retrieve
	public BianResponse<ServicingEventHistorySessionWithIdAndRootResponse> retrieveSessions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSessions(crReferenceId, bqReferenceId));
	}
	
	@Track.Update
	public BianResponse<ServicingEventHistoryResponse> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ServicingEventHistoryUpdateRequest> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
