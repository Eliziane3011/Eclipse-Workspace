package com.eliziane.cursojava.aula12;

import java.util.Scanner;

public class ExerciciosIniciaisMetrosParaCentrimetros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva uma dist�ncia em metros: ");
		double metros = scan.nextDouble();
		double conversao = metros * 100;
		
		System.out.println("O valor dessa dist�ncia em cent�metros �: " + conversao + " cm");
		

	}

}
