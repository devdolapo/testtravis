/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.accesscontrol;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Administrator
 */
@Getter
@Setter
public class UserGroupMemberDTO {

    @Min(0)
    @NotNull(message = "user group id cannot be null")
    private Integer userGroupId;
    @NotNull(message = "group name cannot be null")
    private String groupName;
    @Min(0)
    @NotNull(message = "member profile id cannot be null")
    private Integer memberProfileId;
    @NotNull(message = "username cannot be null")
    private String username;
    @NotNull(message = "member name cannot be null")
    private String memberName;
}
