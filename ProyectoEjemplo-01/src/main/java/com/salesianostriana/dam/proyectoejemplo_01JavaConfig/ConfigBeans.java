package com.salesianostriana.dam.proyectoejemplo_01JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {

	//creamos un method que devuelve una instancia de la clase que queremos transformar en un bean
	//el name del method puede ser cualquiera pero hay que tener en cuenta que este name va a ser el que va a tener el bean
	//(generalmente, para ahorrar problemas, le vamos a dar el mismo nombre)
	@Bean
	public TestBeanV2 otroBean () {
		return new TestBeanV2();
	}
}
