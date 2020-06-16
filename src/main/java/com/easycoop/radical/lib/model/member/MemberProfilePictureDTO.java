/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.member;

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
public class MemberProfilePictureDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(1)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @Min(1)
    @NotNull(message = "member profile id cannot be null")
    private Integer memberProfileId;
    private String fileName;
    private String memberName;
    private String fileContent;
}
