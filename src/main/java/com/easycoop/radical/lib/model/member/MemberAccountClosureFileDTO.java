/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.member;

import java.util.Date;

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
public class MemberAccountClosureFileDTO {
    private Integer id;
    private Integer memberAccountClosureId;
    private String fileLocation;
    private String fileName;
    private Date createdDate;
}
