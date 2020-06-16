/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.accountingbridge;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author akinw
 */
@Getter
@Setter
public class AccountingBridgetInfoWrapper {
    private BridgeUrl bridgeUrl;
    private String uploadPath;
    private Integer initiatorId;
    private Integer cooperativeId;
    private List<AccountingBridgeInfo> infoList;
    private Boolean allProcessed = Boolean.FALSE;
    private Boolean forLoanDisbursement = Boolean.FALSE;
    private Boolean forLoanRepayment = Boolean.FALSE;
    private Boolean forWithdrawal = Boolean.FALSE;
    private Boolean forContribution = Boolean.FALSE;
    private Boolean onDueDate = Boolean.FALSE;
}
