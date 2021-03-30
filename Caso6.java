package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		String[][] datos ={ {"Elmer Cubas Silva","Manuel Cubas Silva","Fernando Cubas Silva"},
				            {"Puente Piedra"," San Isidro"," Chorrillos"}};
		
		//impresion de valores por filas
		System.out.println("\n------ IMPRESION POR FILAS ------");
		for (int f = 0; f < datos.length; f++) {
			for (int c = 0; c < datos[0].length; c++)
				System.out.print(String.format("%-20s", datos[f][c]+ " \t"));
			
			System.out.println();
		}
		// Impresion de valores por columnas
		System.out.println("\n------ IMPRESION POR COLUMNAS ------");
		for (int c = 0; c < datos[0].length; c++) {
			for (int f = 0; f < datos.length; f++)
				System.out.print(String.format("%-20s", datos[f][c]+ " \t"));
			
			System.out.println();
		}
		

	}

}
