/*  Exerc�cio propostos:
Escreva um sistema que l� os coeficientes a,b,c,d,e e f 
e calcula e mostra os valores de x e y. Sabendo que:

ax + by = c 
dx + ey = f 

Podendo ser resolvido pela seguinte equa��o: 

x= ce - bf / ae - bd  
Y= af - cd/ ae - bd  */

package br.com.generation.sequencial;

import java.util.Scanner;

public class equacaoLinear {

		public static void main(String[] args) {
			
			Scanner leia= new Scanner(System.in);
			
			int a,b,c,d,e,f; 
			
			System.out.println(" Digite o 1� n�mero: ");
			a= leia.nextInt();
			System.out.println(" Digite o 2� n�mero: ");
			b= leia.nextInt();
			System.out.println(" Digite o 3� n�mero: ");
			c= leia.nextInt();
			System.out.println(" Digite o 4� n�mero: ");
			d= leia.nextInt();
			System.out.println(" Digite o 5� n�mero: ");
			e= leia.nextInt();
			System.out.println(" Digite o 6� n�mero: ");
			f= leia.nextInt();

			double X= (c*e) - (b*f)/ (a*e) - (b*d);
			double Y= (a*f) - (c*a)/ (a*e) - (b*d);

			System.out.println("\n O valor de X �: " + X);
			System.out.println("\n O valor de Y �: " + Y);
			
			leia.close();
			
	}
}

