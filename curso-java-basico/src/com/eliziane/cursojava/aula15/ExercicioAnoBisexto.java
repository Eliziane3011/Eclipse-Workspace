package com.eliziane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioAnoBisexto {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o ano: ");
		int ano = scan.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("O ano é bissexto!");
		} else {
			System.out.println("O ano não é bissexto!");
			
		}

	}

}
