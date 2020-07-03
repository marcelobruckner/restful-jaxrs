package br.com.digitalinnovation.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalinnovation.one.controller.request.SoldadoEditRequest;
import br.com.digitalinnovation.one.dto.Soldado;
import br.com.digitalinnovation.one.service.SoldadoService;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

	@Autowired
	private SoldadoService service;
	
	@GetMapping("/{cpf}")
	public ResponseEntity<Soldado> buscarSoldado(@PathVariable("cpf") String cpf) {
		Soldado soldado = service.buscarSoldado(cpf);
		return ResponseEntity.ok(soldado);
	}
	
	@PostMapping
	public ResponseEntity<Soldado> criarSoldado(@RequestBody Soldado soldado){
		service.criarSoldado(soldado);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PutMapping("/{cpf}")
	public ResponseEntity<?> editarSoldado(@PathVariable("cpf") String cpf, 
												 @RequestBody SoldadoEditRequest soldadoEditRequest){
		service.editarSoldadoo(cpf, soldadoEditRequest);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{cpf}")
	public ResponseEntity<?> excluirSoldado(@PathVariable("cpf") String cpf){
		service.excluirSoldado(cpf);
		return ResponseEntity.ok().build();
	}
}
