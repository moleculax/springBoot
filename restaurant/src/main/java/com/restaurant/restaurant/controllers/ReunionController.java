package com.restaurant.restaurant.controllers;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.restaurant.restaurant.models.Persona;
import com.restaurant.restaurant.models.Reunion;

import com.restaurant.restaurant.services.ReunionService;

@Controller
@RequestMapping("/reuniones")
public class ReunionController {
//	agregamos 
	@Autowired
	private ReunionService reunionService;
	
//	private static final List<Reunion> reuniones = new ArrayList<>();
//	
//	
//	static {
//		for (int i = 0; i < 5; i ++) {
//			//reuniones.add(new Reunion(i, "Reunion " + i,ZonedDateTime.now().plusDays(i)));
//			
//			Reunion reunion = new Reunion(i, "Reunion " + i, ZonedDateTime.now().plusDays(i));
//			for (int j = 0; j < i; j ++) {
//				
//				reunion.addAsistente(new Persona(i+j, "Nombre " + i + j,"Apellido " + i + j));
//			}
//			reuniones.add(reunion);
//	
//		}
//	}
	
	@GetMapping
	public String getAllReuniones(Model model) {
		// model.addAttribute("reuniones", reuniones);
		model.addAttribute("reuniones", reunionService.getAllReuniones());
		return "reuniones";
	}
	
}
