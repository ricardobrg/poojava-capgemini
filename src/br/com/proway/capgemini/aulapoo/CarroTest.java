package br.com.proway.capgemini.aulapoo;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CarroTest {

	@Test
	void testLigar() {
		Carro veiculo = new Carro();
		veiculo.ligar();
		Assert.assertTrue(veiculo.isLigado);
	}

	@Test
	void testAcelerar() {
		fail("Not yet implemented");
	}

	@Test
	void testDesligar() {
		fail("Not yet implemented");
	}

	@Test
	void testFrear() {
		fail("Not yet implemented");
	}

}
