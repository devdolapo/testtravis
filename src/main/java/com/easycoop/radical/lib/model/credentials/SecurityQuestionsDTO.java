/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.credentials;

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
public class SecurityQuestionsDTO {
    @Min(0)
    @NotNull(message = "security question id cannot be null")
    private Integer id;
    @NotBlank(message = "security question must be provided")
    private String securityQuestion;
    @NotBlank(message = "security answer must be provided")
    private String securityAnswer;
    @Min(1)
    @NotNull(message = "member id must be provided")
    private Integer memberProfileId;
    private Boolean hasSecurityQuestion;
}
