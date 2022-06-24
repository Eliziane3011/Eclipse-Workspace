package com.eliziane.cursojava.aula24;

import java.util.Date;

public class LivroBibliotecaInstanciacao {

	public static void main(String[] args) {
		
		LivroBiblioteca livro = new LivroBiblioteca();
		
		livro.titulo = "Os crimes ABC";
		livro.autor = "Agatha Christie";
		livro.edicao = "1ª";
		livro.editora = "HarperCollins";
		livro.genero = "Romance Policial";
		livro.idioma = "Português";
		livro.numeroPaginas = 240;
		livro.dataPublicacao = "16 novembro de 2020";
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.nomeAlunoQueEmprestou = "Eliziane";
		
		System.out.println("Nome do livro: " + livro.titulo);
		System.out.println("Autor do Livro: " + livro.autor);
		System.out.println("Edição do Livro: " + livro.edicao);
		System.out.println("Editora: " + livro.editora);
		System.out.println("Gênero do Livro: " + livro.genero);
		System.out.println("Idioma: " + livro.idioma);
		System.out.println("Número de páginas: " + livro.numeroPaginas);
		System.out.println("Data de Publicação do Livro: " + livro.dataPublicacao);
		System.out.println("Nome do Aluno que emprestou: " + livro.nomeAlunoQueEmprestou);
		System.out.println("Data de entrega: " + livro.dataEntrega);
		System.out.println("Livro emprestado: " + livro.emprestado);

	}

}
