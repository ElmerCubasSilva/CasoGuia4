package com.senati.eti;
import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		int[] numeros=new int[5];

		
		System.out.print("Ingrese n�mero 1 : ");
		numeros[0]=sc.nextInt();
		System.out.print("Ingrese n�mero 2 : ");
		numeros[1]=sc.nextInt();
		System.out.print("Ingrese n�mero 3 : ");
		numeros[2]=sc.nextInt();
		System.out.print("Ingrese n�mero 4 : ");
		numeros[3]=sc.nextInt();
		System.out.print("Ingrese n�mero 5 : ");
		numeros[4]=sc.nextInt();
		sc.close();
		
		int pares=0;
		int impares=0;
		int suma=0;
		
		for(int num:numeros) {
			if(num%2==0)
				pares++;
			else
				impares++;
			suma+=num;
		}
		float promedio=(float)suma/5;
		System.out.println("-----------");
		System.out.println("REWSULTADOS");
		System.out.println("-----------");
		System.out.println("Cantidad de n�meros pares   : "+pares);
		System.out.println("Cantidad de n�meros impares : "+impares);
		System.out.println("Promedio de los n�meros     : "+promedio);
		

	}

}
