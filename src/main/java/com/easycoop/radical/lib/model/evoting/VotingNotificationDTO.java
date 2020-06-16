/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.evoting;

import com.easycoop.radical.lib.model.member.MemberDTO;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author emmanuel.idoko
 */
@Getter
@Setter
public class VotingNotificationDTO {

    List<MemberDTO> members;
    VotingProcessDTO votingProcess;
    private Integer memberProfileId;
}
