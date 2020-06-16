/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.loan;

import com.easycoop.radical.lib.model.cooperative.RepaymentBankDTO;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
public class LoanScheduleMarkOffDTO {
    @Size(min = 0)
    private List<@Valid LoanScheduleDTO> loanScheduleDTOs;
    @Size(min = 0)
    private List<Integer> transactionIds;
    @NotNull(message = "repayment bank cannot be null")
    private RepaymentBankDTO repaymentBankDTO;
    @NotNull(message = "paid date cannot be null")
    private String paidDate;
}
