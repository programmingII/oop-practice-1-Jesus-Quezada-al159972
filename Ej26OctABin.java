//20-02-2019
//22:04
//Jesus Antonio Quezada Sanchez


import java.util.Scanner; //libreria para entrada de datos

public class Ej26OctABin{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos
		System.out.print("Inserte un numero octal: ");
		String n=sc.nextLine(); //leemos la entrada y almacenamos en un string
		int dec=Integer.parseInt(n,8); //Convertimos a entero base 8 con parseInt
		System.out.println("El numero que insertado en binario es: "+ Integer.toBinaryString(dec)); //Convierto a cadena binaria el entero y muestro en pantalla
	}
}