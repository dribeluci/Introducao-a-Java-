/* . Exercício Proposto:

Construa um programa em c que, tendo como dados de entrada dois 
pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância 
entre eles. A fórmula que efetua tal cálculo é: 
D= raiz de (x2 - x1)² + (y2 - y1)²;  */

package br.com.generation.sequencial;

import java.util.Scanner;
import java.lang.Math;

public class equacaoRaiz {
	
	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int x1, y1 , x2, y2; 

		
		System.out.println("Digite um valor:  ");
		x1= leia.nextInt();
		System.out.println("Digite o segundo valor :  ");
		y1= leia.nextInt();
		System.out.println("Digite o terceiro valor:  ");
		x2= leia.nextInt();
		System.out.println("Digite o quarto valor:  ");
		y2= leia.nextInt();

		
		int A= (x2-x1) *2 + (y2-y1) *2;
		
		double raiz = Math.sqrt(A);

        System.out.println("A raiz da equação é: " + raiz);
        
        leia.close();
		
}
}