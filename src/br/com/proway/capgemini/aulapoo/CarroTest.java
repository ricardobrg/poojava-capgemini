package br.com.proway.capgemini.aulapoo;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CarroTest {

	@Test
	void testLigarComMais10Combustivel() {
		Carro veiculo = new Carro();
		veiculo.combustivel += 10;
		veiculo.ligar();
		Assert.assertTrue(veiculo.isLigado);
	}

	@Test
	void testLigarCom0Combustivel() {
		Carro veiculo = new Carro();
		veiculo.combustivel = 0;
		veiculo.ligar();
		Assert.assertFalse(veiculo.isLigado);
	}

	
	@Test
	void testAcelerarLigado() {
		Carro veiculo = new Carro();
		veiculo.isLigado = true;
		veiculo.velocidade = 0;
		veiculo.acelerar();
		int velocidadeFinal = veiculo.potencia;
		Assert.assertEquals(velocidadeFinal, veiculo.velocidade);
	}
	
	@Test
	void testAcelerarDesligado() {
		Carro veiculo = new Carro();
		veiculo.isLigado = false;
		veiculo.velocidade = 0;
		veiculo.acelerar();
		int velocidadeFinal = 0;
		Assert.assertEquals(velocidadeFinal, veiculo.velocidade);
	}

	@Test
	void testDesligarCarroLigado() {
		Carro veiculo = new Carro();
		veiculo.isLigado = true;
		veiculo.desligar();
		Assert.assertFalse(veiculo.isLigado);
	}
	
	@Test
	void testDesligarCarroDesligado() {
		Carro veiculo = new Carro();
		veiculo.isLigado = false;
		veiculo.desligar();
		Assert.assertFalse(veiculo.isLigado);
	}

	@Test
	void testFrearVelocidade100() {
		Carro veiculo = new Carro();
		veiculo.velocidade = 100;
		veiculo.frear();
		Assert.assertEquals(90, veiculo.velocidade);
	}


	@Test
	void testFrearVelocidade9() {
		Carro veiculo = new Carro();
		veiculo.velocidade = 9;
		veiculo.frear();
		Assert.assertEquals(0, veiculo.velocidade);
	}

	
}
