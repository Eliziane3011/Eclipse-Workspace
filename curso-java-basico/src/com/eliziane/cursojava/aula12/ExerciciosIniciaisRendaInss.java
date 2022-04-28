package com.eliziane.cursojava.aula12;

import java.util.Scanner;

public class ExerciciosIniciaisRendaInss {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escreva o valor da sua hora de trabalho: ");
		double valorHora = scan.nextDouble();

		System.out.println("Escreva a quantidade de horas trabalhadas no mês: ");
		double horas = scan.nextDouble();

		double salarioBruto = valorHora * horas;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double ir = salarioBruto * 0.11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("O seu salário será de: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Imposto de Renda: " + ir);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salário Liquido: " + salarioLiquido);
		
		

	}

}
