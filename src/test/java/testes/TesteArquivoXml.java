package testes;

import org.junit.jupiter.api.Test;

import utils.GerenciadorDeArquivos;

public class TesteArquivoXml {

	GerenciadorDeArquivos gerenciador = new GerenciadorDeArquivos();

	@Test
	public void mostrarArquivoxml() {
		System.out.println(gerenciador.lerArquivoXML("arquivoxml.xml").contains("Anderson"));
		System.out.println(gerenciador.lerArquivoXML("arquivoxml.xml"));
	}

}
