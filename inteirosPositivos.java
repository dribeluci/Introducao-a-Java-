/* Exercício proposto: Escreva um sistema que leia três 
 números inteiros e positivos e calcule a expressão: D= R + S/ 2 onde,
 R= (A + B) ² e  S= (B + C)² .  */


package br.com.generation.sequencial;

import java.util.Scanner;

public class inteirosPositivos {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int A, B , C; 

		
		System.out.println("Digite o primeiro número:  ");
		A= leia.nextInt();
		System.out.println("Digite o segundo número:  ");
		B= leia.nextInt();
		System.out.println("Digite o terceiro número:  ");
		C= leia.nextInt();
	
		int R = (A + B) /2;
		int S= (B+ C) * 2;
		int D= (R + S) / 2;
		
		System.out.println("O Resultado da sua equação é: " +  D);
		
		leia.close();
	}
}