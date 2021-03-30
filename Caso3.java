package com.senati.eti;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] numero = new Integer[5];
		
		System.out.println("INGRESO DE NUMEROS");
		System.out.println("------------------");
		
		for ( int x =0; x < numero.length; x++) {
			System.out.print("\nNumero " + ( x + 1 ) + " :" );
			numero[x] = sc.nextInt();
			
		}
		
		Arrays.sort(numero);
		
		System.out.println("\nNUMEROS ORDENADOS ASCENDENTEMENTE");
		System.out.println("---------------------------------");
		
		for (int x =0; x < numero.length; x++) 
			System.out.println("Numero " + ( x + 1 ) + " :" + numero[x] );
			
		Arrays.sort(numero,Collections.reverseOrder());
		System.out.println("\nNUMEROS ORDENADOS DESCENDENTEMENTE");
		System.out.println("---------------------------------");
		
		for (int x =0; x < numero.length; x++) 
			System.out.println("Numero " + ( x + 1 ) + " :" + numero[x] );
			
		

	}

}
