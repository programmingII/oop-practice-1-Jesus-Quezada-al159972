//27-02-2019
//21:30
//Jesus Antonio Quezada Sanchez

import java.util.Scanner; //Libreria para insercion de datos

public class Ej37Reversa{
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos

	System.out.println("Inserte algo de texto");
	String Cadena= sc.nextLine(); // lectura de caracteres
	
	StringBuilder builder=new StringBuilder(Cadena);//se guarda la cadena en un objeto stringbuilder
	String str2=builder.reverse().toString();//se llama al metodo reverse del objeto builder para guardar alrevez la cadena en otro string
	System.out.println("Reverse string: " + str2); //se imprime la cadena 2
    }
}