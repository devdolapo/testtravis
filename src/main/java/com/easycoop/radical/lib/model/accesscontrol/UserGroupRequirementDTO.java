/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.accesscontrol;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Administrator
 */
@Getter
@Setter
public class UserGroupRequirementDTO {

    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(0)
    @NotNull(message = "user group id cannot be null")
    private Integer userGroupId;
    @Min(0)
    @NotNull(message = "requirement id cannot be null")
    private Integer requirementId;
    private String requirementName;
}
