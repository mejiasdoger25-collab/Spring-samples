package com.salesianostriana.dam.proyectoejemplo_01Anotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component	//de esta forma tenemos la clase transformada a un bean
public class TestBean {

	@Autowired	//de esta forma se inyectará automáticamente cuando se necesite
	private int algo;
	
	@PostConstruct	//será lo primero en ejecutar después de ver que esta clase es un bean
	public void show () {
		System.out.println("ola");
	}
}
