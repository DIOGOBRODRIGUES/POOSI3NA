package br.uninassau.sistema_bancario.dados;

import java.util.Arrays;

import br.uninassau.sistema_bancario.negocios.beans.Conta;

public class RepositorioContas {
	private Conta[] contas;
	private int proxima; 
	
	public RepositorioContas(int tamanho) {
		this.contas = new Conta[tamanho];
		this.proxima = 0;
	}
//****** M�todo Cadastrar********************//	
	public void cadastrar(Conta c) {
		this.contas[this.proxima] = c;
		this.proxima = this.proxima + 1;
	}

//********M�todo Procurar **********************///
	public Conta procurar(String num) {
		int i = this.procurarIndice(num);
		Conta resultado = null;
		if(i != this.proxima) {
			resultado = this.contas[i];
		}
		return resultado;
	}

//************ M�todo remover *****************//
	public void remover (String num) {
		int i = this.procurarIndice(num);
		if(i != this.proxima) {
			this.contas[i] = this.contas[this.proxima - 1];
			this.contas[this.proxima - 1] = null;
			this.proxima = this.proxima - 1;
			System.out.println("Conta" + num + "removida");
		}else {
			System.out.println("Conta n�o existe.");
		}
	}

//*******M�todo auxiliar***************************/	
	private int procurarIndice(String num) {
		int i = 0;
		boolean achou = false;
		while((!achou) && (i < this.proxima)) {
			if(num.equals(this.contas[i].getNumero())) {
				achou = true;
			}else {
				i = i + 1;
			}
		}//fim do while
		
		return i;
	}
	
	@Override
	public String toString() {
		return "RepositorioContas [contas=" + Arrays.toString(contas) + ", proxima=" + proxima + "]";
	}
	
	
	
}
