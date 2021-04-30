package app;

public class Teste {
	
	public static void main(String[] args) {
		
		Carro carro = new Carro(40000.00, null, 3000);
		System.out.println(carro.getPreco());//super Classe Veiculo
		System.out.println(carro.getVelocidadeTerrestre()); //subclasse VeiculoTerrestre
		System.out.println(carro.getMarca());
	}
	
	
}
