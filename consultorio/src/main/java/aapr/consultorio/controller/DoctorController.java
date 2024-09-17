package aapr.consultorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aapr.consultorio.model.Doctor;
import aapr.consultorio.service.DoctorService;

@RestController
@RequestMapping("/doctor/d1")
public class DoctorController {
private DoctorService doctorService;

@Autowired
public DoctorController(DoctorService doctorService) {
	super();
	this.doctorService = doctorService;
}

@GetMapping("/consultorio_pacheco/diagnosticos")
public List<Doctor> getMappingAll(){
	return doctorService.getAll();
}

@PostMapping
public Doctor newDiagnostico(@RequestBody Doctor diagnostico) {
	return doctorService.createDiagnostico(diagnostico);
}

}
