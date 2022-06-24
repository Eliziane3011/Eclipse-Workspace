package com.eliziane.cursojava.aula24;

public class InstanciacaoContatoTelefone {

	public static void main(String[] args) {
		
		ContatoAgenda contato = new ContatoAgenda();
		
		contato.nomeContato = "Kaio Candido Santiago";
		contato.email = "kaio.santiago.123@gmail.com";
		contato.endereco = "Rua das Flores, 123 - Curitiba - PR";
		
		contato.telefones = new String[5];
		contato.telefones[0] = "CASA: 42-3220-1020";
		contato.telefones[1] = "CELULAR: 42-99999-0000";
	}

}
