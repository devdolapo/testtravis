/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.notification;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author akinw
 */
@Getter
@Setter
@ToString
public class WorkflowPointDTO {
    @NotNull(message = "id cannot be null")
    private Integer id;
    @NotNull(message = "workflow id cannot be null")
    private Integer workflowId;
    @NotNull(message = "level number cannot be null")
    private Integer levelNumber;
    @Min(value = 1, message = "role id must be 1 or greater")
    @NotNull(message = "role id cannot be null")
    private Integer roleId;
    private Integer conditionTypeId;
    @NotNull(message = "condition value cannot be null")
    private String conditionValue;
    @NotNull(message = "from value above cannot be null")
    private Boolean fromValueAndAbove;
    @NotNull(message = "from value below cannot be null")
    private Boolean fromValueAndBelow;
    private String status;
    @NotNull(message = "to remove cannot be null")
    private Boolean toRemove;
}
