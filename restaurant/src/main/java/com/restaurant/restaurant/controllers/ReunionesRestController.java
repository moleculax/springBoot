package com.restaurant.restaurant.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.restaurant.models.Reunion;
import com.restaurant.restaurant.services.ReunionService;

@RestController
@RequestMapping("/api/reuniones")
public class ReunionesRestController {

	private ReunionService reunionService;

	public ReunionesRestController(ReunionService reunionService) {
		super();
		this.reunionService = reunionService;
	}
	
	@GetMapping
	
	public List<Reunion> getAllReuniones(){
		return reunionService.getAllReuniones();
	}
	
}
