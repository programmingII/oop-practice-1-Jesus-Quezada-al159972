//07-02-2019
//12:11
//Jesus Antonio Quezada Sanchez

import java.util.Scanner;

public class Ej5InputDosNumeros{
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.println("Inserte el primer numero:");
	int n1 = in.nextInt();
	System.out.println("Inserte el segundo numero:");
	int n2 = in.nextInt();
	System.out.println("El producto de ambos numeros es " + n1 * n2);
    }
}