package com.example.app.domain;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Member {
	private Integer id;
	@NotBlank
	@Size(max = 10)
	private String name;
	@Size(max = 255)
	private String title;
	private String today;
	private String todo;
	private Integer typeId;
	private String typeName;
	private Date created;
}