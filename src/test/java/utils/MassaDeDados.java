package utils;

import com.github.javafaker.Faker;

public class MassaDeDados {

	Faker faker = new Faker();

	public String gerarNome() {

		return faker.name().name();
	}

	public String gerarSobrenome() {

		return "";
	}

	public String gerarEmail() {

		return "";
	}

	public String gerarEndereco() {
		return "";
	}

	public String gerarDataNacimento() {

		return "";
	}

}
