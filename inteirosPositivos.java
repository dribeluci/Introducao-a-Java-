/* Exerc�cio proposto: Escreva um sistema que leia tr�s 
 n�meros inteiros e positivos e calcule a express�o: D= R + S/ 2 onde,
 R= (A + B) � e  S= (B + C)� .  */


package br.com.generation.sequencial;

import java.util.Scanner;

public class inteirosPositivos {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int A, B , C; 

		
		System.out.println("Digite o primeiro n�mero:  ");
		A= leia.nextInt();
		System.out.println("Digite o segundo n�mero:  ");
		B= leia.nextInt();
		System.out.println("Digite o terceiro n�mero:  ");
		C= leia.nextInt();
	
		int R = (A + B) /2;
		int S= (B+ C) * 2;
		int D= (R + S) / 2;
		
		System.out.println("O Resultado da sua equa��o �: " +  D);
		
		leia.close();
	}
}