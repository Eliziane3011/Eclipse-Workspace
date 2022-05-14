package com.eliziane.cursojava.aula17;

import java.util.Scanner;

public class ExercicioInformarPopulacao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean valido = false;

		double popA;
		double popB;
		double taxaA;
		double taxaB;

		do {

			System.out.println("Insira a população da cidade A: ");
			popA = scan.nextDouble();

			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("A população A precisa ser maior que 0 (zero).");
			}

		} while (!valido);

		valido = false;
		do {

			System.out.println("Insira a população da cidade B: ");
			popB = scan.nextDouble();

			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("A população B precisa ser maior que 0 (zero).");
			}

		} while (!valido);

		valido = false;
		do {

			System.out.println("Insira a taxa de crescimento da população da cidade A: ");
			taxaA = scan.nextDouble();

			if (taxaA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento da população da cidade A precisa ser maior que 0 (zero).");
			}

		} while (!valido);

		valido = false;
		do {

			System.out.println("Insira a taxa de crescimento da população da cidade B: ");
			taxaB = scan.nextDouble();

			if (taxaB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento da população da cidade B precisa ser maior que 0 (zero).");
			}

		} while (!valido);

		int cont = 0;

		while (popA < popB) {

			// o de cima equivale ao de baixo += e substitui a repetição de popB
			popA = popA + (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}

		System.out.println("Em " + cont
				+ " anos a população da cidade A ultrapassará a população da cidade B, com os seguintes números:");
		System.out.println("A população A: " + popA + " habitantes.");
		System.out.println("A população B: " + popB + " habitantes.");
	}
}
