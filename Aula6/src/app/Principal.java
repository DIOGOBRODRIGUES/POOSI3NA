package app;

public class Principal {

	public static void main(String[] args) {
		// exemplo2();
		exemplo3();
	}

	public static void exemplo3() {
		int matriz1[][] = new int[3][5];
		int matriz2[][] = new int[3][5];
		int matriz3[][] = new int[3][5];
		int num = 0;
		// alimentar a matriz1
		for (int linha = 0; linha < matriz1.length; linha++) {
			for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
				matriz1[linha][coluna] = num;
				matriz2[linha][coluna] = num;
				num++;
			}
		}
		// imp matriz1
		for (int linha = 0; linha < matriz1.length; linha++) {
			for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
				System.out.print(matriz1[linha][coluna] + " ");
			}
			System.out.println("");
		}

		System.out.println("+");
		// imp matriz2
		for (int linha = 0; linha < matriz1.length; linha++) {
			for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
				System.out.print(matriz2[linha][coluna] + " ");
			}
			System.out.println("");
		}
		
		//soma da matriz 1 e 2
		for (int linha = 0; linha < matriz1.length; linha++) {
			for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
				matriz3[linha][coluna]=matriz1[linha][coluna]+matriz2[linha][coluna];
			}
			System.out.println("");
		}
		
		//imp soma
		
		for (int linha = 0; linha < matriz1.length; linha++) {
			for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
				System.out.print(matriz3[linha][coluna] + " ");
			}
			System.out.println("");
		}
	}

	
	
	
	
	
	
	public static void exemplo2() {
		// padrão 1********************************************
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if (linha >= coluna)
					System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("");

		// padrão 2********************************************
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if (linha + coluna < 10) {
					System.out.print("*");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		System.out.println("");

		// padrão 3****************************
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if (coluna >= linha) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("");

		// 4° padrão*************
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if (coluna + linha >= 9) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
