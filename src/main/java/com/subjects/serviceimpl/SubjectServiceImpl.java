package com.subjects.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.subjects.dto.SubjectDTO;
import com.subjects.model.Subject;
import com.subjects.repository.SubjectRepository;
import com.subjects.service.SubjectService;
import com.subjects.utils.Document;

@Service
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	SubjectRepository subjectRepository;

	@Override
	public Document<List<SubjectDTO>> getSubject() {
		Document<List<SubjectDTO>> result = new Document<>();
		
		try {
			List<Subject> subject =subjectRepository.findAll();
			if(subject.size()<=0 ) {
				throw new Exception("subjects are null");
			}else {
				List<SubjectDTO> dtolist = new ArrayList<>();
				SubjectDTO dto = new SubjectDTO();
			    for (Subject subj : subject) {
			        dto.setSubjectName(subj.getSubjectName());
			        dto.setDescription(subj.getDescription());
			        dtolist.add(dto);
			    }
				
				result.setData(dtolist);
				result.setStatusCode(200);
				result.setMessage("successfully fetched");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.setData(null);
			result.setStatusCode(500);
			result.setMessage(e.getLocalizedMessage());
		}
		
		
		return result;
	}
	
	@Override
	public Document<Subject> saveSubject(SubjectDTO subjectDto) {
	    Document<Subject> result = new Document<>();

	    try {
	    	Subject subject = new Subject();
	    	subject.setSubjectName(subjectDto.getSubjectName());
	    	subject.setDescription(subjectDto.getDescription());

			Subject savedSubject = subjectRepository.save(subject);

			if (savedSubject != null) {
				result.setData(savedSubject);
				result.setStatusCode(201);
				result.setMessage("Subject Saved Successfully");
	        } else {
	            throw new NullPointerException("Subject creation failed ");
	        }
	    } catch (Exception e) {
	        result.setData(null);
	        result.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
	        result.setMessage( e.getMessage());
	    }

	    return result;
	}

}
