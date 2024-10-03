package pages;

import org.openqa.selenium.By;

import metodos.Metodos;
import utils.MassaDeDados;

public class DesafioPage {

	
	Metodos metodo = new Metodos();
	MassaDeDados massa = new MassaDeDados();
	
	private By estado = By.xpath("//select");
	private By passarMOuse = By.xpath("//span[@class='hover-alert']");
	private By nome = By.xpath("");
	private By email = By.xpath("");
	private By telefone = By.xpath("");
	private By endereco = By.xpath("");
	private By cidade = By.xpath("");
	private By upload = By.xpath("");
	private By btnEnviar = By.xpath("");
	
	
	
	public void selecionarEstado(String estado) {
		metodo.escrever(this.estado, estado);
	}
	
	
	public void passaMouse() {
		metodo.mouseOver(passarMOuse);
	}
	
	public void enviarFormulario( String telefone, String cidade, String filePath) {
		metodo.escrever(this.nome, massa.gerarNome());
		metodo.escrever(this.email, massa.gerarEmail());
		metodo.escrever(this.telefone, telefone);
		metodo.escrever(this.endereco, massa.gerarEndereco());
		metodo.escrever(this.cidade, cidade);
		metodo.uploadDeArquivo(upload, filePath);
		metodo.clicar(btnEnviar);
	}
	
	public void validarAlertDe5Segundos() {
		metodo.validarAlert("Pop-up aberto após 5 segundos!");
	}

}
