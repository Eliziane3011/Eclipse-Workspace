package com.eliziane.cursojava.aula19;

/* Exemplo Vetores Arrays Aula Loiane:
 * estrutura de dados mais simples existente na maioria das linguagens
 * de programa��o. Lista ordenada de dados.
 * Ex: armazenar a temperatura m�dia di�ria por um ano:
 * SOLU��O: utilizar os arrays para armazenar lista de dados.
 * As posi��es s�o indicadas pelo index e come�a em [0].
 */

public class Arrays {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 313.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		
		//boa pr�tica, declarar o tipo da vari�vel e j� colocar []
		double[] temperaturas = new double[365]; //indicar n�mero de posi��es
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 1 �: " + temperaturas[0]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		System.out.println("Valores do array: " + temperaturas); //aponta para o endere�o de mem�ria
		
		for (int i=0; i<temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " �: " + temperaturas[i]);
		}
		
		for (double temp : temperaturas) { 
			System.out.println(temp);
		}

	}

}
