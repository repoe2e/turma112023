package testes;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import elementos.ElementosSauceDemo;
import metodos.Metodos;
import runner.Executa;
import utils.ExtentReports;

public class LoginComRelatorioDeTeste {

	Metodos metodo = new Metodos();
	ElementosSauceDemo el = new ElementosSauceDemo() ;

	@BeforeAll
	public  static void setup() {
		ExtentReports.setupReport();
		
	}
	
	@BeforeEach
	public    void iniciarTeste() {
		Executa.iniciarTeste();
	}

	@AfterAll
	public static void tearDown() {
		ExtentReports.tearDownReport();
	}

	
	@Test
	public void testLogin() {
		try {
			ExtentReports.startTest("Testes de login com sucesso");
			metodo.escrever(el.username, "standard_user");
			metodo.escrever(el.password, "secret_sauce");
			metodo.clicar(el.btnLogin);
			ExtentReports.logInf("Cliquei no botão de login");
		} catch (Exception e) {
			ExtentReports.logFail("Falha no login " + e.getMessage());
			throw e;
		}
	}
	
	@Test
	public void testCadastro() {
		try {
			ExtentReports.startTest("Testes de cadastro com sucesso");
			metodo.escrever(el.username, "standard_user");
			metodo.escrever(el.password, "secret_sauce");
			metodo.clicar(el.btnLogin);
			ExtentReports.logInf("Cliquei no botão de login");
		} catch (Exception e) {
			ExtentReports.logFail("Falha no login " + e.getMessage());
			throw e;
		}
	}
	
	@Test
	public void testCompra() {
		try {
			ExtentReports.startTest("Testes de compra com sucesso");
			metodo.escrever(el.username, "standard_user");
			metodo.escrever(el.password, "secret_sauce");
			metodo.clicar(el.btnLogin);
			ExtentReports.logInf("Cliquei no botão de login");
		} catch (Exception e) {
			ExtentReports.logFail("Falha no login " + e.getMessage());
			throw e;
		}
	}

}
