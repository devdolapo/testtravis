/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.member;

import java.math.BigDecimal;
import java.util.Date;

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
public class MemberAccountClosureDTO {
    private Integer id;
    private Integer memberProfileId;
    private Integer cooperativeId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String username;
    private String accountClosureReason;
    private Boolean accountClosed;
    private Boolean discarded;
    private String accountClosureRequestMadeBy;
    private BigDecimal withdrawableAmount;
    private String applicationDate;
    private String dateAccountClosed;
}
