/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.disbursement.uba;

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
public class TransactionReportDTO {
    @Min(0)
    @NotNull(message = "reference ID cannot be null")
    private Integer referenceId;
    @NotBlank(message = "account name must be provided")
    private String receiverAccountName;
    @NotBlank(message = "bank name must be provided")
    private String receiverBankName;
    @NotBlank(message = "account number must be provided")
    private String receiverAccountNumber;
    @NotBlank(message = "transaction amount must be provided")
    private String transactionAmount;
    @NotBlank(message = "charge amount must be provided")
    private String chargeAmount;
    @NotBlank(message = "total amount must be provided")
    private String totalAmount;
    @NotBlank(message = "error flag must be provided")
    private String errorFlag = "false";
    @NotBlank(message = "message must be provided")
    private String message = "no message returned";
    private String processedDate = "";
    private Boolean processed = Boolean.FALSE;
}
