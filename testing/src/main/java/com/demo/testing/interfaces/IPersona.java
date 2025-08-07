package com.demo.testing.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.testing.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
