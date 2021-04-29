package br.uninassau.sistema_bancario.negocios.beans;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca (String numero) {
		super(numero, 0.0);
	}
	
	public void renderJuros(double taxa) {
		this.creditar(this.getSaldo()*taxa);
	}
	
}
