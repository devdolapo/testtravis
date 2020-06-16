/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.credentials;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
public class ChangePasswordDTO {
    @NotBlank(message = "old password must be provided")
    private String oldPassword;
    @NotBlank(message = "password must be provided")
    private String password;
    @NotBlank(message = "confirmation password must be provided")
    private String confirmPassword;
    private List<SecurityQuestionsDTO> securityQuestionsDTOs;
    private Boolean isfirstTime;
    @NotNull(message = "token must be provided")
    private String token;
}
