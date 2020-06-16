/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.contribution;

import com.easycoop.radical.lib.model.transaction.TransactionExternalDTO;
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
public class TransactionExternalWrapperDTO {
    @NotNull(message = "Transactions list cannot be null or less than one")
    private List<TransactionExternalDTO> transactions;
}
