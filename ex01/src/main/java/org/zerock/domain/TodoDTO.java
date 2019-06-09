package org.zerock.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoDTO {
	private String title;
//	private Date dueDate; 
	
	@DateTimeFormat(pattern = "yyyy/MM/dd") //@InitBinder 필요 x 
	private Date dueDate; 
}
