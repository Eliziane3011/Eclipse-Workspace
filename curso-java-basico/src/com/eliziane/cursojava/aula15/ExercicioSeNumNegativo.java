package com.eliziane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioSeNumNegativo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um n�mero real(positivo ou negativo): ");
		int num01 = scan.nextInt();

		if (num01 >= 0) {
			System.out.println("O valor do n�mero digitado � positivo!!!");
		} else {
			System.out.println("O valor do n�mero digitado � negativo!!!");
		}

	}

}
