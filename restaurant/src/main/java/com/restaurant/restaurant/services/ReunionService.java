package com.restaurant.restaurant.services;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.restaurant.data.ReunionRepository;
import com.restaurant.restaurant.models.Persona;
import com.restaurant.restaurant.models.Reunion;

@Service

public class ReunionService {

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
	
	private final ReunionRepository reunionRepository;
	
	public ReunionService(ReunionRepository reunionRepository) {
	//super();
	this.reunionRepository = reunionRepository;
}

	public List<Reunion> getAllReuniones(){
//		return reuniones;
		return reunionRepository.findAll();
	}
	
}
