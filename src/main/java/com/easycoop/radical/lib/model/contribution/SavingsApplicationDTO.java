/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.contribution;

import com.easycoop.radical.lib.model.transaction.TransactionCooperativeSavingsDTO;
import java.math.BigDecimal;
import java.util.List;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
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
public class SavingsApplicationDTO {

    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @NotNull(message = "title must be provided")
    private String title;
    @NotBlank(message = "description must be provided")
    private String description;
    @Min(1)
    @NotNull(message = "member profile id cannot be null")
    private Integer memberProfileId;
    private String memberFullName;
    @Min(1)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;

    @Min(1)
    @NotNull(message = "amount cannot be null")
    private BigDecimal amount;
    private String applicationDate;
    @NotBlank(message = "start date must be provided")
    private String startDate;
    private String endDate;
    @Min(1)
    @NotNull(message = "period type id cannot be null")
    private Integer periodTypeId;
    private Integer paymentDurationValue;
    @Min(1)
    @NotNull(message = "target amount cannot be null")
    private BigDecimal targetAmount;
    private Boolean savingsWithdrawn;
    private BigDecimal amountWithdrawn;
    private BigDecimal interestCharged;
    private String withdrawalDate;
    private BigDecimal contributedAmount;
    private BigDecimal outstandingAmount;
    private Boolean currentMonthPaid;
    @NotNull(message = "preview flag cannot be null")
    private Boolean preview;
    private List<TransactionCooperativeSavingsDTO> targetSavings;
    
    private String coopTargetAmount;
    private String coopContributedAmount;
    private String coopOutstandingAmount;
    private String initiatorName;
    private Integer initiatorId;
}
