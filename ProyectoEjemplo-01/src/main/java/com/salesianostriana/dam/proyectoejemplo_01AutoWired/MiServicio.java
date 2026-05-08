package com.salesianostriana.dam.proyectoejemplo_01AutoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class MiServicio {

//	@Autowired
	private /*final*/ MiRepositorio miRepositorio;
	private DataUtils dataUtils;
	@Autowired
	private DataReader dr;

	
//	@Autowired
/*	public MiServicio(MiRepositorio miRepositorio) {
		super();
		this.miRepositorio = miRepositorio;
	}
	
	public MiServicio () {
	}

	
	@Autowired
	public void setMiRepositorio(MiRepositorio miRepositorio) {
		this.miRepositorio = miRepositorio;
	}
*/	

	@Autowired
	public void prepare (MiRepositorio miRepositorio, DataUtils dataUtils) {
		this.miRepositorio = miRepositorio;
		this.dataUtils = dataUtils;
	
	}
	
	public void ejecutar () {
		miRepositorio.realizarOperacion();
		System.out.println(dr.readData());
	}
	
	
}
