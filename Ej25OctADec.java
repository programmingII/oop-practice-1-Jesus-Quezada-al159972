//20-02-2019
//21:58
//Jesus Antonio Quezada Sanchez


import java.util.Scanner; //libreria para entrada de datos

public class Ej25OctADec{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos
		System.out.print("Inserte un numero binario: ");
		String n=sc.nextLine(); //leemos la entrada y almacenamos en un string
		System.out.println("El numero que insertado en decimal es: "+ Integer.parseInt(n,8)); //Convierto a octal con toparseInt base 8
	}
}