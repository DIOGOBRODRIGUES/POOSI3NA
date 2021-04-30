package app;

import java.util.Date;

public class VeiculoTerrestre extends Veiculo{
	private int velocidadeTerrestre;
	private String categoriaTerrestre;
	
	public VeiculoTerrestre(double preco, Date fabricacao, double peso) {
		super(preco, fabricacao, peso);
		this.velocidadeTerrestre = 0;
		this.categoriaTerrestre = null;
	}
	
	public int getVelocidadeTerrestre() {
		return this.velocidadeTerrestre;
	}
	
	public String getCategoriaTerrestre() {
		return this.categoriaTerrestre;
	}
	
}
