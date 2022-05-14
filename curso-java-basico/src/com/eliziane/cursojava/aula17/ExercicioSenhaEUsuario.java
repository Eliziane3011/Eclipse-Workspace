package com.eliziane.cursojava.aula17;

import java.util.Scanner;

public class ExercicioSenhaEUsuario {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoValidas = false;
		String nomeUser;
		String senha;
		//declarar fora dos loops e dentro do loop só faz o uso delas.

		do {

			System.out.println("Entre com o nome do usuário: ");
			nomeUser = scan.next();

			System.out.println("Entre com a senha: ");
			senha = scan.next();

			if (nomeUser.equalsIgnoreCase(senha)) {
				// infoValidas = false;
				System.out.println("Senha é igual ao usuário, digite novamente!");
			} else {
				infoValidas = true;
				System.out.println("Senha e usuários válidos!");
			} // negação de true é false, aí não executa mais
		} while (!infoValidas);
	}
}
