package com.restaurant.restaurant.services;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.restaurant.restaurant.data.PersonaRepository;
import com.restaurant.restaurant.models.Persona;

@Service
public class PersonaService {

	private final PersonaRepository personaRepository;

	public PersonaService(PersonaRepository personaRepository) {
		//super();
		this.personaRepository = personaRepository;
	}

	public List<Persona> getAllPersonas(){
		// return personas;
		return personaRepository.findAll();
	}
	


}
