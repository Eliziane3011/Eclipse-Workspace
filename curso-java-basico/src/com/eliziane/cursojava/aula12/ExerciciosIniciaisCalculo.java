package com.eliziane.cursojava.aula12;

import java.util.Scanner;

public class ExerciciosIniciaisCalculo {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in );
		
		System.out.println("Escreva um n�mero inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.println("Escreva um outro n�mero inteiro: ");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com mais um n�mero real: ");
		double num3 = scan.nextDouble();
		
		int resultado1 = (num1 * num2)* (num2 / 2);
		double resultado2 = ( num1 * 3) + num3;
		double resultado3 = Math.pow(num3, 3);
		
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
		System.out.println("Resultado 3: " + resultado3);
	}

}