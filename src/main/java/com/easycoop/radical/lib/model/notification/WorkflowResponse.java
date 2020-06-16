/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author akinw
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
public class WorkflowResponse {
    @NonNull
    private Integer responseCode;
    @NonNull
    private String responseMessage;
    private NotificationDTO notification;
}
