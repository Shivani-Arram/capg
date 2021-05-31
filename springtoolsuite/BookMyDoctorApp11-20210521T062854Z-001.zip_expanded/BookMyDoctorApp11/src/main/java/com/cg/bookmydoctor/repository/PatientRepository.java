package com.cg.bookmydoctor.repository;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bookmydoctor.dto.AvailabilityDates;
import com.cg.bookmydoctor.dto.Doctor;
import com.cg.bookmydoctor.dto.Patient;

@Transactional(readOnly = true)
public interface PatientRepository extends JpaRepository<Patient, Integer>{
	//@Transactional(timeout = 10)
	//@OneToOne(cascade = CascadeType.ALL)
	//List<Patient> findByDoctor(Doctor doctor);
	
	@Transactional(timeout = 10)
	Patient getPat(Patient patient);
	
	@Transactional(timeout = 10)
	List<Patient> findAll();
	
	@Transactional
	<S extends Patient> S save(Patient patient);
	
	
	void delete(Patient patient);

}
