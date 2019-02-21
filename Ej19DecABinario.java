//20-02-2019
//20:50
//Jesus Antonio Quezada Sanchez


import java.util.Scanner; //libreria para entrada de datos

public class Ej19DecABinario{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos

		System.out.print("Inserte un numero: ");
		int n=sc.nextInt(); //leemos el entero con nextInt
		System.out.println("El numero que insertado en binario es: "+ Integer.toBinaryString(n)); //con toBinaryString convierto a binario y al mismo tiempo lo muestor en pantalla 
	}
}