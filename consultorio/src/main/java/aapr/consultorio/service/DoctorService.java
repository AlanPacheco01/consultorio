package aapr.consultorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aapr.consultorio.model.Doctor;
import aapr.consultorio.repository.DoctorRepository;

@Service
public class DoctorService {
private DoctorRepository doctorRepository;

@Autowired
public DoctorService(DoctorRepository doctorRepository) {
	super();
	this.doctorRepository = doctorRepository;
}

public List<Doctor> getAll(){
	return doctorRepository.findAll();
}

public Doctor createDiagnostico(Doctor newDiagnostico) {
	return doctorRepository.save(newDiagnostico);
}


}
