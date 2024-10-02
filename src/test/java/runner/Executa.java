package runner;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;

public class Executa extends Drivers {

	public static void iniciarTeste() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
	}

	public static void finalizarTeste() {
		driver.quit();

	}

}
