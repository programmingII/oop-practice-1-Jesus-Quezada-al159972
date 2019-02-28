//27-02-2019
//20:53
//Jesus Antonio Quezada Sanchez

import java.util.Scanner; //Libreria para insercion de datos

public class Ej33SumaDigitos{
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos
	System.out.println("Inserte un numero entero"); //pedimos primer numero
	int n1 = sc.nextInt(); //guardamos el numero con sc
	int sum = 0;
        while (n1 != 0) { //crearemos un ciclo while para ir acumulando el valor 
            sum += n1 % 10; //repetiremos el %10 para ir tomando el valor de la primera cifra del numero hasta llegar a  0, y la acumularemos
            n1 /= 10; //aplicamos le mismo procedimiento para cambiar el valor de la variable
        }
        System.out.println("El resultado es " + sum); //imprimimos el acumulado
    }
}