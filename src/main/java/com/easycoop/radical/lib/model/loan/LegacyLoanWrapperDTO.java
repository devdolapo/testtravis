/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.loan;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Administrator
 */
@Getter
@Setter
@ToString
public class LegacyLoanWrapperDTO {

    private LoanApplicationDTO loanApplicationDTO;
    private List<GuarantorDTO> guarantorDTOs;
    private List<LoanScheduleDTO> loanScheduleDTOs;
}
