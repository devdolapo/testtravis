/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.notification;

/**
 *
 * @author akinw
 */
public class WorkflowStatusDTO {
    public static int ERROR = 500;
    public static int IN_TRANSIT = 200;
    public static int SUCCESS = 0;
    public static String TO_SEND_SMS="yes";
    public static String TO_ATTEND = "to-attend";
    public static String ATTENDED_TO = "attended-to";
}
