package com.example.Javickamodelmapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavickaModelmapperApplication {

	public static void main(String[] args) {
		MappingBegin mappingBegin = new MappingBegin();

		// mappingBegin.mapping();
		mappingBegin.customMapping();

		SpringApplication.run(JavickaModelmapperApplication.class, args);
	}
}
