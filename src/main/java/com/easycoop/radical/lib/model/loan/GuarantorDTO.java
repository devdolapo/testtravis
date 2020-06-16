package com.easycoop.radical.lib.model.loan;

import java.math.BigDecimal;
import javax.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class GuarantorDTO {
    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(1)
    @NotNull(message = "id cannot be null")
    private Integer memberProfileId;
    @Min(0)
    @NotNull(message = "loan application id cannot be null")
    private Integer loanApplicationId;
    @NotBlank(message = "username cannot be null")
    private String username;
    @NotNull(message = "first name must be provided")
    private String firstName;
    @NotNull(message = "middle name cannot be null")
    private String middleName;
    @NotNull(message = "last name cannot be null")
    private String lastName;
    @NotNull(message = "requester first name cannot be null")
    private String requesterFirstName;
    @NotNull(message = "requester middle name cannot be null")
    private String requesterMiddleName;
    @NotNull(message = "requester last name cannot be null")
    private String requesterLastName;
    @NotNull(message = "requester amount cannot be null")
    private BigDecimal requesterAmount;
    @NotNull(message = "approved cannot be null")
    private Boolean approved;
    @NotNull(message = "rejected cannot be null")
    private Boolean rejected;
    private Boolean active;
    private String profilePicture;
}
