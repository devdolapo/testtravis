/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.evoting;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author emmanuel.idoko
 */
@Getter
@Setter
public class ElectionPositionsDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private int id;
    @NotNull(message = "title cannot be null")
    private String title;
    @Min(0)
    @NotNull(message = "notes cannot be null")
    private String notes;
}
