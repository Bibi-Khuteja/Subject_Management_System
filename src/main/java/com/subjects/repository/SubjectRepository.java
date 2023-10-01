package com.subjects.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subjects.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
