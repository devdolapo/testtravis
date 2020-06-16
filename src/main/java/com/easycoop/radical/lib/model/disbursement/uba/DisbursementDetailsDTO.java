/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.disbursement.uba;

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
public class DisbursementDetailsDTO {
    @Min(1)
    @NotNull(message = "reference ID cannot be null")
    private Integer referenceId;
    @NotBlank(message = "account name must be provided")
    private String accountName;
    @NotBlank(message = "bank code must be provided")
    private String bankCode;
    @NotBlank(message = "account number must be provided")
    private String accountNumber;
    @Min(1)
    @NotNull(message = "transaction amount cannot be null")
    private BigDecimal transactionAmount;
}
