/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.member;

import com.easycoop.radical.lib.model.customvalidator.ExtendedEmailValidator;
import java.math.BigDecimal;
import java.util.Date;

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
public class MemberDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @NotBlank(message = "username must be provided")
    private String username;
    private String password = "";
    @NotBlank(message = "first name must be provided")
    private String firstName;
    @NotNull(message = "middle name cannot be null")
    private String middleName;
    @NotBlank(message = "last name must be provided")
    private String lastName;
    
    @Min(1)
    @NotNull(message = "gender id cannot be null")
    private Integer genderId;
    private String gender;
    @NotNull(message = "date of birth cannot be null")
    private String dateOfBirth;
    
    @NotBlank(message = "address line 1 must be provided")
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
    @NotNull(message = "state cannot be null")
    private String state;
    @NotBlank(message = "country must be provided")
    private String country;
    @NotNull(message = "phone number cannot be null")
    private String phoneNumber;
    @NotNull(message = "email address cannot be null")
    @ExtendedEmailValidator
    private String emailAddress;
    
    @NotNull(message = "system admin position cannot be null")
    private String systemAdminPosition;
    
    @NotNull(message = "occupation cannot be null")
    private String occupation;
    private BigDecimal yearlyIncome;
    private Integer cooperativeMembershipNumber;
    
    @Min(1)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @NotNull(message = "cooperative cannot be null")
    private String cooperative;
    
    private String alternatePhoneNumber;
    private String alternateEmailAddress;
    
    @NotNull(message = "is system admin cannot be null")
    private Boolean isSystemAdmin;
    @NotNull(message = "is cooperative admin cannot be null")
    private Boolean isCooperativeAdmin;
    @NotNull(message = "is account module admin cannot be null")
    private Boolean isAccountModuleAdmin;
    @NotNull(message = "participating cannot be null")
    private Boolean participating;
    @NotNull(message = "account closed cannot be null")
    private Boolean accountClosed;
    @NotNull(message = "account suspended cannot be null")
    private Boolean accountSuspended;
    @NotNull(message = "account locked cannot be null")
    private Boolean locked;
    
    @Min(0)
    @NotNull(message = "contribution amount cannot be null")
    private BigDecimal contributionAmount;
    
    @Min(0)
    @NotNull(message = "bank id cannot be null")
    private Integer bankId;
    private String bank;
    @NotNull(message = "account number cannot be null")
    private String accountNumber;
    @NotNull(message = "bank verification number cannot be null")
    private String bankVerificationNumber;
    
    @NotNull(message = "first time cannot be null")
    private Boolean firstTime;
    @NotNull(message = "accepted terms and conditions cannot be null")
    private Boolean acceptedTermsAndConditions;
    private Integer contributionWithdrawalCount;
    private Integer branchId;
    private String lastLoginDate;
    private Boolean hasPhoneNumber;
    private Boolean hasEmailAddress;
    private Boolean hasSecurityQuestions;
    private String cooperativeCode;
    private String accountCreationDate;
    @NotNull(message = "IPPIS Number cannot be null")
    private String ippisNo;
    private String forceNo;
    private String payPoint;
    private Boolean haveBeenEdited;
    private String editedBy;
    private Date lastEdited;
}
