/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.credentials;

import javax.validation.constraints.NotBlank;
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
public class LoginCredentialsDTO {
    @NotBlank(message = "username must be provided")
    private String username;
    @NotBlank(message = "password must be provided")
    private String password;
    @NotBlank(message = "confirmation password must be provided")
    private String confirmPassword;
}
