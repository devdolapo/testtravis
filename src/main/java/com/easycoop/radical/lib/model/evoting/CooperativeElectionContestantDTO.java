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
public class CooperativeElectionContestantDTO {

    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(0)
    @NotNull(message = "election position id cannot be null")
    private Integer electionPositionsId;
    @NotNull(message = "election position title cannot be null")
    private String electionPositionTitle;
    @Min(1)
    @NotNull(message = "member profile id cannot be null")
    private Integer memberProfileId;
    private String memberName;
    @Min(1)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    private String cooperativeName;
    @NotNull(message = "branch id cannot be null")
    private Integer branchId;
    private String branchName;
    @NotNull(message = "manifesto cannot be null")
    private String manifesto;
    private String actionDate;
    @NotNull(message = "cancelled cannot be null")
    private Boolean cancelled;
    @NotNull(message = "cancellation reason cannot be null")
    private String cancellationReason;
    @Min(1)
    @NotNull(message = "voting process id cannot be null")
    private Integer votingProcessId;
}
