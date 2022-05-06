package com.eliziane.cursojava.aula15;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class ExercicioMascFem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o seu sexo (M/F): ");
		String sexo = scan.next();
		//OBS: lembrar que para Strin não se utiliza no if o ==
		//quando houver comparação utilizar o equal ou equalIgnoreCase: ignora o casesensitive F ou f

		if (sexo.equalsIgnoreCase("m")) {
			System.out.println("M - MASCULINO");
		} else if (sexo.equalsIgnoreCase("f")) {
			System.out.println("F - FEMININO");
		} else {
			System.out.println("SEXO INVÁLIDO");		
		}

	}

}
