//07-02-2019
//13:01
//Jesus Antonio Quezada Sanchez

import java.util.Scanner; //Libreria para entrada de datos

public class Ej12Promedio{
    public static void main(String[] args) {
	int sum=0;
	Scanner in = new Scanner(System.in);
	for(int i=1; i<=3; i++){
		System.out.println("Inserte el " + i + " Numero");
		sum+=in.nextInt();
	}
        System.out.println("El promedio es " + sum/3);
    }
}