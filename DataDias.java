/* Exercício proposto: Criar um sistema que calcule 
  quantidade de anos, meses e dias baseada em dias vividos */


package br.com.generation.sequencial;

import java.util.Scanner;

public class DataDias {

public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int ano , mes , dia, idadeDias; 

		
		System.out.println("Escreva quantos dias você já viveu: ");
		idadeDias = leia.nextInt();

		ano= idadeDias / 365;
		mes= (idadeDias % 365) /30;
		dia= (idadeDias % 365) % 30;
		
		System.out.println("Você já viveu: " + dia + " dias, " + mes + " meses,  e " + ano + "anos");
		
		leia.close();
		
	}	
}
