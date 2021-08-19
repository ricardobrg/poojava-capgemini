package br.com.proway.capgemini.aulapoo;

public class CarroComAr extends Carro{
	
	boolean isArLigado = false;
	
	/**
	 * Liga o ar condicionado.
	 * 
	 * @return
	 */
	public boolean ligarAr() {
		return this.isArLigado;
	}
	
	/**
	 * Desliga ar condicionado.
	 * 
	 * @return
	 */
	public boolean desligarAr() {
		return this.isArLigado;
	}
}
