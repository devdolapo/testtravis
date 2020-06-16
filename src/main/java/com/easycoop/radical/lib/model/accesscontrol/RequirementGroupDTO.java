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
public class RequirementGroupDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @NotNull(message = "group name cannot be null")
    private String groupName;
}
