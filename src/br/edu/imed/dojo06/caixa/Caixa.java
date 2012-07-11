package br.edu.imed.dojo06.caixa;

public class Caixa {
	
	int quantiaSacar = 0;
	int cem = 0;
	int cinquenta = 0;
	int vinte = 0;
	int dez = 0;

	public int getQuantiaSacar() {
		return quantiaSacar;
	}
	
	public void setQuantiaSacar(int quantiaSacar){
		this.quantiaSacar = quantiaSacar;
	}
	
	public void calculaNotasDeCem(int quantiaSacar){
		this.cem = quantiaSacar/100;
	}
	
	public void calculaNotasDeCinquenta(int quantiaSacar) {
		this.cinquenta = quantiaSacar/50;
	}
	
	public void calculaNotasDeVinte(int quantiaSacar) {
		this.vinte = quantiaSacar/20;
	} 
	
	public void calculaNotasDeDez(int quantiaSacar) {
		this.dez = quantiaSacar/10;
	} 
	
	public void sacar(int quantiaSacar){
		this.calculaNotasDeCem(quantiaSacar);
		quantiaSacar = quantiaSacar - (this.cem * 100);
		System.out.println("Notas de 100: " + this.cem);
		this.calculaNotasDeCinquenta(quantiaSacar);
		quantiaSacar = quantiaSacar - (this.cinquenta *50);
		System.out.println("Notas de 50: " + this.cinquenta);
		this.calculaNotasDeVinte(quantiaSacar);
		quantiaSacar = quantiaSacar - (this.vinte * 20);
		System.out.println("Notas de 20: " + this.vinte);
		this.calculaNotasDeDez(quantiaSacar);
		quantiaSacar = quantiaSacar - (this.dez * 10);
		System.out.println("Notas de 10: " + this.dez);
	}
	
	public int getCem(){
		return cem;
	}

	public int getCinquenta() {
		return cinquenta;
	}

	public int getVinte() {
		return vinte;
	}

	public int getDez() {
		return dez;
	}
	
}
