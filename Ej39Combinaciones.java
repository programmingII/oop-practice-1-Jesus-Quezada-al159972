//27-02-2019
//21:45
//Jesus Antonio Quezada Sanchez

import java.util.Scanner; //Libreria para insercion de datos

public class Ej39Combinaciones{
    public static void main(String[] args) {
		int acumulador = 0;//Se  inicializa el acumulador en cero
	for(int a = 1; a <= 4; a++){ // ciclo for para obtener el primer digito del 1-4
	    for(int b = 1; b <= 4; b++){// ciclo for para obtener el segundo digito del 1 al 4
		for(int c = 1; c <= 4; c++){ //ciclo for para obtener el tercer digito del 1-4
		    if(c != a && c != b && a != b){//if que exluye a los numeros que son iguales
			acumulador++;// cada que se cumpla la condicion se ira sumando un 1 al acumulador
			System.out.println(a+ "" + b+ "" +c);//imprime cada cadena de numeros
		    }
		}
	    }
          }
	System.out.println("La cantidad de combinaciones logradas fueron: " +acumulador);//imprime el total de acumulaciones que se lograron

	}
}