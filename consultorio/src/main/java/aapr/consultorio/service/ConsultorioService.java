package aapr.consultorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aapr.consultorio.exceptions.UserNotFoundException;
import aapr.consultorio.model.Consultorio;
import aapr.consultorio.repository.ConsultorioRepository;

@Service
public class ConsultorioService {
private ConsultorioRepository consultorioRepository;

@Autowired
public ConsultorioService(ConsultorioRepository consultorioRepository) {
	super();
	this.consultorioRepository = consultorioRepository;
}

public List<Consultorio> getAll(){
	return consultorioRepository.findAll();
}

public Consultorio createUser(Consultorio newUser) {
	return consultorioRepository.save(newUser);
}

public void deleteUser(Long id) {
	if(consultorioRepository.existsById(id)) {
		consultorioRepository.deleteById(id);
	}else {
		throw new UserNotFoundException(id);
	}
}


}
