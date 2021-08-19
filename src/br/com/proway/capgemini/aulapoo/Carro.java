package br.com.proway.capgemini.aulapoo;

public class Carro {
	int potencia = 1;
	int combustivel = 0;
	int velocidade = 0;
	boolean isLigado = false;
	String cor = "azul";
	
	/**
	 * Liga o carro.
	 * 
	 * @return boolean se o carro está ligado
	 */
	public boolean ligar() {
		if(combustivel > 0) {
			this.isLigado = true;
		}else {
			this.isLigado = false;
		}
		return this.isLigado;
	}
	
	/**
	 * Aumenta a velocidade do Carro.
	 * 
	 * @return int velocidade atualizada
	 */
	public int acelerar() {
		if(this.isLigado) {
			this.velocidade += this.potencia;
		}
		return this.velocidade;
	}
	
	/**
	 * Desliga o carro.
	 * 
	 * @return boolean se o carro está ligado.
	 */
	public boolean desligar() {
		this.isLigado = false;
		return this.isLigado;
	}
	
	/**
	 * Frea o carro.
	 * 
	 * @return int velocidade do carro.
	 */
	public int frear() {
		if(this.velocidade >= 10) {
			velocidade -= 10;
		}else {
			velocidade = 0;
		}
		return this.velocidade;
	}
}
