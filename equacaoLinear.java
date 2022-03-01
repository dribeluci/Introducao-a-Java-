/*  Exercício propostos:
Escreva um sistema que lê os coeficientes a,b,c,d,e e f 
e calcula e mostra os valores de x e y. Sabendo que:

ax + by = c 
dx + ey = f 

Podendo ser resolvido pela seguinte equação: 

x= ce - bf / ae - bd  
Y= af - cd/ ae - bd  */

package br.com.generation.sequencial;

import java.util.Scanner;

public class equacaoLinear {

		public static void main(String[] args) {
			
			Scanner leia= new Scanner(System.in);
			
			int a,b,c,d,e,f; 
			
			System.out.println(" Digite o 1º número: ");
			a= leia.nextInt();
			System.out.println(" Digite o 2º número: ");
			b= leia.nextInt();
			System.out.println(" Digite o 3º número: ");
			c= leia.nextInt();
			System.out.println(" Digite o 4º número: ");
			d= leia.nextInt();
			System.out.println(" Digite o 5º número: ");
			e= leia.nextInt();
			System.out.println(" Digite o 6º número: ");
			f= leia.nextInt();

			double X= (c*e) - (b*f)/ (a*e) - (b*d);
			double Y= (a*f) - (c*a)/ (a*e) - (b*d);

			System.out.println("\n O valor de X é: " + X);
			System.out.println("\n O valor de Y é: " + Y);
			
			leia.close();
			
	}
}

