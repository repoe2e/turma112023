package testes;

import org.junit.jupiter.api.Test;

import utils.GerenciadorDeArquivos;

public class TesteArquivoJson {

	GerenciadorDeArquivos gerenciador = new GerenciadorDeArquivos();

	@Test
	public void mostrarArquivojson() {
		System.out.println(gerenciador.lerArquivoJson("arquivojson.json").contains("Anderson"));
		System.out.println(gerenciador.lerArquivoJson("arquivojson.json"));
	}

}
