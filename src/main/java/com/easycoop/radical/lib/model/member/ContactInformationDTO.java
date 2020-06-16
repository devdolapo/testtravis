/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.member;

import com.easycoop.radical.lib.model.customvalidator.ExtendedEmailValidator;
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
public class ContactInformationDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @NotBlank(message = "address line 1 must be provided")
    private String addressLine1;
    @NotNull(message = "address line 2 cannot be null")
    private String addressLine2;
    @NotNull(message = "address line 3 cannot be null")
    private String addressLine3;
    @NotNull(message = "lga cannot be null")
    private String lga;
    @Min(1)
    private Integer stateId;
    @NotNull(message = "state cannot be null")
    private String state;
    @NotBlank(message = "country must be provided")
    private String country;
    @NotNull(message = "phone number cannot be null")
    private String phoneNumber;
    @NotNull(message = "email address cannot be null")
    @ExtendedEmailValidator
    private String emailAddress;
    @Min(0)
    private Integer cooperativeId;
    @NotNull(message = "cooperative cannot be null")
    private String cooperative;
}
