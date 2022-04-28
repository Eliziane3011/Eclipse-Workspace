package com.eliziane.cursojava.aula12;

import java.util.Scanner;

public class ExerciciosIniciaisCelsiusParaF {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in );
			
			System.out.println("Escreva a temperatura em Farenheit: ");
			double c = scan.nextDouble();
			
			double f = (c * 1.8) + 32 ;
			
			System.out.println("A temperatura " + c + "C é igual a " + f + "F");

	}

}
