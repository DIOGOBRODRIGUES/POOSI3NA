package classes;

import interfaces.FiguraGeometrica;

public class Triangulo implements FiguraGeometrica{
	private String nomeTriangulo;
	private int ladoA;
	private int ladoB;
	private int ladoC;
	private int base;
	private int altura;
	
	@Override
	public String getNomeFigura() {
		return this.nomeTriangulo;
	}
	
	@Override
	public int getArea() {
		return (base * altura) / 2;
	}
	
	@Override 
	public int getPerimetro() {
		return ladoA + ladoB + ladoC;
	}
	
}
