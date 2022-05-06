package com.eliziane.cursojava.aula15;

import java.util.Scanner;

import javax.naming.ldap.ExtendedRequest;

public class ExecicioVogalConsosante {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira uma letra de A a Z: ");
		String letra = scan.next();

		/*
		 * if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
		 * letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
		 * letra.equalsIgnoreCase("u")) {
		 * System.out.println("Esta letra é uma VOGAL!!!"); } else {
		 * System.out.println("Esta letra é uma CONSOANTE!!!"); }
		 */

		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida!!!");
		} else {

			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("Esta letra é uma VOGAL!");
				break;
			default:
				System.out.println("Esta letra é uma CONSOANTE!");
				// inserir Maiusc e Minusc devido ao case sensitive
			}
		}

	}

}
