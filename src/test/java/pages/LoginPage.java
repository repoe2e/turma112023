package pages;

import org.openqa.selenium.By;

import elementos.ElementosBankE2E;
import metodos.Metodos;

public class LoginPage {
	
	Metodos metodo = new Metodos();
	ElementosBankE2E el = new ElementosBankE2E();
	
	private By nomePaginaLogado = By.xpath("");
	
	/**
	 * Realizar o login da conta informando os dados de acesso
	 * @param username
	 * @param senha
	 */
	public void preencherDadosLogin(String username, String senha) {
		metodo.escrever(el.usuario, username);
		metodo.escrever(el.senha, senha);
		metodo.clicar(el.btnContinuar);
		metodo.validarUrl("");
		metodo.validarTexto(nomePaginaLogado,"Anderson");
	}

}
