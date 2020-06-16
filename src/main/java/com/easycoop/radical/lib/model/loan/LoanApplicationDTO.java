/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.loan;

import java.math.BigDecimal;
import java.util.List;
import javax.validation.constraints.Min;
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
public class LoanApplicationDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(1)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    private String cooperative;
    @Min(1)
    @NotNull(message = "loan type id cannot be null")
    private Integer loanTypeId;
    private String loanType;
    @Min(1)
    @NotNull(message = "member profile id cannot be null")
    private Integer memberProfileId;
    @Min(1)
    @NotNull(message = "amount cannot be null")
    private BigDecimal amount;
    @NotNull(message = "application date cannot be null")
    private String applicationDate;
    @NotNull(message = "start date cannot be null")
    private String startDate;
    @NotNull(message = "end date cannot be null")
    private String endDate;
    @NotNull(message = "period type id cannot be null")
    private Integer periodTypeId;
    @NotNull(message = "duration cannot be null")
    private Integer duration;
    @Min(0)
    @NotNull(message = "interest rate cannot be null")
    private BigDecimal interestRate;
    @Min(0)
    @NotNull(message = "application to pay cannot be null")
    private BigDecimal interestToPay;
    @Min(0)
    @NotNull(message = "loan to pay cannot be null")
    private BigDecimal loanToPay;
    @Min(0)
    @NotNull(message = "total payable amount cannot be null")
    private BigDecimal totalPayableAmount;
    @Min(0)
    @NotNull(message = "periodic payback amount cannot be null")
    private BigDecimal periodicPaybackAmount;
    private Boolean active;
    private Boolean sentForApproval;
    private Boolean cancelled;
    private Boolean paid;
    private Boolean rejected;
    private String rejectedReason;
    
    //insurance information
    @Min(0)
    @NotNull(message = "net exposure cannot be null")
    private BigDecimal netExposure;
    @NotNull(message = "insured cannot be null")
    private Boolean insured;
    @Min(0)
    @NotNull(message = "insurance interest rate cannot be null")
    private BigDecimal insuranceInterestRate;
    @Min(0)
    @NotNull(message = "insurance amount cannot be null")
    private BigDecimal insuranceAmount;
    
    @NotNull(message = "guarantor list cannot be null")
    List<GuarantorDTO> guarantors;
    List<LoanScheduleDTO> schedules;
    
    private BigDecimal totalAmountPaidBack;
    private BigDecimal totalAmountOutstanding;
    //name information to pass along to front-end
    private String firstName;
    private String middleName;
    private String lastName;
    private String username;
    private String initiatorName;
    private Integer initiatorId;
}
