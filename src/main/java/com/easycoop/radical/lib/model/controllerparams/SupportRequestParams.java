/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.controllerparams;

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
public class SupportRequestParams {
    @NotNull(message = "cooperative id cannot be empty")
    private Integer requestersCooperativeId;
    private Boolean requesterIsSystemAdmin;
    private Boolean requesterIsCooperativeAdmin;
}
