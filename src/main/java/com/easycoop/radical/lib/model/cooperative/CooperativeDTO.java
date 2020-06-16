/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.cooperative;

import java.math.BigDecimal;
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
public class CooperativeDTO {
    
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(1)
    @NotNull(message = "industry id cannot be null")
    private Integer cooperativeIndustryId;
    @NotNull(message = "cooperative industry cannot be null")
    private String cooperativeIndustry;
    @Min(1)
    @NotNull(message = "currenty type id cannot be null")
    private Integer currencyTypeId;
    @NotBlank(message = "currency type must be provided")
    private String currencyType;
    @Min(1)
    @NotNull(message = "frequency id cannot be null")
    private Integer frequencyOfContributionId;
    @NotBlank(message = "frequency of contribution must be provided")
    private String frequencyOfContribution;
    @Min(1)
    @NotNull(message = "state id cannot be null")
    private Integer stateId;
    @NotNull(message = "state must be provided")
    private String state;
    @NotBlank(message = "cooperative code must be provided")
    private String cooperativeCode;
    @NotBlank(message = "cooperative name must be provided")
    private String cooperativeName;
    private Boolean forSystem;
    @NotBlank(message = "address line 1 must be provided")
    private String addressLine1;
    @NotNull(message = "address line 2 cannot be null")
    private String addressLine2;
    @NotNull(message = "address line 3 cannot be null")
    private String addressLine3;
    @NotNull(message = "lga id cannot be null")
    private String lga;
    @NotBlank(message = "country must be provided")
    private String country;
    @NotNull(message = "phone number cannot be null")
    private String phoneNumber;
    @NotNull(message = "email address cannot be null")
    private String emailAddress;
    @NotNull(message = "interest rate on contribution cannot be null")
    private Integer interestRateOnContribution;
    private Boolean activated;
    @Min(0)
    @NotNull(message = "withdrawal limit cannot be null")
    private BigDecimal withdrawalLimit;
    @NotNull(message = "loan pay off cannot be null")
    private Boolean loanPayoffAllowed;
    @NotNull(message = "override member contribution frequency cannot be null")
    private Boolean overrideMemberContributionFrequency;
    @Min(0)
    @NotNull(message = "contribution amount cannot be null")
    private BigDecimal contributionAmount;
    @NotNull(message = "override member contribution amount cannot be null")
    private Boolean overrideMemberContributionAmount;
    @Min(0)
    @NotNull(message = "number of withdrawals per financial year cannot be null")
    private Integer numberOfWithdrawalsPerFinancialYear;
    @NotNull(message = "financial year start cannot be null")
    private String financialYearStart;
    @NotNull(message = "financial year end cannot be null")
    private String financialYearEnd;
    private Boolean closed;
    @NotNull(message = "penalty interest on withdrawal of target savings cannot be null")
    private BigDecimal penaltyInterestOnWithdrawalOnTargetSavings;
//    private Integer alertTypeId;
}
