package com.eliziane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioPrecoMaisBarato {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o pre�o do primeiro produto: ");
		double preco1 = scan.nextDouble();

		System.out.println("Insira o pre�o do segundo produto: ");
		double preco2 = scan.nextDouble();

		System.out.println("Insira o pre�o do terceiro produto: ");
		double preco3 = scan.nextDouble();

		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Compre o primeiro produto, este � o mais barato!!");
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("Compre o segundo produto, este � o mais barato!!");
		} else if (preco3 <= preco2 && preco3 <= preco2) {
			System.out.println("Compre o terceiro produto, este � o mais barato!!");
		}
	}

}
