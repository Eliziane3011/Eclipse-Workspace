package com.eliziane.cursojava.aula12;

import java.util.Scanner;

public class ExerciciosIniciais03 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva um número: ");
		int num01 = scan.nextInt();
		System.out.println("Escreva outro número: ");
		int num02 = scan.nextInt();
		int soma = (num01 + num02);
		
		System.out.println("A soma desses números é: " + soma);

	}

}
