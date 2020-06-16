/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.member;

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
public class BankDetailsDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(1)
    @NotNull(message = "bank id cannot be null")
    private Integer bankId;
    @NotNull(message = "bank cannot be null")
    private String bank;
    @NotBlank(message = "account number must be provided")
    private String accountNumber;
    @NotNull(message = "bank verification number cannot be null")
    private String bankVerificationNumber;
    @Min(0)
    private Integer cooperativeId;
    @NotNull(message = "cooperative cannot be null")
    private String cooperative;
}
