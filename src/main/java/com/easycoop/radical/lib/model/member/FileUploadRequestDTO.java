package com.easycoop.radical.lib.model.member;

import java.util.Date;

import lombok.Data;

@Data
public class FileUploadRequestDTO {

	private Integer id;
    private Integer memberProfileId;
    private Integer cooperativeId;
    private String username;
    private String uploadRequestMadeBy;
    private Boolean requestGranted;
    private Boolean discarded;
    private String firstName;
    private String lastName;
    private Boolean forMemberContributions;
    private Boolean forLoanSchedulesForMarkoff;
    private Boolean forMemberUpload;
    private Boolean forMemberTargetSavingsUpload;
    private Boolean forLegacyLoanApplications;
    private Boolean forLoanSchedules;
    private Date createdDate;
}
