package aapr.consultorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aapr.consultorio.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{

}
