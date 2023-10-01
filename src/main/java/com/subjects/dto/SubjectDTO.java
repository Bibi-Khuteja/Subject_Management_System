package com.subjects.dto;

public class SubjectDTO {
	
	private String subjectName;
	
	private String description;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SubjectDTO(String subjectName, String description) {
		super();
		this.subjectName = subjectName;
		this.description = description;
	}

	public SubjectDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
