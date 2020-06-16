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
public class AccountDetailsDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(1)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @NotBlank(message = "cooperative name must be provided")
    private String cooperativeName;
    @NotNull(message = "bank id cannot be null")
    private Integer bankId;
    @NotBlank(message = "account number must be provided")
    private String accountNumber;
    @NotBlank(message = "username must be provided")
    private String username;
    private Integer tokenTries = 0;
    private Boolean locked = Boolean.FALSE;
    private Boolean profiled = Boolean.FALSE;
    private Boolean invalidated = Boolean.FALSE;
    @NotNull(message = "notes cannot be null")
    private List<AccountNoteDTO> notes;
}
