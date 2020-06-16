/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.cooperative;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
public class AnnouncementDTO {

    @Min(0)
    @NotNull(message = "id cannot be null")
    private Integer id;
    @Min(1)
    @NotNull(message = "cooperative id cannot be null")
    private Integer cooperativeId;
    @NotNull(message = "announcement title cannot be null")
    private String title;
    @NotBlank(message = "announcement message must be provided")
    private String announcement;
    @NotNull(message = "event venue cannot be null")
    private String eventVenue;
    @NotNull(message = "event time cannot be null")
    private String eventTime;
    private String createdDate;
    @NotNull(message = "start date cannot be null")
    private String startDate;
    @NotNull(message = "end date cannot be null")
    private String endDate;
    private String publishedStartDate;
    @NotNull(message = "published end date cannot be null")
    private String publishedEndDate;
    @NotNull(message = "published cannot be null, should be either true or false")
    private Boolean published;
    private Boolean ended;
    @NotNull(message = "isEvent cannot be null, should be either true or false")
    private Boolean isEvent;
}
