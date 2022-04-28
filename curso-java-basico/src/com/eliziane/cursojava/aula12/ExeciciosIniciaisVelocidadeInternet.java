package com.eliziane.cursojava.aula12;

import java.util.Scanner;

public class ExeciciosIniciaisVelocidadeInternet {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o tamanho do arquivo: ");
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Insira a velocidade da internet: ");
		double velInternet = scan.nextDouble();
		
		double temDownload = tamArquivo / velInternet;
		
		System.out.println("Tempo de Download: " + temDownload);
		

	}

}
