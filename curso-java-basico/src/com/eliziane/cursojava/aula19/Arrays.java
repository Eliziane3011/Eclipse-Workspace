package com.eliziane.cursojava.aula19;

/* Exemplo Vetores Arrays Aula Loiane:
 * estrutura de dados mais simples existente na maioria das linguagens
 * de programação. Lista ordenada de dados.
 * Ex: armazenar a temperatura média diária por um ano:
 * SOLUÇÃO: utilizar os arrays para armazenar lista de dados.
 * As posições são indicadas pelo index e começa em [0].
 */

public class Arrays {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 313.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		
		//boa prática, declarar o tipo da variável e já colocar []
		double[] temperaturas = new double[365]; //indicar número de posições
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		System.out.println("Valores do array: " + temperaturas); //aponta para o endereço de memória
		
		for (int i=0; i<temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
		}
		
		for (double temp : temperaturas) { 
			System.out.println(temp);
		}

	}

}
