/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.notification;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
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
public class NotificationDTO {
    private Integer id;
    private String filename;
    private String title;
    private String description;
    private Integer notificationTypeId;
    private Integer requestTagId;
    private BigDecimal amount;
    private String loanType;
    private Integer sentFrom;
    private String sentFromName;
    private String sentFromUserId;
    private Integer sentTo;
    private String sentToName;
    private Integer sentToRole;
    private String sentToRoleName;
    private Boolean attendedTo;
    private Boolean rejected;
    private String rejectionReason;
    private String sentDate;
    private String attendedDate;
    private Integer cooperativeId;
    private WorkflowConfigurationDTO workflowConfiguration;
    private List<? extends Object> objectList;
    private Date  sortingDate;
    private String category;
    private Integer requestId;
    private Integer loanTypeId;
    private String contributionCategory;
    private String repaymentBankDTO;
}
