package br.com.plpmd.loja;

import java.math.BigDecimal;

import br.com.plpmd.loja.imposto.CalculadoraDeImpostos;
import br.com.plpmd.loja.imposto.ICMS;
import br.com.plpmd.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
	}

}
