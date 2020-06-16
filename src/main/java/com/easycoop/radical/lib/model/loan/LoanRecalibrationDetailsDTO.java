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
public class LoanRecalibrationDetailsDTO {

    private int id;
    private Integer loanApplicationId;
    private BigDecimal oldOutstandingBalance;
    private BigDecimal newOutstandingBalance;
    private Integer oldDuration;
    private Integer newDuration;
    private String oldScheduleStartDate;
    private String oldScheduleEndDate;
    private String newScheduleStartDate;
    private String newScheduleEndDate;
    private String actionDate;
    private Integer actionDoneBy;
}
