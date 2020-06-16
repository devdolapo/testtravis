/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.evoting;

import java.util.List;
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
public class VotingProcessDTO {

    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @NotNull(message = "voting process title cannot be null")
    private String title;
    private String notes;
    private String startDate;
    @NotNull(message = "end date cannot be null")
    private String endDate;
    @NotNull(message = "start now flag cannot be null")
    private Boolean startNow;
    @NotNull(message = "end flag cannot be null")
    private Boolean ended;
    @NotNull(message = "result computed flag cannot be null")
    private Boolean resultComputed;
    @Min(1)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @Min(0)
    @NotNull(message = "branch id cannot be null")
    private Integer branchId;
    @Min(1)
    @NotNull(message = "voting process type id cannot be null")
    private Integer votingProcessTypeId;
    @NotNull(message = "resolution options cannot be null")
    private List<ResolutionOptionsDTO> resolutionOptions;
    @NotNull(message = "election contestants cannot be null")
    private List<CooperativeElectionContestantDTO> contestants;
}
