//20-02-2019
//22:13
//Jesus Antonio Quezada Sanchez


import java.util.Scanner; //libreria para entrada de datos

public class Ej29HexABin{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos
		System.out.print("Inserte un numero hexadecimal: ");
		String n=sc.nextLine(); //leemos la entrada y almacenamos en un string
		int dec=Integer.parseInt(n,16); // convierto a entero base 16
		System.out.println("El numero que insertado en binario es: "+ Integer.toBinaryString(dec)); //Convierto a cadena binaria y muestro en pantalla
	}
}