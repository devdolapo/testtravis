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
public class MemberElectionVoteDTO {

    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(1)
    @NotNull(message = "member id cannot be null")
    private Integer memberProfileId;
    @NotNull(message = "member name cannot be null")
    private String memberName;
    @Min(1)
    @NotNull(message = "cooperative election contestant id cannot be null")
    private Integer cooperativeElectionContestantId;
    @Min(0)
    @NotNull(message = "election position id cannot be null")
    private Integer electionPositionsId;
    @Min(1)
    @NotNull(message = "voting process id cannot be null")
    private Integer votingProcessId;
    @NotNull(message = "voting process title cannot be null")
    private String votingProcessTitle;
    @NotNull(message = "election position cannot be null")
    private String electionPositionTitle;
    private String dateVoted;
    private String timeVoted;
}
