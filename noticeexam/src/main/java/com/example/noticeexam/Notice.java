package com.example.noticeexam;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Notice {

	@Id
	public String title;
	
	public String content;
	
}
