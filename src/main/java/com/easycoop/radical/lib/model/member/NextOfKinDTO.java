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

/**
 *
 * @author akinw
 */
@Getter
@Setter
public class NextOfKinDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @NotNull(message = "first n")
    private String firstName;
    @NotNull(message = "middle name cannot be null")
    private String middleName;
    @NotBlank(message = "last name cannot be null")
    private String lastName;
    
    @Min(1)
    @NotNull(message = "gender id cannot be null")
    private Integer genderId;
    
    @NotBlank(message = "address line 1 cannot be null")
    private String addressLine1;
    @NotNull(message = "address line 2 cannot be null")
    private String addressLine2;
    @NotNull(message = "address line 3 cannot be null")
    private String addressLine3;
    @NotNull(message = "lga cannot be null")
    private String lga;
    @Min(1)
    @NotNull(message = "state id cannot be null")
    private Integer stateId;
    @NotBlank(message = "country cannot be null")
    private String country;
    @NotNull(message = "phone number cannot be null")
    private String phoneNumber;
    @NotNull(message = "alternate phone number cannot be null")
    private String alternatePhoneNumber;
    @NotNull(message = "email address cannot be null")
    @ExtendedEmailValidator
    private String emailAddress;
    @NotNull(message = "alternate email address cannot be null")
    @ExtendedEmailValidator
    private String alternateEmailAddress;
    @NotBlank(message = "relationship must be provided")
    private String relationship;
    @Min(1)
    @NotNull(message = "member profile id cannot be null")
    private Integer memberProfileId;
}
