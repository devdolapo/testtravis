/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.accountingbridge;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author akinw
 */
@Getter
@Setter
public class AccountingBridgeInfo {
    private Integer memberProfileId;
    private Integer cooperativeId;
    private String bmacReferenceId;
    private String profileFirstName;
    private String profileLastName;
    //private String accountNameInDirectory;
    private BigDecimal amount;
    private BigDecimal interest;
    private BigDecimal principal_amount;
    private Date transactionDate;
    private String bankId;
    private Boolean loanRepaymentProcessed = Boolean.FALSE;
    private Boolean loanDisbursementProcessed = Boolean.FALSE;
    private Boolean contributionProcessed = Boolean.FALSE;
    private Boolean withdrawalProcessed = Boolean.FALSE;
    private Boolean interestProcessed = Boolean.FALSE;
    private Boolean interestNotConsidered = Boolean.FALSE;
    private Boolean suspended = Boolean.FALSE;
    private String informationOnSuspension;
    private String additionalTransactionDescription;
    private Boolean referencedInBmac = Boolean.FALSE;
}
