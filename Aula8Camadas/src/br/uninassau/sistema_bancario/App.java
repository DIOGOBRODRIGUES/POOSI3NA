package br.uninassau.sistema_bancario;

import br.uninassau.sistema_bancario.dados.*;
import br.uninassau.sistema_bancario.negocios.beans.*;

public class App {
	public static void main (String[] args) {
		/*RepositorioContas listaContas = new RepositorioContas(3);
		
		Conta c1 = new Conta("12345", 100.50);
		Conta c2 = new Conta("25356", 500.25);
		Conta c3 = new Conta("45643", 1000.10);
		
		listaContas.cadastrar(c1);
		listaContas.cadastrar(c2);
		listaContas.cadastrar(c3);
		
		System.out.println(listaContas.toString());
		
		System.out.println(listaContas.procurar("12345"));
		
		listaContas.remover("12345");
		
		System.out.println(listaContas.toString());*/
		/*
		ContaPoupanca p = new ContaPoupanca("235649-5");
		p.creditar(150.00);
		p.debitar(50.0);
		p.renderJuros(0.1);
		
		System.out.println(p.getSaldo());*/
		
		ContaEspecial contae = new ContaEspecial("45897-5");
		contae.creditar(500);
		contae.debitar(550);
		contae.aumetarLimite(100);
		System.out.println(contae.getSaldo());
		
	}
}
