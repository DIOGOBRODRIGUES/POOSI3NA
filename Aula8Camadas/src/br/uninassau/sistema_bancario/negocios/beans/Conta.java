package br.uninassau.sistema_bancario.negocios.beans;

public class Conta {
	private String numero;//1235456-6
	private double saldo;
	
	
	public Conta(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void creditar (double valor) {
		this.saldo += valor; // saldo = saldo + valor;
	}
	
	public void debitar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
		}
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Conta [numero = "+numero+", saldo = " + saldo +"]";
	}
	
}
