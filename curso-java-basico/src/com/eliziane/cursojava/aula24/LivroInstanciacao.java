package com.eliziane.cursojava.aula24;

public class LivroInstanciacao {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.titulo = "Os crimes ABC";
		livro.autor = "Agatha Christie";
		livro.edicao = "1�";
		livro.editora = "HarperCollins";
		livro.genero = "Romance Policial";
		livro.idioma = "Portugu�s";
		livro.numeroPaginas = 240;
		livro.dataPublicacao = "16 novembro de 2020";
		
		System.out.println("Nome do livro: " + livro.titulo);
		System.out.println("Autor do Livro: " + livro.autor);
		System.out.println("Edi��o do Livro: " + livro.edicao);
		System.out.println("Editora: " + livro.editora);
		System.out.println("G�nero do Livro: " + livro.genero);
		System.out.println("Idioma: " + livro.idioma);
		System.out.println("N�mero de p�ginas: " + livro.numeroPaginas);
		System.out.println("Data de Publica��o do Livro: " + livro.dataPublicacao);

	}

}
