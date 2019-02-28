//27-02-2019
//21:30
//Jesus Antonio Quezada Sanchez

import java.util.Scanner; //Libreria para insercion de datos

public class Ej38RevisarTexto{
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos

	System.out.println("Inserte algo de texto: ");//impresion en pantalla
	String Text=sc.nextLine();//Guardamos en un string

	char[]Cadena=Text.toCharArray(); //creacion de una arreglo de tipo char para almacenar el string
	        int letras = 0; 
		int espacios = 0;
		int numeros = 0;
		int otros = 0;//inicializamos todos los acumuladores q necesitaremos

		for(int i = 0; i < Text.length(); i++){ //se cra un for para hacer un bucle leyendo cada caracter del codigo
			if(Character.isLetter(Cadena[i])){ //lectura de letras en la cadena de texto
				letras ++ ; // incremento en la variable cada que encuentre una letra
			}
			else if(Character.isDigit(Cadena[i])){ //lectura de digitos en la cadena de texto
				numeros ++ ; // incremento en la variable cada que encuentre un numero
			}
			else if(Character.isSpaceChar(Cadena[i])){ //lectura de espacios en la cadena de texto
				espacios ++ ; //incremento en la variable cada que encuentre un espacio
			}
			else{ //lectura de cualquier otro caracter en la cadena de texto
				otros ++; // incremento en la variable cada que se encuentre un caracter distinto
			} 
		} 

	System.out.println("El texto es: "+Text);// impresion del texto original
	System.out.println("letras: " + letras); //impresion del total de letras
	System.out.println("Espacios: " + espacios); //impresion del total de espacios
	System.out.println("Numeros: " + numeros); // impresion del total de numeros
	System.out.println("Otros: " + otros); //impresion del total de otros caracteres
	}
}