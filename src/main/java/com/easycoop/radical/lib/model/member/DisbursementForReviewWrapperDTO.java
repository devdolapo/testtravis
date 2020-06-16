/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.member;

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
public class DisbursementForReviewWrapperDTO {
    private Integer cooperativeId;
    private List<DisbursementForReviewDTO> dtos;
}
