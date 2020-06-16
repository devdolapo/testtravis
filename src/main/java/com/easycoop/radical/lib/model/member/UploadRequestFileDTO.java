package com.easycoop.radical.lib.model.member;


import lombok.Data;

@Data
public class UploadRequestFileDTO {

	private Integer id;
    private Integer uploadRequestId; 
    private String fileLocation;
    private String fileName;
}
