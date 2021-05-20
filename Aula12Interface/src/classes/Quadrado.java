package classes;

import interfaces.FiguraGeometrica;

public class Quadrado implements FiguraGeometrica{
	private String nomeQuadrado;
	private int lado;
	
	@Override
	public String getNomeFigura() {
		return this.nomeQuadrado;
	}
	
	@Override
	public int getArea() {
		return lado*lado;
	}
	
	@Override
	public int getPerimetro() {
		return lado*4;
	}
}
