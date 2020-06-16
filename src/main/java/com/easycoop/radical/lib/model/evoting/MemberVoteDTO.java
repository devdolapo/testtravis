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
public class MemberVoteDTO {

    @Min(0)
    @NotNull(message = "member profile id cannot be null")
    private Integer memberProfileId;
    @NotNull(message = "member election vote cannot be null")
    private List<MemberElectionVoteDTO> memberElectionVoteDTOs;
    @NotNull(message = "member resolution vote cannot be null")
    private List<MemberResolutionVoteDTO> memberResolutionVoteDTOs;
}
