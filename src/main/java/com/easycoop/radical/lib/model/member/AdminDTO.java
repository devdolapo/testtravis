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
public class AdminDTO {
    @Min(1)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @NotBlank(message = "username must be provided")
    private String username;
    @NotBlank(message = "first name must be provided")
    private String firstName;
    @NotNull(message = "middle name cannot be null")
    private String middleName;
    @NotBlank(message = "last name must be provided")
    private String lastName;
    
    @NotNull(message = "is cooperative admin cannot be null")
    private Boolean isCooperativeAdmin;
    @NotNull(message = "is account module admin cannot be null")
    private Boolean isAccountModuleAdmin;
    @NotBlank(message = "email address must be provided")
    private String emailAddress;
    @NotBlank(message = "phone number must be provided")
    private String phoneNumber;
}
