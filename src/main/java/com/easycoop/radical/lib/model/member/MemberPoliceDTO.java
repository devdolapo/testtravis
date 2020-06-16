/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.member;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author akinw
 */
@Getter
@Setter
public class MemberPoliceDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(1)
    @NotNull(message = "member profile id cannot be null")
    private Integer memberProfileId;
    @NotNull(message = "staff category cannot be null")
    private String staffCategory;
    @NotNull(message = "job description cannot be null")
    private String jobDescription;
    @NotNull(message = "grade cannot be null")
    private String grade;
    @NotNull(message = "grade step cannot be null")
    private String gradeStep;
    @NotNull(message = "old computer number cannot be null")
    private String oldComputerNumber;
    @NotNull(message = "new computer number cannot be null")
    private String newComputerNumber;
    @NotNull(message = "cooperative membership id cannot be null")
    private String cooperativeMembershipId;
    @NotNull(message = "old computer number cannot be null")
    private String seniority;
    @NotNull(message = "date joined cooperative cannot be null")
    private String dateJoinedCooperative;
    @NotNull(message = "paypoint cannot be null")
    private String paypoint;
    @NotBlank(message = "force number must be provided")
    private String forceNumber;
    @NotNull(message = "rank cannot be null")
    private String rank;
    @NotNull(message = "date of enlistment cannot be null")
    private String dateOfEnlistment;
    @NotNull(message = "date of retirement cannot be null")
    private String dateOfRetirement;
    @NotNull(message = "training school college cannot be null")
    private String trainingSchoolCollege;
    @NotNull(message = "months spent at college cannot be null")
    private Integer monthsSpentAtCollege;
    @NotNull(message = "present posting command cannot be null")
    private String presentPostingCommand;
    @NotNull(message = "present posting department division cannot be null")
    private String presentPostingDepartmentDivision;
    @NotNull(message = "current mss cannot be null")
    private String currentMss;
}
