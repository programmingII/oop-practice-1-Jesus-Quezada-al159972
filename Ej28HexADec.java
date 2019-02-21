//20-02-2019
//22:08
//Jesus Antonio Quezada Sanchez


import java.util.Scanner; //libreria para entrada de datos

public class Ej28HexADec{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos
		System.out.print("Inserte un numero hexadecimal: ");
		String n=sc.nextLine(); //leemos la entrada y almacenamos en un string
		System.out.println("El numero que insertado en hexadecimal es: "+ Integer.parseInt(n,16)); //Convierto a entero base 16 y muestro en pantalla
	}
}