package gui;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenamientoNumerico 
{

	public static void main(String[] args)
	{
		System.out.println("Introduzca la cantidad de numeros a ordenar");
		Scanner sc= new Scanner(System.in);
		int cantNumeros=sc.nextInt();
		int [] arregloNumeros=new int[cantNumeros];
		
		System.out.println("Introduza los valores a ordenar");
		for (int i = 0; i < arregloNumeros.length; i++) 
		{
			arregloNumeros[i]=sc.nextInt();
		}
		
		for (int i : OrdenaMenorMayor(arregloNumeros)) 
		{
			System.out.println(i);
		}
	}
	
	public static int[]OrdenaMenorMayor(int[]arreglo)
	{
		for (int i = 0; i <arreglo.length-1; i++) 
		{
			if(arreglo[i]>arreglo[i+1])
			{
				int aux=arreglo[i+1];
				arreglo[i+1]=arreglo[i];
				arreglo[i]=aux;
			}
		}
		return arreglo;
	}

}
