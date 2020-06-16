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
public class LoanPaymentBreakdownDTO {
    @Min(0)
    @NotNull(message = "total loan payment cannot be null")
    private BigDecimal totalLoanPayment;
    @Min(0)
    @NotNull(message = "completed loan payment cannot be null")
    private BigDecimal completedLoanPayment;
    @Min(0)
    @NotNull(message = "outstanding loan payment cannot be null")
    private BigDecimal outstandingLoanPayment;
}
