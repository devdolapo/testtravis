/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.transaction;

import com.easycoop.radical.lib.model.contribution.ContributionDTO;
import com.easycoop.radical.lib.model.loan.LoanApplicationDTO;
import java.util.List;
import javax.validation.constraints.NotNull;
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
public class TransactionHistoryDTO {

    @NotNull(message = "voluntary transactions cannot be null")
    private List<ContributionDTO> voluntaryTransactions;
    @NotNull(message = "compulsory transactions cannot be null")
    private List<ContributionDTO> compulsoryTransactions;
    @NotNull(message = "loan transactions cannot be null")
    private List<LoanApplicationDTO> loanTransactions;
    @NotNull(message = "voluntary transactions count cannot be null")
    private Long voluntaryTransactionsCount;
    @NotNull(message = "compulsory transactions count cannot be null")
    private Long compulsoryTransactionsCount;
    @NotNull(message = "loan transactions count cannot be null")
    private Long loanTransactionsCount;
}
