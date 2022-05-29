package com.eliziane.cursojava.aula19;
/*Loiane.training
 * Criar um vetor A com 15 elemnetos inteiros. Construir um vetor B de 
 * mesmo tamanho, sendo que cada elemento do vetor B deverá ser o quadrado
 * do respectivo elemento A, ou seja: B[i] = sqrt(A[i]).
 */

import java.util.Scanner;

public class Exercicio04VetorRaizQuadElementoA {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15]; // número de posições/elementos
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = scan.nextInt();

			vetorB[i] = vetorA[i] * vetorA[i];
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
