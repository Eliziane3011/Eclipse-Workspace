package com.eliziane.cursojava.aula15;

import java.util.Scanner;

public class ExecicioParOuImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Este n�mero � par!");
		} else {
			System.out.println("Este n�mero � �mpar!");
		}
		
		

	}

}
