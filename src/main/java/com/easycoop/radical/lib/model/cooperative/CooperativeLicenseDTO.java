/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.cooperative;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
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
public class CooperativeLicenseDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(0)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @NotNull(message = "cooperative cannot be null")
    private String cooperative;
    @Min(1)
    @NotNull(message = "period type id cannot be null")
    private Integer periodTypeId;
    @NotNull(message = "period type cannot be null")
    private String periodType;
    private String licenseInformation;
    private String startDate;
    private String endDate;
    @NotNull(message = "duration cannot be null")
    private Integer duration;
    @NotNull(message = "in perpetuity cannot be null")
    private Boolean inPerpetuity;
    private Boolean hasEnded;

}
