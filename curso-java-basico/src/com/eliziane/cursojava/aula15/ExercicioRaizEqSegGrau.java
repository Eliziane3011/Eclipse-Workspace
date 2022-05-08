package com.eliziane.cursojava.aula15;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Scanner;

public class ExercicioRaizEqSegGrau {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor de A: ");
		int a = scan.nextInt();
		
		if ( a == 0) {
			System.out.println("Não é equação de segundo grau.");
		} else {
		
		System.out.println("Insira o valor de B: ");
		int b = scan.nextInt();
		
		System.out.println("Insira o valor de C: ");
		int c = scan.nextInt();
		
		double delta = (b*b) - (4 * a * c);
		
		if (delta < 0) {
			System.out.println("Delta Negativo");
		} else {
			
			System.out.println("Delta: " + delta);
			
			double x1 = ((-b) + Math.sqrt (delta)) /(2*a);
			double x2 = ((-b) - Math.sqrt (delta)) / (2*a);
			
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
			}
		}

	}

}
