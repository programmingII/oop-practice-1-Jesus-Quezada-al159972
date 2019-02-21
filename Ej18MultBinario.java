//20-02-2019
//20:50
//Jesus Antonio Quezada Sanchez


import java.util.Scanner; //libreria para entrada de datos

public class Ej18MultBinario{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos

		System.out.print("Inserte el primer numero binario: ");
		String n1=sc.nextLine(); //leemos los numeros binarios como strings
		System.out.print("Inserte el segundo numero binario: ");
		String n2=sc.nextLine();

		int entero1= Integer.parseInt(n1, 2); //con parseInt convertimos a entero base dos(Ya que se ocupa binario)
   		int entero2= Integer.parseInt(n2, 2);
		
		int result = entero1*entero2; //realizo la multiplicacion de enteros, declaro la variable de resultado hasta el momento en el que la usare
		System.out.println("El producto de los binarios "+ n1 + " x "+ n2 +" es: "+ Integer.toBinaryString(result)); //con toBinaryString convierto a binario y al mismo tiempo lo muestor en pantalla 
	}
}