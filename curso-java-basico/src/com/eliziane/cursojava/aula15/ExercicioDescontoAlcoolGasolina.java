package com.eliziane.cursojava.aula15;

import java.beans.DefaultPersistenceDelegate;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ExercicioDescontoAlcoolGasolina {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-------CÁLCULO VALOR COMBUSTÍVEL-------");
		System.out.println("Insira a quantidade de litros vendidos: ");
		double litros = scan.nextDouble();
		
		System.out.println("Insira o tipo de combustível (A-ALCOOL/G-GASOLINA): ");
		String tipoString = scan.next();
		
		double precoGasolina = 2.5;
		double precoAlcool = 1.9;
		int perDesconto = 0;
		double totalDesc = 0;
		double total = 0;
		
		if(tipoString.equalsIgnoreCase("a")) {
			
			if (litros <= 20) {
				perDesconto = 3;
			} else {
				perDesconto = 5;
			} 
			
			total = litros * precoAlcool;
			
		} else if (tipoString.equalsIgnoreCase("g")) {
			
			if (litros <= 20) {
				perDesconto = 4;
			} else { 
				perDesconto = 6;
			}
			
			total = litros * precoGasolina;
		}
		totalDesc = (total / 100) * perDesconto;
		
		double precoAPagar = total - totalDesc;
		
		System.out.println("O valor a ser pago: " + precoAPagar);

	}

}
