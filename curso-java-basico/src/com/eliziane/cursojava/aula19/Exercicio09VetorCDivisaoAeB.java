package com.eliziane.cursojava.aula19;

import java.text.DecimalFormat;

/*Loiane.training
 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C
 * onde cada elemento de C � a divis�o dos respectivos elementos em A e B, 
 * ou seja: C[i] = A[i] / floatB[i].
 */

import java.util.Scanner;

public class Exercicio09VetorCDivisaoAeB {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10]; // n�mero de posi��es
		int[] vetorB = new int[vetorA.length];
		double[] vetorC = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do Vetor A da posi��o: " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com o valor do Vetor B da posi��o: " + i);
			vetorB[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] / vetorB[i]; //em divis�es buscar utilizar float
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
		
		DecimalFormat df = new DecimalFormat("###,###.###");

		System.out.print("Vetor C = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();

	}

}
