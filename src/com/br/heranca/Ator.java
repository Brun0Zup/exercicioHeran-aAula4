package com.br.heranca;

import java.util.ArrayList;
import java.util.List;

public class Ator extends Pessoa {

	List<String> filmesParticipados = new ArrayList<String>();
	private Boolean temOscar;
	private int anoNascimento;
	private String melhorFilme;

	// Construtor

	public Ator(String nome, String sobrenome, int idade, List<String> filmesParticipados, Boolean temOscar,
			int anoNascimento, String melhorFilme) {
		super(nome, sobrenome, idade);
		this.filmesParticipados = filmesParticipados;
		this.temOscar = temOscar;
		this.anoNascimento = anoNascimento;
		this.melhorFilme = melhorFilme;
	}

	// Gets e Sets

	public List<String> getFilmesParticipados() {
		return filmesParticipados;
	}

	public void setFilmesParticipados(List<String> filmesParticipados) {
		this.filmesParticipados = filmesParticipados;
	}

	public Boolean getTemOscar() {
		return temOscar;
	}

	public void setTemOscar(Boolean temOscar) {
		this.temOscar = temOscar;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getMelhorFilme() {
		return melhorFilme;
	}

	public void setMelhorFilme(String melhorFilme) {
		this.melhorFilme = melhorFilme;
	}

	public String toString() {

		String modelo = "";

		modelo += "Nome -> " + super.getNome() + "\n";
		modelo += "Sobrenome -> " + super.getSobrenome() + "\n";
		modelo += "Idade -> " + super.getIdade() + "\n";
		modelo += "Filmes participados -> " + this.getFilmesParticipados() + "\n";
		modelo += "Possue Oscar -> " + this.getTemOscar() + "\n";
		modelo += "Gosta de café -> " + this.getAnoNascimento() + "\n";
		modelo += "Melhor filme -> " + this.getMelhorFilme() + "\n";

		return modelo;
	}

}
