/* Exerc�cio proposto: O custo ao consumidor de um carro novo � a soma do custo 
de f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um 
sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.*/


package br.com.generation.sequencial;

import java.util.Scanner;

public class custoCarro {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		double custoConsumidor, custoFabrica, porcDistribuidor, porcImposto;
		
		System.out.println ("Digite o custo de fabrica: ");
		custoFabrica= leia.nextDouble();
		
		porcDistribuidor = custoFabrica*0.28;
		porcImposto = custoFabrica*0.45;

		custoConsumidor= custoFabrica + porcDistribuidor + porcImposto;

		System.out.println("O custo do consumidor ser� de: " + custoConsumidor);
		
		leia.close();
			
	}
}
