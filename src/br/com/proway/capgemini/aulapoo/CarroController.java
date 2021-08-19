package br.com.proway.capgemini.aulapoo;

public class CarroController{
	
	Carro carro;

	/**
	 * Liga o carro.
	 * 
	 * @return boolean se o carro está ligado
	 */
	final public boolean ligar() {
		if(carro.combustivel > 0) {
			carro.isLigado = true;
		}else {
			carro.isLigado = false;
		}
		return carro.isLigado;
	}
	
	/**
	 * Aumenta a velocidade do Carro.
	 * 
	 * @return int velocidade atualizada
	 */
	public int acelerar() {
		if(carro.isLigado) {
			carro.velocidade += carro.potencia;
		}
		return carro.velocidade;
	}
	
	/**
	 * Desliga o carro.
	 * 
	 * @return boolean se o carro está ligado.
	 */
	public boolean desligar() {
		carro.isLigado = false;
		return carro.isLigado;
	}
	
	/**
	 * Frea o carro.
	 * 
	 * @return int velocidade do carro.
	 */
	public int frear() {
		if(carro.velocidade >= 10) {
			carro.velocidade -= 10;
		}else {
			carro.velocidade = 0;
		}
		return carro.velocidade;
	}
	
}
