package br.com.proway.capgemini.aulapoo;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CarroTest {

	@Test
	void testLigarComMais10Combustivel() {
		Carro veiculo = new Carro();
		CarroController controllerVeiculo = new CarroController();
		controllerVeiculo.carro = veiculo;
		controllerVeiculo.carro.combustivel += 10;
		controllerVeiculo.ligar();
		Assert.assertTrue(controllerVeiculo.carro.isLigado);
	}

	@Test
	void testLigarCom0Combustivel() {
		Carro veiculo = new Carro();
		CarroController controllerVeiculo = new CarroController();
		controllerVeiculo.carro = veiculo;
		controllerVeiculo.carro.combustivel = 0;
		controllerVeiculo.ligar();
		Assert.assertFalse(controllerVeiculo.carro.isLigado);
	}

	
	@Test
	void testAcelerarLigado() {
		Carro veiculo = new Carro();
		CarroController controllerVeiculo = new CarroController();
		controllerVeiculo.carro = veiculo;
		controllerVeiculo.carro.isLigado = true;
		controllerVeiculo.carro.velocidade = 0;
		controllerVeiculo.acelerar();
		int velocidadeFinal = controllerVeiculo.carro.potencia;
		Assert.assertEquals(velocidadeFinal, controllerVeiculo.carro.velocidade);
	}
	
	@Test
	void testAcelerarDesligado() {
		Carro veiculo = new Carro();
		CarroController controllerVeiculo = new CarroController();
		controllerVeiculo.carro = veiculo;
		controllerVeiculo.carro.isLigado = false;
		controllerVeiculo.carro.velocidade = 0;
		controllerVeiculo.acelerar();
		int velocidadeFinal = 0;
		Assert.assertEquals(velocidadeFinal, veiculo.velocidade);
	}

	@Test
	void testDesligarCarroLigado() {
		Carro veiculo = new Carro();
		CarroController controllerVeiculo = new CarroController();
		controllerVeiculo.carro = veiculo;
		controllerVeiculo.carro.isLigado = true;
		controllerVeiculo.desligar();
		Assert.assertFalse(veiculo.isLigado);
	}
	
	@Test
	void testDesligarCarroDesligado() {
		Carro veiculo = new Carro();
		CarroController controllerVeiculo = new CarroController();
		controllerVeiculo.carro = veiculo;
		controllerVeiculo.carro.isLigado = false;
		controllerVeiculo.desligar();
		Assert.assertFalse(controllerVeiculo.carro.isLigado);
	}

	@Test
	void testFrearVelocidade100() {
		Carro veiculo = new Carro();
		CarroController controllerVeiculo = new CarroController();
		controllerVeiculo.carro = veiculo;
		controllerVeiculo.carro.velocidade = 100;
		controllerVeiculo.frear();
		Assert.assertEquals(90, controllerVeiculo.carro.velocidade);
	}


	@Test
	void testFrearVelocidade9() {
		Carro veiculo = new Carro();
		CarroController controllerVeiculo = new CarroController();
		controllerVeiculo.carro = veiculo;
		controllerVeiculo.carro.velocidade = 9;
		controllerVeiculo.frear();
		Assert.assertEquals(0, controllerVeiculo.carro.velocidade);
	}

	
}
