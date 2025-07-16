package br.com.cotiinformatica.configurations;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfiguration {
	
	//Libera para utilizar com injeção de dependência	
	@Bean
	ModelMapper getModelMapper() {
		var mapper= new ModelMapper();
		
		//TODO fazer configurações para o ModelMapper
		return mapper;
	}
	
}
