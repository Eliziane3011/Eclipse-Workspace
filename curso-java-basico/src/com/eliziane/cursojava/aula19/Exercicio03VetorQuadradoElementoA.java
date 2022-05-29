package com.eliziane.cursojava.aula19;
/* Loiane.training
 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B
 * de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
 * ser a raiz quadrada do respectivo elemento de A, ou seja: B[i] = A[i]*A[i].
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03VetorQuadradoElementoA {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[15]; // número de posições/elementos
		double[] vetorB = new double[vetorA.length]; //precisa ser double devido ao Math.sqrt

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = scan.nextInt();

			vetorB[i] = Math.sqrt(vetorA[i]);
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.###");

		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
		}
		System.out.println();

	}

}
