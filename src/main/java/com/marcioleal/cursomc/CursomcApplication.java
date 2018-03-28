package com.marcioleal.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcioleal.cursomc.domain.Categoria;
import com.marcioleal.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepositiry;
	
	public static void main(String[] args) {
		
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	  Categoria cat1 = new Categoria(null,"Informática");
	  Categoria cat2 = new Categoria(null,"Escritorio");
	  categoriaRepositiry.save(Arrays.asList(cat1,cat2));
	}
	
	
}
