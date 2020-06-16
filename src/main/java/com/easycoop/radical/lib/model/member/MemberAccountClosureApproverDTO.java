/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.member;

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
public class MemberAccountClosureApproverDTO {
    private Integer id;
    private Integer memberProfileId;
    private Integer cooperativeId;
    private Integer memberAccountClosureId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String username;
    private Boolean approvedClosure;
    private Boolean rejectedClosure;
    private String rejectionReason;
}
