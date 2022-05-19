package com.eliziane.cursojava.aula19;
/*Criar um vetor A com 5 elementos inteiros.
 * Construir um vetor B de mesmo tipo e tamanho com os "mesmos" elementos
 * do vetor A, ou seja, B[i] = A[i].
 */

import java.util.Scanner;

public class Exercicio01VetorElementos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i];
		}
		
		/*for (int i=0; i<vetorA.length; i++) {
			vetorB[i] = vetorA[i];
			
		}*/
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
	}
}
