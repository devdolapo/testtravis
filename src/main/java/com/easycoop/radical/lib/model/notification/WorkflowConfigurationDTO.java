/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.notification;

import java.util.List;
import javax.validation.constraints.NotBlank;
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
public class WorkflowConfigurationDTO {
    @NotNull(message = "id cannot be null")
    private Integer id;
    @NotBlank(message = "workflow name must be provided")
    private String workflowName;
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @NotNull(message = "workflow points cannot be null")
    private List<WorkflowPointDTO> points;
}
