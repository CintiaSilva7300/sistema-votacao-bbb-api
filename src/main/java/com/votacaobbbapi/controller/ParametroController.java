package com.votacaobbbapi.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.votacaobbbapi.models.ParametroModel;
import com.votacaobbbapi.repository.ParametroRepository;

@RestController
@RequestMapping("/api/parametros")
public class ParametroController {

	private final ParametroRepository repository;
	
	public ParametroController(ParametroRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping("/salvar")
	public ResponseEntity<ParametroModel> salvar(@RequestBody ParametroModel parametro){
		ParametroModel entidade = repository.save(parametro);
		return ResponseEntity.ok(entidade);
	}
	
	@GetMapping("/consultar")
	public ResponseEntity<ParametroModel> consultar(@RequestParam String chave){
		Optional<ParametroModel> optParametro = repository.findById(chave);
		if(optParametro.isEmpty()) {
			
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(optParametro.get());
	}
}
