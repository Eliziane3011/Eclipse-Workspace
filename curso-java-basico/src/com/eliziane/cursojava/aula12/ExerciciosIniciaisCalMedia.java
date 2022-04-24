package com.eliziane.cursojava.aula12;

import java.util.Scanner;

public class ExerciciosIniciaisCalMedia {

	public static void main(String[] args) {
		
      Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva a nota do primeiro bimestre: ");
		double nota1 = scan.nextDouble();
		System.out.println("Escreva a nota do segundo bimestre: ");
		double nota2 = scan.nextDouble();
		System.out.println("Escreva a nota do terceito bimestre: ");
		double nota3 = scan.nextDouble();
		System.out.println("Escreva a nota do quarto bimestre: ");
		double nota4 = scan.nextDouble();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A média das notas é: " + media);
	}

}
