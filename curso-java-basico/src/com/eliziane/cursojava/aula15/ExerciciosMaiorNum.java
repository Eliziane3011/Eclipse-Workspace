package com.eliziane.cursojava.aula15;

import java.util.Scanner;

public class ExerciciosMaiorNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num01 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num02 = scan.nextInt();
		
		if (num01 > num02) {
			System.out.println("O maior número digitado é o primeiro: " + num01);
		} else {
			System.out.println("O maior número digitado é o segundo: " + num02);
		}
		

	}

}
