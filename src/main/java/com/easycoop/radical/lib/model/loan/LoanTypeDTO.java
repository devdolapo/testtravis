/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.loan;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

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
public class LoanTypeDTO {

    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(1)
    @NotNull(message = "Cooperative id is required")
    private Integer cooperativeId;
    private String cooperative;
    @Min(1)
    @NotNull(message = "application start id cannot be null")
    private Integer loanApplicationStartId;
    @Min(0)
    @NotNull(message = "application date start value cannot be null")
    private Integer startFromApplicationDateValue;
    @Min(1)
    @NotNull(message = "loan class id cannot be null")
    private Integer loanClassId;
    private String loanClass;

    @Min(1)
    @NotNull(message = "duration id cannot be null")
    private Integer paymentDurationPeriodId;//periodTypeByPaymentDurationPeriodId
    @Min(1)
    @NotNull(message = "duration value cannot be null")
    private Integer paymentDurationValue;

    @Min(1)
    @NotNull(message = "payback id cannot be null")
    private Integer paybackId;//periodTypeByPaybackId

    @NotBlank(message = "description must be provided")
    private String description;
    @Min(0)
    @NotNull(message = "fixed amount cannot be null")
    private BigDecimal fixedAmount;
    @Min(0)
    @NotNull(message = "maximum amount percentage savings cannot be null")
    private BigDecimal maximumAmountPercentageSavings;
    @Min(0)
    @NotNull(message = "deduction cannot be null")
    private BigDecimal deduction;
    @Min(0)
    @NotNull(message = "Interest rate cannot be null")
    private BigDecimal interestRate;
    @Min(0)
    @NotNull(message = "minimum voluntary contribution cannot be null")
    private BigDecimal minimumVoluntaryContribution;
    @Min(0)
    @NotNull(message = "maximum voluntary contribution cannot be null")
    private BigDecimal maximumVoluntaryContribution;
    @Min(0)
    @NotNull(message = "voluntary savings non withdrawable cannot be null")
    private BigDecimal voluntarySavingsNonWithdrawable;
    @NotNull(message = "requires guarantor cannot be null")
    private Boolean requiresGuarantor;
    @Min(0)
    @NotNull(message = "Number of guarantors is required")
    private Integer numberOfGuarantors;
    @NotNull(message = "requires insurrance cannot be null")
    private Boolean requiresInsurrance;
    @Min(0)
    @NotNull(message = "Insurrance rate cannot be null")
    private BigDecimal insurranceRate;
    @Min(0)
    @NotNull(message = "apply insurance above loan amount cannot be null")
    private BigDecimal applyInsuranceAboveLoanAmount;
    @Min(0)
    @NotNull(message = "payback on same running loan cannot be null")
    private BigDecimal paybackOnSameRunningLoan;
    private Boolean applyAlowablePercentOnAccumulatedNoOfContribution;
    private Integer minNoOfContributionRequiredForLoanEligibility;
//    private List<LoanPercentageAllowedOnContributionNumberDTO> loanPercentageAllowedOnContributionNumbers;
    private Set<LoanPercentageAllowedOnContributionNumberDTO> loanPercentageAllowedOnContributionNumbers;
    private Boolean active;
}
