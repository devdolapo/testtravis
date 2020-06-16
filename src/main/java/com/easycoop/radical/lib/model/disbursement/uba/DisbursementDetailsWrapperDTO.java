/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.disbursement.uba;

import java.util.List;
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
public class DisbursementDetailsWrapperDTO {
    @Min(1)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @NotBlank(message = "cooperative name must be provided")
    private String cooperativeName;
    @NotNull(message = "disbursement file cannot be null")
    private String disbursementFileName;
    @NotBlank(message = "token must be provided")
    private String token;
    @NotNull(message = "disbursement details list cannot be null")
    private List<DisbursementDetailsDTO> disbursementDetails;
}
