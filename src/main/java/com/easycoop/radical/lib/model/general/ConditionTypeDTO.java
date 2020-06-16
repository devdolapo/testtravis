/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.general;

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
public class ConditionTypeDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @NotBlank(message = "name must be provided")
    private String name;
    @NotBlank(message = "description must be provided")
    private String description;
}
