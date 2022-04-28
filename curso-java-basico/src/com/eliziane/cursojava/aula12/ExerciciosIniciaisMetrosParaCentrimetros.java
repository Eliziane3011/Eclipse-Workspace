package com.eliziane.cursojava.aula12;

import java.util.Scanner;

public class ExerciciosIniciaisMetrosParaCentrimetros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva uma distância em metros: ");
		double metros = scan.nextDouble();
		double conversao = metros * 100;
		
		System.out.println("O valor dessa distância em centímetros é: " + conversao + " cm");
		

	}

}
