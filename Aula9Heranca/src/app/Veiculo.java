package app;

import java.util.Date;

public class Veiculo {
	private double preco;
	private Date fabricacao;
	private double peso;
	
	public Veiculo(double preco, Date fabricacao, double peso) {
		this.preco = preco;
		this.fabricacao = fabricacao;
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public Date getFabricacao() {
		return fabricacao;
	}


	public double getPeso() {
		return peso;
	}

	
	
	
	
	
	
	
}
