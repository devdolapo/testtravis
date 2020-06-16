package com.easycoop.radical.lib.model.general;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ModuleDTO {

	private Integer id;
    private String moduleName;
    private String moduleDescription;
    private String moduleCode;
}
