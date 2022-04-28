package com.eliziane.cursojava.aula12;

import java.util.Scanner;

public class ExerciciosIniciaisRaioCirculo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva o raio do círculo:");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2); 
		
		System.out.println("A área do círculo é: " + area);

	}

}
