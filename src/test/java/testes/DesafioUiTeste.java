package testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import metodos.Metodos;
import runner.Executa;

public class DesafioUiTeste {

	
	Metodos metodo = new Metodos();
	
	
	@BeforeEach
	public void setUp() {
		Executa.iniciarTeste();
	}
	
	
	@Test
	public void validarUrlTest() {
		metodo.validarUrl("https://desafio.ui.e2etreinamentos.com.br/");
	}

}
