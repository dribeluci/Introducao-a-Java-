/* Exercício proposto: Realizar um sistema que faça o calculo
 do tempo do evento em segundos por horas, minutos e segundos*/


package br.com.generation.sequencial;

import java.util.Scanner;

public class tempoEvento {

	
public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int hora, minuto , segundo, eventoSegundos; 

		
		System.out.println("Escreva quanto tempo o evento durou em segundos: ");
		eventoSegundos= leia.nextInt();
		
		hora = eventoSegundos/3600;
		minuto = (eventoSegundos % 3600)/60;
		segundo = (eventoSegundos % 3600)%60;
		
		
		System.out.println("O evento da fabrica durou: " + hora + " hora(s) " + minuto  + " minuto(s) e  " + segundo + "seg ");
	
		leia.close();
		
	}	
}
