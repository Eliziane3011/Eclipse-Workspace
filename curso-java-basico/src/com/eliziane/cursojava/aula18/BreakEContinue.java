package com.eliziane.cursojava.aula18;

/*Exemplo aula Loiane: 
 * Break para sair de um for
 */

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um número: ");
		int num = scan.nextInt();

		System.out.println("Insira um limite: ");
		int max = scan.nextInt();

		for (int i = num; i <= max; i++) {
			System.out.println(i);
			if (i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break;
			}
		}

	}

}
