package com.subjects.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSUBJECT")
	private Long idSubject;

	@Column(name = "SUBJECT_NAME", length = 45)
	private String subjectName;
	
	@Column(name = "DESCRIPTION", length=1000)
	private String description;

	public Long getIdSubject() {
		return idSubject;
	}

	public void setIdSubject(Long idSubject) {
		this.idSubject = idSubject;
	}

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

	public Subject(Long idSubject, String subjectName, String description) {
		super();
		this.idSubject = idSubject;
		this.subjectName = subjectName;
		this.description = description;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

}
