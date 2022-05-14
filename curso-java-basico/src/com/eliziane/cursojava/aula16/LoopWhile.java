package com.eliziane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {

		int i = 1; // count ou cont
		int max = 10;

		System.out.println("Contando até " + max);

		// while = enquanto, primeiro avalia a expressão, se ela for
		// verdadeira executa o código
		while (i <= max) {
			System.out.println("Valor de i: " + i);
			i++; // i = i + 1; ou i += 1;

		}

		System.out.println(i); // valor de 11
		
		// do while: faça enquanto, ele primeiro executa e depois avalia a
		//expressão

		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 11);

		System.out.println(i);

	}
}
