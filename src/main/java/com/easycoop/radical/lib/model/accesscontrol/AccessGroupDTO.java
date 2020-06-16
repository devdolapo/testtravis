/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.accesscontrol;

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
public class AccessGroupDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @NotNull(message = "cooperative id must be provided")
    private Integer cooperativeId;
    private String cooperative;
    @NotBlank(message = "group name must be provided")
    private String groupName;
    @NotNull(message = "available to cac must be provided")
    private Boolean availableToCac;
    @NotNull(message = "available to members must be provided")
    private Boolean availableToMembers;
}
