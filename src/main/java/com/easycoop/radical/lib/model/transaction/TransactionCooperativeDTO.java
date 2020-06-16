/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.transaction;

import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author emmanuel.idoko
 */
@Getter
@Setter
@ToString
public class TransactionCooperativeDTO {

    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(1)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @Min(1)
    @NotNull(message = "member profile id cannot be null")
    private Integer memberProfileId;
    @Min(1)
    @NotNull(message = "Transaction type id cannot be null")
    private Integer transactionTypeId;
    @Min(0)
    @NotNull(message = "savings application id cannot be null")
    private Integer savingsApplicationId;
    @Min(1)
    @NotNull(message = "amount cannot be null")
    private BigDecimal amount;
    private String transactionDate;
    private BigDecimal amountInAndOut;
    private String actionDate;
    private Boolean paid;
    private String paidDate;
    private Boolean isEligible;
    private Boolean isWallet;
    private Boolean isMonthlyContribution;
    private Boolean isQuicksave;
    private String transactionType;
    private String initiatorName;
    private Integer initiatorId;
}
