package com.eliziane.cursojava.aula12;

import java.util.Scanner;

public class ExerciciosIniciaisAreaQuadrado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Escreva o tamanho do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		// lado = lado * lado
		double area = Math.pow(lado, 2);
		
		System.out.println("A area do quadrado é: " + area);
		System.out.println("O dobro da área do quadrado é: " + ( area * 2));
	}

}
