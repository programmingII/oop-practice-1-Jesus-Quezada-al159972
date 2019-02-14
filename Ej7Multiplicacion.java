//07-02-2019
//12:35
//Jesus Antonio Quezada Sanchez

import java.util.Scanner;

public class Ej7Multiplicacion{
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.println("Inserte un numero:");
	int n = in.nextInt();
	for(int i=1; i<=10; i++){
		System.out.println(n + " * " + i + "= " + (n*i));
	}
    }
}