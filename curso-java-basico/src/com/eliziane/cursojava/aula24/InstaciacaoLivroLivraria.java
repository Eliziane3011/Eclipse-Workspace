package com.eliziane.cursojava.aula24;

public class InstaciacaoLivroLivraria {

	public static void main(String[] args) {
		
		LivroLivraria livro = new LivroLivraria();
		
		livro.titulo = "Os crimes ABC";
		livro.autor = "Agatha Christie";
		livro.edicao = "1ª";
		livro.editora = "HarperCollins";
		livro.genero = "Romance Policial";
		livro.idioma = "Português";
		livro.numeroPaginas = 240;
		livro.preco = 29.61;
		livro.dataPublicacao = "16 novembro de 2020";

	}

}
