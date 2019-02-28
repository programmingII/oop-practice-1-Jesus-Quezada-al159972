//27-02-2019
//21:18
//Jesus Antonio Quezada Sanchez

import java.util.Scanner; //Libreria para insercion de datos

public class Ej36Distancia{
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos
	System.out.println("Ingrese la latitud de la coordenada 1: ");
        double Lat1 = sc.nextDouble();

        System.out.println("Ingrese la longitud de la coordenada 1: ");
        double Long1 = sc.nextDouble();

        System.out.println("Ingrese la latitud de la coordenada 2: ");
        double Lat2 = sc.nextDouble();

        System.out.println("Ingrese la longitud de la coordenada 2: ");
        double Long2 = sc.nextDouble(); //insercion de datos en variables double

	
	double R=6371.01; //radio de la tierra
	
	//conversion a radianes de todas las variables
	Lat1= Math.toRadians(Lat1);
	Long1= Math.toRadians(Long1);
	Lat2= Math.toRadians(Lat2);
        Long2=Math.toRadians(Long2);

	double RF= R*Math.acos(Math.sin(Lat1)*Math.sin(Lat2)+ Math.cos(Lat1)*Math.cos(Lat2)*Math.cos(Long1-Long2));//Operacion que nos dara el resultado entre dos puntos apoyandonos de la clase math)

	System.out.println("La distancia entre los puntos es de: " + RF +" KM");//impresion del resultado
    }
}