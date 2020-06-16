package com.easycoop.radical.lib.model.loan;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RepaymentScheduleDto {
    private BigDecimal amount;
    private LocalDate payableDate;
}
