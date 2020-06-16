/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.credentials;

import java.util.List;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author akinw
 */
@Getter
@Setter
public class SecurityQuestionsWrapperDTO {
    @NotNull(message = "security questions list cannot be null")
    private List<SecurityQuestionsDTO> securityQuestions;
    @Min(0)
    @NotNull(message = "member profile id cannot be null")
    private Integer memberProfileId;
    @NotNull(message = "email address cannot be null")
    private String emailAddress;
    @NotNull(message = "phone number cannot be null")
    private String phoneNumber;
}
