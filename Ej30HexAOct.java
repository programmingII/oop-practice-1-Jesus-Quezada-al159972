//20-02-2019
//22:27
//Jesus Antonio Quezada Sanchez


import java.util.Scanner; //libreria para entrada de datos

public class Ej30HexAOct{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos
		System.out.print("Inserte un numero hexadecimal: ");
		String n=sc.nextLine(); //leemos la entrada y almacenamos en un string
		int dec=Integer.parseInt(n,16); // convierto a entero base 16
		System.out.println("El numero que insertado en octal es: "+ Integer.toOctalString(dec)); //Convierto a cadena octal y muestro en pantalla
	}
}