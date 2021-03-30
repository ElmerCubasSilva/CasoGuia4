package com.senati.eti;

import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] numero = new int[3][4];
		
		System.out.println("LECTURA DE NUMEROS");
		System.out.println("------------------");
		
		int num_mayor = 0;
		int num_menor = 0;
		
		
		for ( int f = 0; f < numero.length; f++) {
			System.out.println("DATOS DE LA FILA:" + (f +1));
			System.out.println("---------------------------");
			for ( int c = 0; c < numero[0].length; c++) {
				System.out.print("Numero : " + (c + 1) + " :");
				numero[f][c] = sc.nextInt();
				
				if ( f == 0 && c == 0 ) {
					num_mayor = numero[0][0];
				}
				if (numero[f][c] > num_mayor)
					num_mayor = numero[f][c];
				
				if ( f == 0 && c == 0 ) {
					num_menor = numero[0][0];
				}
				if (numero[f][c] < num_menor)
					num_menor = numero[f][c];
				

			}
		}
		System.out.println("---------------------------");
		System.out.println("--  R E S U L T A D O S  --");
		System.out.println("---------------------------");
		System.out.println("Numero Mayor...:" + num_mayor);
		System.out.println("Numero Menor...:" + num_menor);
	}

}
