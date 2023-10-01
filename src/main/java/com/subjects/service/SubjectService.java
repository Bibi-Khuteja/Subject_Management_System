package com.subjects.service;

import org.springframework.stereotype.Service;

import com.subjects.dto.SubjectDTO;
import com.subjects.model.Subject;
import com.subjects.utils.Document;

@Service
public interface SubjectService {
	
	Document<?> getSubject();

	Document<Subject> saveSubject(SubjectDTO subjectDto);
	
}
