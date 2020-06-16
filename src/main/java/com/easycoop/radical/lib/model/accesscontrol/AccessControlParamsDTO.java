/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.accesscontrol;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author emmanuel.idoko
 */
@Getter
@Setter
public class AccessControlParamsDTO { 
    private Integer coopId;
    private Integer userGroupId;
    private Integer userRoleId;
    private Integer accessGroupId;
    private Integer workflowId;
    private List<Integer> accessGroupIds;
    private List<Integer> requirementIds;
    private List<Integer> userIds;
}
