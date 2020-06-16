/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.member;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Administrator
 */
@Getter
@Setter
@ToString
public class DisbursementForReviewDTO {

    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(0)
    @NotNull(message = "amount cannot be null")
    private BigDecimal amount;
    @Min(0)
    @NotNull(message = "interest cannot be null")
    private BigDecimal interest;
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @NotNull(message = "member profile id cannot be null")
    private Integer memberProfileId;
    private String memberName = "";
    private String memberNameLastNameFirst = "";
    private String memberUserName = "";
    private String bankName = "";
    private String bankCode = "";
    private String accountNumber = "";
    @Min(0)
    @NotNull(message = "loan application id cannot be null")
    private Integer loanApplicationId;
    @Min(0)
    @NotNull(message = "withdarwal transaction id cannot be null")
    private Integer transactionCooperativeId;
    @NotNull(message = "reviewed by username cannot be null")
    private String reviewedByUsername;
    @NotNull(message = "reversal reason cannot be null")
    private String reversalReason;
    @NotNull(message = "for loan flag cannot be null")
    private Boolean forLoan;
    @NotNull(message = "for withdrawal flag cannot be null")
    private Boolean forWithdrawal;
    private Boolean processing = false;
    @NotNull(message = "approved cannot be null")
    private Boolean approved;
    @NotNull(message = "paid flag cannot be null")
    private Boolean paid;
    @NotNull(message = "reversed flag cannot be null")
    private Boolean reversed;
    @NotNull(message = "paid date cannot be null")
    private String paidDate;
    @NotNull(message = "approved date cannot be null")
    private String approvedDate;
    @NotNull(message = "reversed date cannot be null")
    private String reversedDate;
    @NotNull(message = "creation date cannot be null")
    private String creationDate;
    @NotNull(message = "rejected cannot be null")
    private Boolean rejected;
    @NotNull(message = "rejection date cannot be null")
    private String rejectionDate;
    @NotNull(message = "rejection reason cannot be null")
    private String rejectionReason;
    private Boolean forAccountClosureWithdrawal;
    private Date sortingDate;
}
