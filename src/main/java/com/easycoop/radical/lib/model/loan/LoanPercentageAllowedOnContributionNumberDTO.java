/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.loan;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author emmanuel.idoko
 */
@Getter
@Setter
@ToString
public class LoanPercentageAllowedOnContributionNumberDTO {

    private Integer id;
    private Long version;
    private Integer loanTypeId;
    private Integer borrowNo;
    private BigDecimal percentage;
}
