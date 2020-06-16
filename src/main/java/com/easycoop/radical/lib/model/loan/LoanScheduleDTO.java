/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.loan;

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
public class LoanScheduleDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private int id;
    @Min(1)
    @NotNull(message = "id cannot be null")
    private Integer loanApplicationId;
    @Min(1)
    @NotNull(message = "amount payable cannot be null")
    private BigDecimal amountPayable;
    @Min(0)
    @NotNull(message = "principal amount cannot be null")
    private BigDecimal principalAmount;
    @Min(0)
    @NotNull(message = "interest amount cannot be null")
    private BigDecimal interestAmount;
    @Min(0)
    @NotNull(message = "remaining principal cannot be null")
    private BigDecimal remainingPrincipal;
    @Min(0)
    @NotNull(message = "balance to pay cannot be null")
    private BigDecimal balanceToPay;
    @Min(0)
    @NotNull(message = "outstanding balance cannot be null")
    private BigDecimal outstandingBalance;
    @NotBlank(message = "payable date cannot be null")
    private String payableDate;
    @NotNull(message = "paid cannot be null")
    private Boolean paid;
    @NotNull(message = "paid date cannot be null")
    private String paidDate;
    
    //name information to pass along to front-end
    private String firstName;
    private String middleName;
    private String lastName;
    private Integer memberId;
    private String initiatorName;
    private Integer initiatorId;
}
