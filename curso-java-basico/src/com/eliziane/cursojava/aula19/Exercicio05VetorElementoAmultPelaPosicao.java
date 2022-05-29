package com.eliziane.cursojava.aula19;
/*Loiane.training
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho
 * sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por
 * sua posição (ou índice), ou seja: B[i] = A[i]*i.
 */

import java.util.Scanner;

public class Exercicio05VetorElementoAmultPelaPosicao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10]; // número de posições
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = scan.nextInt();

			vetorB[i] = vetorA[i] * i; //i identifica a posição do vetor 
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
	}

}
