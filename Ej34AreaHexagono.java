//27-02-2019
//20:53
//Jesus Antonio Quezada Sanchez

import java.util.Scanner; //Libreria para insercion de datos

public class Ej34AreaHexagono{
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos
	System.out.println("Inserte el largo de un lado del hexagono: ");
	double n= sc.nextDouble(); //guardamos dato en un double para poder almacenar mas

	double area=(6*(n*n))/(4*Math.tan(Math.PI/6));// Nos apoyamos con algunas funciones de Math para obtener el area 

	System.out.println("The area of the exagon is: " + area); //imprimimos el area del hexagono
    }
}