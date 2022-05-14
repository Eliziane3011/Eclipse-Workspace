package com.eliziane.cursojava.aula17;

import java.util.Scanner;

public class ExercicioNotaInvalida {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
		
			System.out.println("Insira uma nota: ");
			
			double nota = scan.nextDouble();
		
			if (nota >= 0 && nota <=10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			} else {
				//notaValida = false;
				System.out.println("Nota inválida, digite novamente!");
			}
		} while (!notaValida);

	}

}
