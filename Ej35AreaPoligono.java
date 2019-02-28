//27-02-2019
//21:18
//Jesus Antonio Quezada Sanchez

import java.util.Scanner; //Libreria para insercion de datos

public class Ej35AreaPoligono{
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos
	System.out.println("inserte el numero de lados del poligono "); 
	int L = sc.nextInt(); //almacenamos en un int

	System.out.println("ingrese el largo de los lados: ");// mensaje en pantalla
	double largo= sc.nextDouble(); //lectura de un dato double

	double Area = (L*(largo*largo))/(4.0*Math.tan((Math.PI/L))); //operacion para obtener el area de un poligono apoyandonos de la clase math

	System.out.println("El area es: " + Area); //imprimimos el area
    }
}