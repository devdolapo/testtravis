/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.accesscontrol;

import java.util.List;
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
public class RequirementDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
//    @NotNull(message = "alert type id cannot be null")
    private Integer alertTypeId;
//    @NotNull
    private String alertType;
    @NotNull(message = "module id cannot be null")
    private Integer moduleId;
//    @NotNull
    private String module;
//    @NotNull(message = "workflow id cannot be null")
    private Integer workflowId;
//    @NotNull
    private String workflow;
    @NotBlank(message = "requirement name must be provided")
    private String requirementName;
    @NotBlank(message = "requirement description must be provided")
    private String requirementDescription;
    @NotBlank(message = "requirement code must be provided")
    private String requirementCode;
    @NotNull(message = "sac has access must be provided")
    private Boolean sacHasAccess;
    @NotNull(message = "cac has access must be provided")
    private Boolean cacHasAccess;
    @NotNull(message = "member has access must be provided")
    private Boolean memberHasAccess;
    @NotNull(message = "locked to sac must be provided")
    private Boolean lockedToSac;
    @NotNull(message = "locked to cac must be provided")
    private Boolean lockedToCac;
    @NotNull(message = "locked to member must be provided")
    private Boolean lockedToMember;
    List<MenuDTO> menus;
}
