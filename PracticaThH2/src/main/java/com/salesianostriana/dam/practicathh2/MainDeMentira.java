package com.salesianostriana.dam.practicathh2;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MainDeMentira {

	
	private ProductoRepository prouctoRepository;
	
	@PostConstruct
	public void run () {//id auto
		
		prouctoRepository.save(new Producto("pepe", "6 €"));
		prouctoRepository.save(new Producto("pepa", "7 $"));
		prouctoRepository.save(new Producto("fulano", "67 €"));
		prouctoRepository.save(new Producto("fulano mandarino", "76 €"));
		
		//productoRepository.findAll() {
		//	.forEach()

	}
}
