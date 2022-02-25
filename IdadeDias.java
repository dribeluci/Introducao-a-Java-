
/* Exercício proposto: Criar um sistema que calcule quantos dias
viveu de acordo com a data de nascimento. */

package br.com.generation.sequencial;

import java.util.Scanner;

public class IdadeDias {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int ano, mes, dia, idadeDias; 

		
		System.out.println("Digite seu Ano de Nascimento: ");
		ano = leia.nextInt();
		
		System.out.println("Digite seu Mês de Nascimento: ");
		mes = leia.nextInt();
		
		System.out.println("Digite seu Dia de Nascimento: ");
		dia = leia.nextInt();
		
		idadeDias= (ano * 365) + (mes * 30) + dia;
				
		System.out.println("Você já viveu: " + idadeDias + " dias!");
		
		leia.close();
				
	}

}
