package br.com.digitalinnovation.one.dto;

public class Soldado {

	@Override
	public String toString() {
		return "Soldado [cpf=" + cpf + ", nome=" + nome + ", raca=" + raca + ", arma=" + arma + "]";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	private String cpf;
	private String nome;
	private String raca;
	private String arma;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

}
