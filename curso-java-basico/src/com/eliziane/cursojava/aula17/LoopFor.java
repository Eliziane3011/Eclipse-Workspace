package com.eliziane.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {

		// for (inicialização; condição; atualização) i++ incremento
		// a variável criada (no caso i) dentro do bloco só vale dentro do bloco
		for (int i = 1; i < 5; i++) {
			System.out.println("i tem valor: " + i);

		}
		// i-- decremento
		for (int i = 5; i > 0; i--) {
			System.out.println("i tem valor: " + i);
		}
		// for com mais de uma variável, separadas por vírgula
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + " ; j = " + j);
		}
		// partes ausentes
		int count = 0;
		for (; count < 5;) {
			System.out.println("Valor de count: " + count);
			count += 2;
		}
		// equivale ao for com partes ausentes, mesmo resultado
		for (int cont = 0; cont < 10; cont += 2) {
			System.out.println("Valor de cont: " + cont);
		}
		// loop sem corpo, mais utilizado quando se quer somar valores
		int soma = 0;
		for (int i = 1; i < 5; soma += i++)
			;
		System.out.println("O valor da soma é: " + soma);
		
		// boa prática de programação: sempre utilizar as chaves {} para separar os blocos

		for (int i = 0; i < 5; i++) {
			System.out.println("i tem valor: " + i);
			System.out.println("i tem valor: ");
			
		}

	}

}
