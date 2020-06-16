/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.transaction;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
public class TransactionExternalDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(value = 1, message = "member profile id must be equal to or greater than 1")
    @NotNull(message = "member profile id cannot be null")
    private Integer memberProfileId;
    @Min(value = 1, message = "cooperative id must be equal to or greater than 1")
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    private String cooperative;
    @Min(0)
    @NotNull(message = "loan application id cannot be null")
    private Integer loanApplicationId;
    @Min(0)
    @NotNull(message = "savings application id cannot be null")
    private Integer savingsApplicationId;
    @Min(value = 1, message = "transaction id must be equal to or greater than 1")
    @NotNull(message = "transaction id cannot be null")
    private String transactionId;
    @Min(0)
    @NotNull(message = "amount paid cannot be null")
    private BigDecimal amountPaid;
    @NotBlank(message = "name of depositor must be provided")
    private String nameOfDepositor;
    @NotBlank(message = "purpose of depositor must be provided")
    private String purposeOfDepositor;
    @NotNull(message = "is loan payment cannot be null")
    private Boolean isLoanPayment;
    @NotNull(message = "is contribution payment cannot be null")
    private Boolean isContributionPayment;
    @NotNull(message = "contribution category cannot be null")
    private String contributionCategory;
    @NotBlank(message = "transfer date must be provided")
    private String transferDate;
    private String actionDate;
    private Boolean effected;
    private Boolean rejected;
    @NotNull(message = "rejection reason cannot be null")
    private String rejectionReason;
    private String initiatorName;
    private Integer initiatorId;
    private Date sortingDate;
}
