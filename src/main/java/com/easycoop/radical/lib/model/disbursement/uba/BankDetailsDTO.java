/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.disbursement.uba;

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
    @NotBlank(message = "batch number must be provided")
    private String batchNumber;
    @NotBlank(message = "institution code must be provided")
    private String institutionCode;
    @NotBlank(message = "institution name must be provided")
    private String institutionName;
    @NotBlank(message = "category must be provided")
    private String category;
}
