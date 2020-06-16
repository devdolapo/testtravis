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
public class PersonalInformationDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
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
    @NotNull(message = "occupation cannot be null")
    private String occupation;
    @Min(0)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @NotNull(message = "cooperative cannot be null")
    private String cooperative;
    @Min(0)
    @NotNull(message = "cooperative branch id cannot be null")
    private Integer branchId;
    @NotNull(message = "username cannot be null")
    private String username;
}
