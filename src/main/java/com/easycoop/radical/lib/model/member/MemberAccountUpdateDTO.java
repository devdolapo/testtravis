package com.easycoop.radical.lib.model.member;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberAccountUpdateDTO {
	
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	@NotBlank(message = "username must be provided")
	private String username;
	private String accountUpdateReason;
	private String paypoint;
    private Integer cooperativeNumber;
	@NotBlank(message = "force number must be provided")
    private String forceNumber;
	@NotBlank(message = "AP Number must be provided")
    private String APNumber;
	private Date dateRequestMade;
	private Boolean accountUpdated;
}
