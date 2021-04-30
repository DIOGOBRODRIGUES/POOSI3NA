package br.uninassau.sistema_bancario.negocios.beans;

public class ContaEspecial extends Conta{
	private double limite;
	
	public ContaEspecial(String numero) {
		super(numero, 0.0);
		this.limite = 100.00;
	}
	
	public void aumetarLimite(double aumento) {
		this.limite += aumento;
	}
	
	public double getLimite() {
		return this.limite;
	}
	
	public void debitar(double valor) {
		if(valor <= this.saldo + this.limite) {
			this.saldo -= valor;
		}
	}
	
}
