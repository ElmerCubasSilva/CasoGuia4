package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrCodigo = {"A-123","A-124","A-125","A-126"};
		String[] arrNombre = {"Elmer Cubas Silva ","Manuel Cubas Silva ","Fernando Cubas Silva","Mathias Lingan Hernandez"};
		int[] arrNota = {1000,500,1400,90};
		
		System.out.println("B U S Q U E D A  D E  D A T O S");
		System.out.println("-------------------------------");
		System.out.print("Ingrese Codigo.........:");
		String codigo = sc.nextLine();
		
		int p = -1;
		
		for ( int x = 0; x < arrCodigo.length; x++) {
			if ( codigo.equals(arrCodigo[x])) {
				p = x;
				break;
				
			}
		}
		if (p == -1 ) {
			System.out.println("\n-------------------------");
			System.out.println("  CODIGO NO ENCONTRADO");
			System.out.println("-------------------------");
			
		}
		else {
			System.out.println("\n-------------------------");
			System.out.println("    CODIGO  ENCONTRADO   ");
			System.out.println("-------------------------");
			System.out.println("Codigo......:" + arrCodigo[p]);
			System.out.println("Nombre......:" + arrNombre[p]);
          //if(arrNota[p] <= 13 )
			 //System.out.println("Estado...: Aprobrado" );
	      //else
			 //System.out.println("Estado....: Desaprobado");
		}
		if (arrNota[p] <= 13) {	
			System.out.println("Nota........:" + arrNota[p]);
			System.out.println("Estado......:" + "DESAPROBADO");
			
		}	
		else {
			System.out.println("Nota........:" + arrNota[p]);
		    System.out.println("Estado......:" + "APROBADO");
		    
		}    
	}

}
