package com.restaurant.restaurant.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.restaurant.models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
