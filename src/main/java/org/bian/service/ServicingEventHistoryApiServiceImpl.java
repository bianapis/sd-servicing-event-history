/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ServicingEventHistoryApiServiceImpl implements ServicingEventHistoryApiService {

	public ServicingEventHistoryAssignmentRecordResponse recordAssignments(String crReferenceId, String bqReferenceId, ServicingEventHistoryAssignmentRecordRequest request){
		return JsonReader.read("record-ServicingEventHistoryAssignmentRecordResponse.json",new TypeReference<ServicingEventHistoryAssignmentRecordResponse>(){});
	}
	
	public ServicingEventHistoryFacilityRecordResponse recordFacilities(String crReferenceId, String bqReferenceId, ServicingEventHistoryFacilityRecordRequest request){
		return JsonReader.read("record-ServicingEventHistoryFacilityRecordResponse.json",new TypeReference<ServicingEventHistoryFacilityRecordResponse>(){});
	}
	
	public ServicingEventHistoryIssueRecordResponse recordIssues(String crReferenceId, String bqReferenceId, ServicingEventHistoryIssueRecordRequest request){
		return JsonReader.read("record-ServicingEventHistoryIssueRecordResponse.json",new TypeReference<ServicingEventHistoryIssueRecordResponse>(){});
	}
	
	public ServicingEventHistorySessionRecordResponse recordSessions(String crReferenceId, String bqReferenceId, ServicingEventHistorySessionRecordRequest request){
		return JsonReader.read("record-ServicingEventHistorySessionRecordResponse.json",new TypeReference<ServicingEventHistorySessionRecordResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ServicingEventHistoryIssuesWithIdAndRootResponse retrieveIssues(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ServicingEventHistoryIssuesWithIdAndRootResponse.json",new TypeReference<ServicingEventHistoryIssuesWithIdAndRootResponse>(){});
	}
	
	public ServicingEventHistoryResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-ServicingEventHistoryResponse.json",new TypeReference<ServicingEventHistoryResponse>(){});
	}
	
	public ServicingEventHistoryAssignmentWithIdAndRootResponse retrieveAssignments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ServicingEventHistoryAssignmentWithIdAndRootResponse.json",new TypeReference<ServicingEventHistoryAssignmentWithIdAndRootResponse>(){});
	}
	
	public ServicingEventHistoryFacilityWithIdAndRootResponse retrieveFacilities(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ServicingEventHistoryFacilityWithIdAndRootResponse.json",new TypeReference<ServicingEventHistoryFacilityWithIdAndRootResponse>(){});
	}
	
	public ServicingEventHistorySessionWithIdAndRootResponse retrieveSessions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ServicingEventHistorySessionWithIdAndRootResponse.json",new TypeReference<ServicingEventHistorySessionWithIdAndRootResponse>(){});
	}
	
	public ServicingEventHistoryResponse update(String crReferenceId, ServicingEventHistoryUpdateRequest request){
		return JsonReader.read("update-ServicingEventHistoryResponse.json",new TypeReference<ServicingEventHistoryResponse>(){});
	}
	
}
