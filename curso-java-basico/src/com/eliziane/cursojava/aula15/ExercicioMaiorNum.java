package com.eliziane.cursojava.aula15;

import java.util.Scanner;

import javax.management.Query;

public class ExercicioMaiorNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o primeiro n�mero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Insira o segudo n�mero: ");
		int num2 = scan.nextInt();
		
		System.out.println("Insira o terceiro n�mero: ");
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O primeiro n�mero � o Maior: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("O n�mero 2 � o Maior: " + num2);
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("O n�mero 3 � o Maior: " + num3);
		}
		
	}

}
