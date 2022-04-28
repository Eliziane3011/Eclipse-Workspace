package com.eliziane.cursojava.aula12;

import java.util.Scanner;

public class ExerciciosIniciaisFParaCelsius {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in );
		
		System.out.println("Escreva a temperatura em Farenheit: ");
		double f = scan.nextDouble();
		
		double c = ( 5 * ( f - 32) / 9);
		
		System.out.println("A temperatura " + f + " F é igual a " + c + " C");
	}

}
