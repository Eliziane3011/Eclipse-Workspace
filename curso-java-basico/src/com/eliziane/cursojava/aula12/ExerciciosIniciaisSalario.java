package com.eliziane.cursojava.aula12;

import java.util.Scanner;

public class ExerciciosIniciaisSalario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva o valor da sua hora de trabalho: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Escreva a quantidade de horas trabalhadas no m�s: ");
		double horas = scan.nextDouble();
		
		double salario = valorHora * horas;
		
		System.out.println("O seu sal�rio ser� de: " + salario);
	}

}
