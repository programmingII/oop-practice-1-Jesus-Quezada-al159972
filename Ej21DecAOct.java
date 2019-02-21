//20-02-2019
//21:19
//Jesus Antonio Quezada Sanchez


import java.util.Scanner; //libreria para entrada de datos

public class Ej21DecAOct{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos

		System.out.print("Inserte un numero: ");
		int n=sc.nextInt(); //leemos el entero con nextInt
		System.out.println("El numero que insertado en hexadecimal es: "+ Integer.toOctalString(n)); //Convierto a octal con una funcion parecida al ej anterior pero ahorro una variable
	}
}