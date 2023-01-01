package gui;
 import java.util.*;
 import java.util.Stack;

public class ValidarParentesis 
{
	static char [] abiertos = {'{','(','['};
	static char [] cerrados = {'}',')',']'};
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		//Leemos la cadena introducida por el usuario
		String expresion=scanner.next();
		char[] caracteres= expresion.toCharArray();
		//Creo una pila para ir adicionando los caracteres e ircomprobando
		Stack<Character>pila=new Stack<>();
		
		boolean salida=true;
		
		if(caracteres.length==0)
			System.out.println("Cadena Valida");
		else if(caracteres.length % 2 !=0)
			System.out.println("Cadena Invalida");
		else
		{
			for (int i = 0; i < caracteres.length; i++) 
			{
				if(EstaAbierto(caracteres[i]))
				{
					pila.push(caracteres[i]);
				}
				else
				{
					if(pila.isEmpty())
					{
						salida=false;
						break;
					}
					else if(pila.peek()!=ObtenerCaracterInverso(caracteres[i]))
					{
						salida=false;
						break;
					}
					else pila.pop();
				}
			}
			if(!pila.isEmpty())
				salida=false;
			if(salida)
				System.out.println("Cadena Valida");
			else
				System.out.println("Cadena Invalida");		
		}
	}
	
	//Para conocer si el caracter de la posicion es abierto
	public static boolean EstaAbierto(char c)
	{
		for (int i = 0; i < abiertos.length; i++) 
		{
			if(abiertos[i]==c)
			{
				return true;
			}
		}
		return false;
	}
	
	//Para obtener la inversa de un caracter
	public static char ObtenerCaracterInverso(char c)
	{
		//Con este encuentro el inverso de un caracter abierto
		for (int i = 0; i < abiertos.length; i++)
		  {
			if(abiertos[i]==c)
				return cerrados[i];
		  }
		//Con este encuentro el inverso de un caracter cerrado
		for (int i = 0; i < cerrados.length; i++)
		  {
			 if(cerrados[i]==c)
				return abiertos[i];
		  }
		return ' ';
	}

}

