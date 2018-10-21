/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ServicingEventHistoryApiService {

	ServicingEventHistoryAssignmentRecordResponse recordAssignments(String crReferenceId, String bqReferenceId, ServicingEventHistoryAssignmentRecordRequest request);
	
	ServicingEventHistoryFacilityRecordResponse recordFacilities(String crReferenceId, String bqReferenceId, ServicingEventHistoryFacilityRecordRequest request);
	
	ServicingEventHistoryIssueRecordResponse recordIssues(String crReferenceId, String bqReferenceId, ServicingEventHistoryIssueRecordRequest request);
	
	ServicingEventHistorySessionRecordResponse recordSessions(String crReferenceId, String bqReferenceId, ServicingEventHistorySessionRecordRequest request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	ServicingEventHistoryIssuesWithIdAndRootResponse retrieveIssues(String crReferenceId, String bqReferenceId);
	
	ServicingEventHistoryResponse retrieve(String crReferenceId);
	
	ServicingEventHistoryAssignmentWithIdAndRootResponse retrieveAssignments(String crReferenceId, String bqReferenceId);
	
	ServicingEventHistoryFacilityWithIdAndRootResponse retrieveFacilities(String crReferenceId, String bqReferenceId);
	
	ServicingEventHistorySessionWithIdAndRootResponse retrieveSessions(String crReferenceId, String bqReferenceId);
	
	ServicingEventHistoryResponse update(String crReferenceId, ServicingEventHistoryUpdateRequest request);
	
}
