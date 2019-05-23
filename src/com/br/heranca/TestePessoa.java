package com.br.heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestePessoa {

	public static void main(String[] args) {

		List<String> linguagensUsadas = new ArrayList<String>();

		linguagensUsadas.add("phyton");
		linguagensUsadas.add("Java");

		Programador programador = new Programador("Bruno", "Augusto", 18, linguagensUsadas, 4, true);
		System.out.println(programador);

		List<String> filmesParticipados = new ArrayList<String>();
		filmesParticipados.add("Um maluco no pedaço");
		filmesParticipados.add("Karate Kid");
		filmesParticipados.add("Karate");

		Random aleatorio = new Random();

		String resultado = filmesParticipados.get(aleatorio.nextInt(filmesParticipados.size()));
		Ator ator = new Ator("Wiil ", "Smith", 48, filmesParticipados, false, 1971, resultado);
		System.out.println(ator);
	}

}
