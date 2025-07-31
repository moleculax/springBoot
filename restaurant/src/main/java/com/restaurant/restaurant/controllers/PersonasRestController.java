package com.restaurant.restaurant.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.restaurant.models.Persona;
import com.restaurant.restaurant.services.PersonaService;

@RestController
@RequestMapping("/api/personas")

public class PersonasRestController {
	
	private PersonaService personaService;

	public PersonasRestController(PersonaService personaService) {
		//super();
		this.personaService = personaService;
	}
	
	@GetMapping
	
	public List<Persona> getAllPersonas(){
		return personaService.getAllPersonas();
	}
	
	
}
