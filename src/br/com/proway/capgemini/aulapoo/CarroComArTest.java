package br.com.proway.capgemini.aulapoo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CarroComArTest {

	@Test
	void testLigarArCarroLigado() {
		CarroComAr carroFresco = new CarroComAr();
		carroFresco.isLigado = true;
		carroFresco.ligarAr();
		Assert.assertTrue(carroFresco.isArLigado);
	}
	
	@Test
	void testLigarArCarroDesligado() {
		CarroComAr carroFresco = new CarroComAr();
		carroFresco.isLigado = false;
		carroFresco.ligarAr();
		Assert.assertFalse(carroFresco.isArLigado);
	}

	@Test
	void testDesligarArLigado() {
		CarroComAr carroFresco = new CarroComAr();
		carroFresco.isLigado = true;
		carroFresco.isArLigado = false;
		carroFresco.desligarAr();
		Assert.assertFalse(carroFresco.isArLigado);
	}

	@Test
	void testDesligarArDesligado() {
		CarroComAr carroFresco = new CarroComAr();
		carroFresco.desligarAr();
		Assert.assertFalse(carroFresco.isArLigado);
	}

}
