/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.loan;

import java.math.BigDecimal;
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
public class TransactionLoanDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private int id;
    @Min(1)
    @NotNull(message = "loan schedule id cannot be null")
    private Integer loanScheduleId;
    @Min(1)
    @NotNull(message = "member profile id cannot be null")
    private Integer memberProfileId;
    @Min(1)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @NotNull(message = "transaction type cannot be null")
    private String transactionType;
    @Min(1)
    @NotNull(message = "transaction type id cannot be null")
    private Integer transactionTypeId;
    @NotNull(message = "amount cannot be null")
    private BigDecimal amount;
    @NotNull(message = "transaction date cannot be null")
    private String transactionDate;
    private String actionDate;
    @NotNull(message = "amount in and out cannot be null")
    private BigDecimal amountInAndOut;
    @NotNull(message = "paid cannot be null")
    private Boolean paid;
    @NotNull(message = "paid date cannot be null")
    private String paidDate;
    
    //name information to pass along to front-end
    private String firstName;
    private String middleName;
    private String lastName;
}
