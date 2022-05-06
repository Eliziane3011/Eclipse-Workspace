package com.eliziane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioDescontoSalario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CÁLCULO DESCONTO DE SALÁRIO");
		System.out.println("Insira o valor/hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Insira as horas trabalhadas no mês: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		
		int percentualIR = 0;
		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 5;
		} else if (salarioBruto > 2500) {
			percentualIR = 20;
		}
		
		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("SALÁRIO BRUTO: (" + valorHora + " * " + horasTrabalhadas + "): " + salarioBruto );
		System.out.println("(-) IR (" + percentualIR + " %): " + ir );
		System.out.println("(-) INSS (10%): " + inss);
		System.out.println("FGTS (11%): " + fgts);
		System.out.println("TOTAL DE DESCONTOS: " + totalDescontos);
		System.out.println("SALÁRIO LÍQUIDO: " + salarioLiquido);
		
	}

}
