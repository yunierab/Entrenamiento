package gui;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Subcadenas 
{

	public static void main(String[] args) 
	{
	     Scanner entradaGrande=new Scanner(System.in);
	     String cadenaGrande=entradaGrande.next();
	     Scanner entradaChica=new Scanner(System.in);
	     String cadenaChica=entradaChica.next();
	     System.out.println("Existen " + CantidadApariciones(cadenaGrande, cadenaChica) + " apariciones del String en la cadena original");
	     String subCadena=InvertirCadena(cadenaChica);
	     System.out.println("Existen " + CantidadApariciones(cadenaGrande, subCadena) + " apariciones del String en la cadena original");

	}
	
	//Invierte una cadena
	public static String InvertirCadena(String cadena)
	{
		String resultado="";
		for (int i = cadena.length()-1; i >=0; i--)
		{
			resultado+= cadena.charAt(i);
		}
		return resultado;
	}
	//Cuenta la cantidad de apariciones de una cadena dentro de otra
	 public static int CantidadApariciones(String cadenaOrigen, String subCadena)
	 {
		 if(cadenaOrigen.isEmpty() || subCadena.isEmpty())
			 return 0;
		 else
		 {
			 int contador=0;
			 int index=0;
			 while(true)
			 {
				 index=cadenaOrigen.indexOf(subCadena, index);
				 if(index!=-1)
				 {
					 contador++;
					 index+=subCadena.length();
				 }
				 else 
					 break;
			 }
			 return contador;
		 }
	 }	 
}
