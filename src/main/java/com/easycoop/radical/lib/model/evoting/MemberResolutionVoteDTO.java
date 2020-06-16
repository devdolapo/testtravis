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
public class MemberResolutionVoteDTO {

    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(1)
    @NotNull(message = "member id cannot be null")
    private Integer memberProfileId;
    @NotNull(message = "member name cannot be null")
    private String memberName;
    @Min(1)
    @NotNull(message = "voting process id cannot be null")
    private Integer votingProcessId;
    @NotNull(message = "voting process title cannot be null")
    private String votingProcessTitle;
    @Min(1)
    @NotNull(message = "resolution option id cannot be null")
    private Integer resolutionOptionsId;
    @NotNull(message = "resolution option cannot be null")
    private String resolutionOption;
    private String dateVoted;
    private String time_voted;
}
