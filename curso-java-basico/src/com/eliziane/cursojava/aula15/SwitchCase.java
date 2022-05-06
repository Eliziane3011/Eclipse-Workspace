package com.eliziane.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um número de 1 a 7 que será equivalente aos dias da Semana: ");

		int diaSemana = scan.nextInt();

		//O resulta em if-else sempre será um booleano (True ou False)
		/*if (diaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda");
		} else if (diaSemana == 3) {
			System.out.println("Terça");
		} else if (diaSemana == 4) {
			System.out.println("Quarta");
		} else if (diaSemana == 5) {
			System.out.println("Quinta");
		} else if (diaSemana == 6) {
			System.out.println("Sexta");
		} else if (diaSemana == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Não é um dia da semana válido!!!");
		}*/
		
		//Duas formas de se utilizar o Switch-Case
		/*switch(diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Terça"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("Sábado"); break;
		default: System.out.println("Não é um dia da semana válido!!!"); break;
		}*/
		
		switch(diaSemana) {
		case 2:  
		case 3: 
		case 4:  
		case 5: 
		case 6: System.out.println("Dia útil"); break;
		case 1: 
		case 7: System.out.println("Fim de Semana"); break;
		default: System.out.println("Não é um dia da semana válido!!!"); break;
		}

	}

}
