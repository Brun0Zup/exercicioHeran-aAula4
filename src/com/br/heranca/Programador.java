package com.br.heranca;

import java.util.ArrayList;
import java.util.List;

public class Programador extends Pessoa{

	private List<String> linguagensUsadas = new ArrayList<String>();
	private int anosDeExperiencia;
	private boolean gostaDeCafe;

	// Construtor

	public Programador(String nome, String sobrenome, int idade, List<String> linguagensUsadas, int anosDeExperiencia,
			Boolean gostaDeCafe) {
		super(nome, sobrenome, idade);

		this.linguagensUsadas = linguagensUsadas;
		this.anosDeExperiencia = anosDeExperiencia;
		this.gostaDeCafe = gostaDeCafe;

	}

	// Gets e Sets

	public List<String> getLinguagensUsadas() {
		return linguagensUsadas;
	}

	public void setLinguagensUsadas(List<String> linguagensUsadas) {
		this.linguagensUsadas = linguagensUsadas;
	}

	public int getAnosDeExperiencia() {
		return anosDeExperiencia;
	}

	public void setAnosDeExperiencia(int anosDeExperiencia) {
		this.anosDeExperiencia = anosDeExperiencia;
	}

	public boolean getGostaDeCafe() {
		return gostaDeCafe;
	}

	public void setGostaDeCafe(boolean gostaDeCafe) {
		this.gostaDeCafe = gostaDeCafe;
	}

	public String toString() {

		String modelo = "";

		modelo += "Nome -> " + super.getNome() + "\n";
		modelo += "Sobrenome -> " + super.getSobrenome() + "\n";
		modelo += "Idade -> " + super.getIdade() + "\n";
		modelo += "Linguagens Usadas -> " + this.getLinguagensUsadas() + "\n";
		modelo += "Anos de Experiência -> " + this.getAnosDeExperiencia() + "\n";
		modelo += "Gosta de café -> " + this.getGostaDeCafe() + "\n";

		return modelo;
	}

}
