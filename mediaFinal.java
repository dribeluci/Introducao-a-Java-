/* Exerc�cio proposto: Criar um sistema que leia tr�s notas inteiras 
   e mostre sua m�dia final considerando que o peso da primeira nota �
   2, o da segunda � 3 e da terceira � 5. */



package br.com.generation.sequencial;

import java.util.Scanner;

public class mediaFinal {
	
	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int A, B , C; 

		
		System.out.println("Digite a primeira nota:  ");
		A= leia.nextInt();
		System.out.println("Digite a segunda nota:  ");
		B= leia.nextInt();
		System.out.println("Digite a terceira nota:  ");
		C= leia.nextInt();
		
		if (A <= 10) {
			int pesoUm= A * 2;
				
				if (B <= 10) { 
					int pesoDois= B * 3;
				
					if(C <= 10); {
						int pesoTres= C* 5;
						
						int soma= (pesoUm + pesoDois + pesoTres);
						int M= soma / 3;
						
						System.out.println(" A m�dia final � de: " + M);
						
					}
				}
			}   else {
				System.out.println(" Os n�mero inserido � inv�lido! Digite um n�mero de 0 � 10. ");
											
		leia.close();
		
		}	
	}
}
	
