//27-02-2019
//21:55
//Jesus Antonio Quezada Sanchez

import java.util.Scanner; //Libreria para insercion de datos

import java.nio.charset.Charset; //importacion de libreria charset

public class Ej40Charset {//inicio del class
  	public static void main(String[] args) {//inicio del main
		System.out.println("List of available character sets: "); //impresion del mensaje en consola
    		for (String string : Charset.availableCharsets().keySet()) { //ciclo para imprimir todos los encodings disponibles
      			System.out.println(string);//impresion de cada uno de los encodings
    		}
	}
}