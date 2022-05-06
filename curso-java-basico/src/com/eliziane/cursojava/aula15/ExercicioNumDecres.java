package com.eliziane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioNumDecres {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o primeiro número: ");
		int num1 = scan.nextInt();

		System.out.println("Insira o segudo número: ");
		int num2 = scan.nextInt();

		System.out.println("Insira o terceiro número: ");
		int num3 = scan.nextInt();
		
		System.out.println("A ordem decrescente deste números será: ");

		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			// num1 é menor
			// num3 é maior
			// num1 < num2 < num3
			System.out.println(num3 + " - " + num2 + " - " + num1);

		} else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
			// num1 é menor
			// num2 é maior
			// num1 < num3 < num2
			System.out.println(num3 + " - " + num3 + " - " + num1);

		} else if (num2 <= num1 && num2 <= num3 && num1 <= num2) {
			// num2 menor
			// num3 é maior
			// num2 < num1 < num3
			System.out.println(num3 + " - " + num1 + " - " + num2);

		} else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			// num3 é o menor
			// num2 é o maior
			// num3 < num1 < num2
			System.out.println(num2 + " - " + num1 + " - " + num3);

		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
			// num3 é o menor
			// num1 é o maior
			// num3 < num2 < num1
			System.out.println(num1 + " - " + num2 + " - " + num3);
		}
	}

}
