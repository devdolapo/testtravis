/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.transaction;

import java.math.BigDecimal;
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
public class TransactionCooperativeSavingsDTO {

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
    @NotNull(message = "transaction type id cannot be null")
    private Integer transactionTypeId;
    @Min(1)
    @NotNull(message = "savings application id cannot be null")
    private Integer savingsApplicationId;
    @Min(1)
    @NotNull(message = "amount cannot be null")
    private BigDecimal amount;
    @Min(1)
    @NotBlank(message = "transaction date cannot be empty")
    private String transactionDate;
    private BigDecimal amountInAndOut;
    private String actionDate;
    private Boolean paid;
    private String paidDate;
    private Boolean isEligible;
    private Boolean isWallet;
    @NotNull(message = "allow withdrawal cannot be null")
    private Boolean allowWithdrawal;
    private String initiatorName;
    private Integer initiatorId;
}
