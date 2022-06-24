package com.eliziane.cursojava.aula24;

public class InstanciacaoContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.agencia = "0400";
		conta.banco = "Caixa Econômica Federal";
		conta.especial = true;
		conta.limiteDisp = 7.500;
		conta.numeroContaCorrente = "3238-6";
		conta.saldo = 2.567;
		
		System.out.println("Conta Número:" + conta.numeroContaCorrente + " - Saldo = " + conta.saldo);
		
	}

}
