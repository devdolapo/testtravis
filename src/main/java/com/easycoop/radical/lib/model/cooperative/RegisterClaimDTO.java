/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.cooperative;

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
public class RegisterClaimDTO {

    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(0)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @NotNull(message = "cooperative name cannot be null")
    private String cooperative;
    @NotBlank(message = "first name must be provided")
    private String firstName;
    @NotNull(message = "middle name cannot be null")
    private String middleName;
    @NotBlank(message = "last name must be provided")
    private String lastName;
    @Min(0)
    @NotNull(message = "gender id cannot be null")
    private Integer genderId;
    @NotNull(message = "gender cannot be null")
    private String gender;
    @NotNull(message = "address line 1 cannot be null")
    private String addressLine1;
    @NotNull(message = "address line 2 cannot be null")
    private String addressLine2;
    @NotNull(message = "address line 3 cannot be null")
    private String addressLine3;
    @Min(0)
    @NotNull(message = "state id cannot be null")
    private Integer stateId;
    @NotNull(message = "state must be provided")
    private String state;
    @NotNull(message = "country cannot be null")
    private String country;
    @NotNull(message = "phone number cannot be null")
    private String phoneNumber;
    @NotNull(message = "email address cannot be null")
    @ExtendedEmailValidator
    private String emailAddress;
    @NotNull(message = "cooperative name cannot be null")
    private String cooperativeName;
    @NotNull(message = "register cooperative cannot be null")
    private Boolean registerCooperative;
    @NotNull(message = "join cooperative cannot be null")
    private Boolean joinCooperative;
    @NotNull(message = "make claim cannot be null")
    private Boolean makeClaim;
    private Boolean forwardedToCooperative;
    private Boolean treated;
    @NotNull(message = "pay point cannot be null")
    private String payPoint;
    @NotNull(message = "force number cannot be null")
    private String forceNumber;
    @NotNull(message = "rank cannot be null")
    private String rank;
    private long totalRecords;
    private String rejectionReason;
}
