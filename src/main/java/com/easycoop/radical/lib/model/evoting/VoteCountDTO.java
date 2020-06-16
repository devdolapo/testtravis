/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.evoting;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author emmanuel.idoko
 */
@Getter
@Setter
public class VoteCountDTO {
  private long numberOfMemberResolutionVoters;
  private long numberOfMemberResolutionVotersByOption;
  private long numberOfMemberElectionVotersByPosition;
  private long numberOfMemberElectionVotersByContestant;
}
