package com.eliziane.cursojava.aula24;

/*Instancia��o classe l�mpada, criar objeto
 * 
 */

public class Exercicio01InstanciacaoLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.aparenciaCor = "Amarela";
		lampada.tempCor = 100;
		
		lampada.tipos = new String[5]; //n�o esquecer de instanciar o array.
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampe�es";
		

	}

}
