package com.project.test.engsoftwaretest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.project.test.engsoftwaretest.company.Library;

import funcionalities.book.Book;
import funcionalities.student.Student;

public class ManagerClassLibraryTest {
	
	Book bookInstanceClass = null;
	Student studentInstanceClass = null;
	Library libraryInstanceClass = null;
	private String mensagemEsperada = "Sucesso";
	
	@Before
	public void setup() {
		
		this.libraryInstanceClass = new Library();
		
//		Mockito.mock(Library.class)
		
	}
	
	@Test
	public void processoParaSalvarLivroNaListaDeLivros() {
		
		String mensagemLivroSalvo = this.libraryInstanceClass.salvarLivro(bookInstanceClass);
		assertEquals("quando chamado o metodo salvar, o mesmo tem que retornar a mensagem sucesso", mensagemEsperada, mensagemLivroSalvo );
		
	}

	@Test
	public void processoParaEditarLivroDaListaDeLivros() {
		
		String mensagemLivroEditado = this.libraryInstanceClass.Editar(bookInstanceClass);
		assertEquals("quando solicitar a edicao do livro, o mesmo ten que retornar sucesso", mensagemEsperada, mensagemLivroEditado);
		
		
	}
	
}