/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.evoting;

import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author emmanuel.idoko
 */
@Getter
@Setter
public class ElectionResultSummaryDTO {

    @NotNull(message = "id cannot be null")
    private Integer id;
    private Integer cooperativeElectionContestantId;
    @NotNull(message = "memberProfile id cannot be null")
    private Integer memberProfileId;
    private String memberName;
    @NotNull(message = "election position id cannot be null")
    private Integer electionPositionsId;
    private String electionPositionTitle;
    private Integer toalNumberOfVoters;
    private Integer totalVotesAcquired;
    private BigDecimal percentageVoteAcquired;
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @NotNull(message = "branch id cannot be null")
    private Integer branchId;
    private Integer votingProcessId;
    private String votingProcessTitle;
}
