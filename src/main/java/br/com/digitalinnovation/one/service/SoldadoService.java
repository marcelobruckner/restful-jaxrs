package br.com.digitalinnovation.one.service;

import org.springframework.stereotype.Service;

import br.com.digitalinnovation.one.controller.request.SoldadoEditRequest;
import br.com.digitalinnovation.one.dto.Soldado;

@Service
public class SoldadoService {

	public Soldado buscarSoldado(String cpf) {
		Soldado soldado = new Soldado();
		soldado.setCpf(cpf);
		soldado.setNome("Legolas");
		soldado.setRaca("Elfo");
		soldado.setArma("Arco e flecha");
		return soldado;
	}

	public void criarSoldado(Soldado soldado) {
		System.out.println(soldado);
	}

	public void editarSoldadoo(String cpf, SoldadoEditRequest soldadoEditRequest) {
		System.out.println(cpf + " - " + soldadoEditRequest);
	}

	public void excluirSoldado(String cpf) {
		System.out.println(cpf);
	}
}
