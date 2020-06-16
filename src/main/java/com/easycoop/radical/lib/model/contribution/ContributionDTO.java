/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.contribution;

import com.easycoop.radical.lib.model.transaction.TransactionExternalDTO;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
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
public class ContributionDTO {

    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(1)
    @NotNull(message = "member profile id cannot be null")
    private Integer memberProfileId;
    @Min(1)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @Min(1)
    @NotNull(message = "amount cannot be null")
    private BigDecimal amount;
    @NotBlank(message = "transaction date must be provided")
    private String transactionDate;
    private String actionDate;
    @Min(0)
    @NotNull(message = "savings id cannot be null")
    private Integer savingsApplicationId;
    @NotBlank(message = "contribution category must be provided")
    private String contributionCategory;

    private Integer transactionTypeId;
    private String transactionType;

    //name information to pass along to front-end
    private String firstName;
    private String middleName;
    private String lastName;
    private String username;
    private String ippinNo;
    private String initiatorName;
    private Integer initiatorId;
    private Date sortingDate;
    private Integer requestId;
}
