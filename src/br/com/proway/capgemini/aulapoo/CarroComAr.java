package br.com.proway.capgemini.aulapoo;

public class CarroComAr extends Carro{
	
	boolean isArLigado = false;
	int velocidade = 0;
	
	/**
	 * Liga o ar condicionado.
	 * 
	 * @return
	 */
	public boolean ligarAr() {
		if(this.isLigado) {
			this.isArLigado = true;
		}
		return this.isArLigado;
	}
	
	/**
	 * Desliga ar condicionado.
	 * 
	 * @return
	 */
	public boolean desligarAr() {
		this.isArLigado = false;
		return this.isArLigado;
	}
}
