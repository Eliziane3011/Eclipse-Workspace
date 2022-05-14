package com.eliziane.cursojava.aula17;

public class ExercicioPopulacaoCidade {

	public static void main(String[] args) {
		
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		System.out.println("Atualmente a população A tem 80.000 habitantes e a B 200.000 habitantes.");
		
		while (popA < popB) {
			
			// o de cima equivale ao de baixo += e substitui a repetição de popB
			popA = popA + (popA/100) * 3;
			popB += (popB/100) * 1.5;
			cont++;
		}
		
		System.out.println("Em " + cont + " anos a população A ultrapassará a população B, com os seguintes números:");
		System.out.println("A população A: " + popA + " habitantes.");
		System.out.println("A população B: " + popB + " habitantes.");
		
	}

}
