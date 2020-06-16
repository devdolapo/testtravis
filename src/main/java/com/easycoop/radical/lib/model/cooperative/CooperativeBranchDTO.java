/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.cooperative;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author emmanuel.idoko
 */
@Getter
@Setter
@ToString
public class CooperativeBranchDTO {

    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @NotBlank(message = "branch name must be provided")
    private String name;
    private String address;
    private String city;
    @Min(1)
    @NotNull(message = "state id cannot be null")
    private Integer stateId;
    private String country;
    private String headOfBranch;
    @Min(1)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @NotNull(message = "allow member edit flag cannot be null")
    private Boolean allowMemberEdit;
}
