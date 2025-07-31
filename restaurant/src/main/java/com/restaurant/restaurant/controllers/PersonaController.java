package com.restaurant.restaurant.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.restaurant.restaurant.services.PersonaService;

@Controller
@RequestMapping("/personas")
public class PersonaController {
//	agrego

	@Autowired
	PersonaService personaService;

//	public static final List<Persona> personas = new ArrayList<>();
//
//	
//	
//	static {
//		for (int i = 0; i < 5; i ++) {
//			
//			Persona persona = new Persona(i, "Nombre " + i, "Apellidos " + i);
//			personas.add(persona);
//			
//		}
//	}

	@GetMapping
	public String getAllPersonas(Model model) {
		model.addAttribute("personas", personaService.getAllPersonas());
		return "personas";
	}
}
