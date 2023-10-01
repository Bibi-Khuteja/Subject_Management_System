package com.subjects.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.subjects.dto.SubjectDTO;
import com.subjects.service.SubjectService;
import com.subjects.utils.Document;

@RestController
public class SubjectController {

	@Autowired
	SubjectService subjectService;
	
	@GetMapping("/getsubs")
	public ResponseEntity<?> getAllSubjects(){
		
		Document<?> response = subjectService.getSubject();
		
		return ResponseEntity.status(response.getStatusCode()).body(response);
	}
	
	@PostMapping("/saveaubs")
	public ResponseEntity<?> saveSubject(@RequestBody SubjectDTO subjectDTO){
		
		Document<?> response = subjectService.saveSubject(subjectDTO);
		
		return ResponseEntity.status(response.getStatusCode()).body(response);
	}
	
}
