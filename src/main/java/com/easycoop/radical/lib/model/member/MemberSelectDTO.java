/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.member;

import java.beans.Transient;
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
public class MemberSelectDTO {
    @Min(0)
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
    private String emailAddress;
    private String phoneNumber;
    private String userRoleName;
    private String cooperativeName;
    
    //Damilola Awe added this to provide filename for endpoint
    private String memberprofilepic;
}
