//27-02-2019
//19:47
//Jesus Antonio Quezada Sanchez

import java.util.Scanner; //Libreria para insercion de datos

public class Ej32Comparacion{
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); //creamos un objeto scanner para entrada de datos
	System.out.println("Inserte el primer numero entero"); //pedimos primer numero
	int n1 = sc.nextInt(); //guardamos primer numero con sc
	System.out.println("Inserte el segundo numero entero");//lo mismo de arriba
	int n2 = sc.nextInt();
	if(n1 != n2){ //condicion para verif. si son diferentes o iguales los numeros
		System.out.println(n1 + "!=" + n2); // imprimo q son diferentes si lo son
		if(n1<n2){ //condicion para verificar cual es mas alto
			System.out.println(n1 + "<" + n2); //imprimo segun el resultado de la condicion
			System.out.println(n1 + "<=" + n2);
		}else{
			System.out.println(n1 + ">" + n2);
			System.out.println(n1 + ">=" + n2);
		}
	}else{
		System.out.println(n1 + "=" + n2); //imprimo q son iguales
	}
	
    }
}