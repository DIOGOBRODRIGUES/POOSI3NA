package classes;

import interfaces.Motor;
import interfaces.Veiculo;

public class Toyota implements Motor, Veiculo{
	
	@Override
	public int getRPM() {
		return 8000;
	}
	
	@Override
	public double getPotencia() {
		return 139.8;
	}
	
	@Override
	public String getTipo() {
		return "Veiculo urbano";
	}
	
	@Override
	public double getPeso() {
		return 1650.0;
	}
	
}
