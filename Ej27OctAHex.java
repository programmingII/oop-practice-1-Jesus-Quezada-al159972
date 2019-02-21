//20-02-2019
//22:08
//Jesus Antonio Quezada Sanchez


import java.util.Scanner; //libreria para entrada de datos

public class Ej27OctAHex{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos
		System.out.print("Inserte un numero octal: ");
		String n=sc.nextLine(); //leemos la entrada y almacenamos en un string
		int dec=Integer.parseInt(n,8); //Convertimos a entero base 8 con parseInt
		System.out.println("El numero que insertado en hexadecimal es: "+ Integer.toHexString(dec)); //Convierto a cadena hexadecimal el entero y muestro en pantalla
	}
}