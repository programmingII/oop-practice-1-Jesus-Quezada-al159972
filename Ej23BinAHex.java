//20-02-2019
//21:43
//Jesus Antonio Quezada Sanchez


import java.util.Scanner; //libreria para entrada de datos

public class Ej23BinAHex{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos
		System.out.print("Inserte un numero binario: ");
		String n=sc.nextLine(); //leemos la entrada y almacenamos en un string
		int dec=Integer.parseInt(n,2); //convertimos primero a entero (Funcion de ej. anterior)
		System.out.println("El numero que insertado en hexadecimal es: "+ Integer.toHexString(dec)); //Convierto a hexadecimal con toHexString
	}
}