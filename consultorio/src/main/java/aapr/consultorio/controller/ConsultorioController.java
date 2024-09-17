package aapr.consultorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import aapr.consultorio.model.Consultorio;
import aapr.consultorio.service.ConsultorioService;


@RestController
@RequestMapping("/api/v1")
public class ConsultorioController {
private ConsultorioService consultorioService;

@Autowired
public ConsultorioController(ConsultorioService consultorioService) {
	this.consultorioService = consultorioService;
}

@GetMapping("/consultorio_pacheco")
public List<Consultorio> getMappingAll(){
	return consultorioService.getAll();
}

@PostMapping
public Consultorio newUser(@RequestBody Consultorio user) {
	return consultorioService.createUser(user);
}

@DeleteMapping("/consultorio_pacheco/{id}")
public void deleteUser(@PathVariable(name="id") Long id) {
	consultorioService.deleteUser(id);
}




}
