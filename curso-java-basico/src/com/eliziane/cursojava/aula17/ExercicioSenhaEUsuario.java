package com.eliziane.cursojava.aula17;

import java.util.Scanner;

public class ExercicioSenhaEUsuario {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoValidas = false;
		String nomeUser;
		String senha;
		//declarar fora dos loops e dentro do loop s� faz o uso delas.

		do {

			System.out.println("Entre com o nome do usu�rio: ");
			nomeUser = scan.next();

			System.out.println("Entre com a senha: ");
			senha = scan.next();

			if (nomeUser.equalsIgnoreCase(senha)) {
				// infoValidas = false;
				System.out.println("Senha � igual ao usu�rio, digite novamente!");
			} else {
				infoValidas = true;
				System.out.println("Senha e usu�rios v�lidos!");
			} // nega��o de true � false, a� n�o executa mais
		} while (!infoValidas);
	}
}
