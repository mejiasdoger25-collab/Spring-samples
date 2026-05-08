package com.salesianostriana.dam.proyectoejemplo_01;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import scope.Servicio1;
import scope.Servicio2;
import scope.Servicio3;

@Component
public class MainDeMentira {

		@Autowired
	private ApplicationContext ctx;
	
//	@Autowired
//	private MiServicio miServicio;
	
	/*@Autowired
	@Qualifier("apiQuery")
	private Query query;*/
	
	@Autowired
	private Servicio1 s1;
	@Autowired
	private Servicio2 s2;
	@Autowired
	private Servicio3 s3;
	
	@PostConstruct
	public void init () {
		/*for (String s: ctx.getBeanDefinitionNames()) {
			System.out.println(">>> " + s);
		}
		
		System.out.println(s1.utils);
		System.out.println(s2.utils);
		System.out.println(s3.utils);*/

//		miServicio.ejecutar();
//		System.out.println(query.fetchData());
		
		
	}
	
	@PreDestroy
	public void despose() {
		System.out.println("Este bean se va a ejecutar");
	}
}
