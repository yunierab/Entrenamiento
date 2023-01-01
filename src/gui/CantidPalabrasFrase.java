package gui;
import java.util.Iterator;
import java.util.Scanner;


public class CantidPalabrasFrase {

	public static void main(String[] args)
	{
		//Scanner scanner=new Scanner(System.in);
		//String cadena=scanner.next();
        ContadorPalabras();
        ContadorDigitos();
	}
	
    static void ContadorPalabras()
	{
	   String frase="  Yo soy     Yunier  ";
	    frase=frase.trim();
		frase=frase.replaceAll("\s+"," ");
		String[]palabras=frase.split(" ");
		System.out.println("La cadena tiene " + palabras.length + " palabras");
	}
    
    static void ContadorDigitos()
	{
	   String frase="da1d2addad3ad45ad67d8";
	   int contador=0;
	   char []arreglo=frase.toCharArray();
	  for (int i = 0; i < arreglo.length; i++)
	  { 
		  if(Character.isDigit(arreglo[i]))
			  contador++;  
	  }
	  System.out.println("La cadena tiene " + contador + " digitos");
	}

}
