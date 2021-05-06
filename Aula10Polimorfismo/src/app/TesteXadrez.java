package app;

import xadrez.*;

public class TesteXadrez {
	public static void main(String[] args) {
		
		Peca peao = new Peao();
		Peca cavalo = new Cavalo();
		Peca bispo = new Bispo();
		
		
		cavalo.mover();
		bispo.mover();
		System.out.println(peao.getClass());
		System.out.println(peao instanceof Cavalo);
		System.out.println(cavalo instanceof Peca);
		System.out.println(bispo instanceof Peca);
		
	}
}
