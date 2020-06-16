/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.evoting;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author emmanuel.idoko
 */
@Getter
@Setter
public class ResolutionResultSummaryDTO {

    @Min(0)
    @NotNull(message = "id cannot be null")
    private int id;
    @Min(0)
    @NotNull(message = "voting process id cannot be null")
    private Integer votingProcessId;
    @NotNull(message = "option name cannot be null")
    private String optionName;
    @NotNull(message = "option value cannot be null")
    private String optionValue;
    @NotNull(message = "option percentage cannot be null")
    private String optionPercentage;
}
