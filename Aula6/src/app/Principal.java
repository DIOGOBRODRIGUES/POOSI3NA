package app;

public class Principal {

	public static void main(String[] args) {
		//padr�o 1********************************************
		for(int linha  = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				if(linha>=coluna)
				System.out.print(linha+""+coluna+ " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		//padr�o 2********************************************
		for(int linha  = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				if(linha+coluna < 10 ) {
				System.out.print(linha+""+coluna+ " ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
		
		//padr�o 3****************************
		for(int linha  = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				if(coluna>=linha) {
				System.out.print(linha+""+coluna+ " ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
		
		//4� padr�o*************
		for(int linha  = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				if(coluna+linha >= 9) {
				System.out.print(linha+""+coluna+ " ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}

}
