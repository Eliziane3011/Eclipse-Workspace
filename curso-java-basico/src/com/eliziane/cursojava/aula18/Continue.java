package com.eliziane.cursojava.aula18;

/* Exemplo Continue Aula Loiane:
 * complementa o break;
 * continue o break na próxima iteração.
 */

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		int num = scan.nextInt();

		System.out.println("Insira um limite: ");
		int max = scan.nextInt();

		for (int i = num; i <= max; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i é: " + i);
		}

	}

}

