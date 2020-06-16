package com.easycoop.radical.lib.model.loan;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class LoanRepaymentDto {
    public BigDecimal totalRepayment;
    public BigDecimal interestPayment;
    public List<RepaymentScheduleDto> repayments;
}
