package com.eliziane.cursojava.aula21;

/*programa que cria array e seta números aleatórios (random)
 * de 0 a 10
 */

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] notas = new int[10]; // quantidade de números que irá aparecer do sorteio

		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {

			notas[i] = random.nextInt(10); // até qual número "randomizar"
		}

		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println(nota);
		}

		System.out.println("Usando o FOR EACH!!");
		for (int nota : notas) { // boa prática: nome da entidade no singular e o nome do array fica no plural
			System.out.println(nota);
		}
		
		//Exemplo 02:
		System.out.println("Exemplos com arrays multidimensionais");
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10 ;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		for (double[] notasAluno : notasAlunos) {
			for (double nota : notasAluno) {
				System.out.println(nota + " ");
			}
			System.out.println();
		}
		
	}

}
