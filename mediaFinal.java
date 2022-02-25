/* Exercício proposto: Criar um sistema que leia três notas inteiras 
   e mostre sua média final considerando que o peso da primeira nota é
   2, o da segunda é 3 e da terceira é 5. */



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
						
						System.out.println(" A média final é de: " + M);
						
					}
				}
			}   else {
				System.out.println(" Os número inserido é inválido! Digite um número de 0 à 10. ");
											
		leia.close();
		
		}	
	}
}
	
