/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.config;

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
public class AlertTypeDTO {
    @NotNull(message = "id cannot be null")
    private Integer id;
    @NotNull(message = "sms must be set to true or false")
    private Boolean sms;
    @NotNull(message = "email must be set to true or false")
    private Boolean email;
    @NotNull
    private String smtpUsername;
    @NotNull
    private String smtpPassword;
    @NotNull
    private String smtpHost;
    @NotNull
    private String smtpPort;
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
}
