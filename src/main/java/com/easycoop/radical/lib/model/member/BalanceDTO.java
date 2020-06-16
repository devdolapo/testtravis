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
public class BalanceDTO {

    private BigDecimal voluntaryBalance;
    private BigDecimal compulsoryBalance;
    private BigDecimal walletBalance;
    private BigDecimal targetSavingsBalance;
    private BigDecimal sharesBalance;
    private BigDecimal totalBalance;
    private BigDecimal shareUnitPrice;
    private BigDecimal shareValue;
    private String balanceAsAt;
    private String lastContributionUpdate;
    private String lastLoanUpdate;
}
