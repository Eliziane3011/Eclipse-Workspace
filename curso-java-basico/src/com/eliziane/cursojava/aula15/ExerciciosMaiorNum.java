package com.eliziane.cursojava.aula15;

import java.util.Scanner;

public class ExerciciosMaiorNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num01 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int num02 = scan.nextInt();
		
		if (num01 > num02) {
			System.out.println("O maior n�mero digitado � o primeiro: " + num01);
		} else {
			System.out.println("O maior n�mero digitado � o segundo: " + num02);
		}
		

	}

}
