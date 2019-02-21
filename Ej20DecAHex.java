//20-02-2019
//20:54
//Jesus Antonio Quezada Sanchez


import java.util.Scanner; //libreria para entrada de datos

public class Ej21DecAHex{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos

		System.out.print("Inserte un numero: ");
		int n=sc.nextInt(); //leemos el entero con nextInt
		String s = Integer.toHexString(n); //creo variable s para almacenar el hexadecimal y uso toHexString para convertir el entero en una cadena hexadecimal
		System.out.println("El numero que insertado en hexadecimal es: "+ s); 
	}
}