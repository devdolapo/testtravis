/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.cooperative;

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
public class RepaymentBankDTO {
    @Min(value = 1, message = "cooperative id must be 1 or greater")
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @NotBlank(message = "cooperative name must be provided")
    private String cooperativeName;
    @NotBlank(message = "bank id cannot be null")
    private String bankId;
    @NotBlank(message = "bank name must be provided")
    private String bankName;
}
