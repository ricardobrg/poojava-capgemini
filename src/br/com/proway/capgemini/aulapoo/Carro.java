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
		return this.isLigado;
	}
	
	/**
	 * Aumenta a velocidade do Carro.
	 * @return int velocidade atualizada
	 */
	public int acelerar() {
		return this.velocidade;
	}
	
	/**
	 * Desliga o carro.
	 * 
	 * @return boolean se o carro está ligado.
	 */
	public boolean desligar() {
		return this.isLigado;
	}
	
	/**
	 * Frea o carro.
	 * 
	 * @return int velocidade do carro.
	 */
	public int frear() {
		return this.velocidade;
	}
}
