package com.eliziane.cursojava.aula17;

import java.util.Scanner;

public class ExercicioValidarInfos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoValida = false;
		String nome;
		int idade;
		double salario;
		String sexo, estadoCivil;

		do {

			System.out.println("Insira o nome: ");

			nome = scan.next();
			// string é classe e tem o método length que possibilita
			// contar a quantidade de caracteres, neste caso maior que 3
			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa no mínimo 3 caracteres.");
			}
		} while (!infoValida);

		infoValida = false;
		do {

			System.out.println("Insira a idade: ");

			idade = scan.nextInt();

			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa estar entre 0 e 150!");
			}
		} while (!infoValida);

		infoValida = false;
		do {

			System.out.println("Insira o salário: ");

			salario = scan.nextDouble();

			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("O salario precisa ser maior que zero!");
			}
		} while (!infoValida);

		infoValida = false;
		do {

			System.out.println("Insira o sexo/gênero: ");

			sexo = scan.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("O sexo precisa ser 'f' ou 'm'!");
			}
		} while (!infoValida);

		infoValida = false;
		do {

			System.out.println("Insira o seu estado civil: ");

			estadoCivil = scan.next();

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("O estado civil pode ser s-solteiro, c-casado, v-viúvo e d-divorciado!");
			}
		} while (!infoValida);
		
		System.out.println("As seguintes informações foram coletadas: ");
		System.out.println("Nome: "+ nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + idade);
		System.out.println("Estado Civil: " + estadoCivil);
		System.out.println("Salário: " + salario);

	}

}
