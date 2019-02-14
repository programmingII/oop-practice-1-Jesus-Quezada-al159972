//14-02-2019
//12:19
//Jesus Antonio Quezada Sanchez

public class Ej14Bandera{
    public static void main(String[] args) {
	for (int i=0; i<=4; i++){ //for para crear primera parte de la bandera(Estrellas hay una secuencia en las estrellas)
		System.out.println("* * * * * * ============================");
		System.out.println(" * * * * *  ============================"); //tras estas dos lineas se vuelve a repetir, por eso se puede hacer con for
	}
	for (int i=0; i<=6; i++){ // for para la segunda parte de la bandera(Solo barras)
		System.out.println("========================================");
	}	
    }
}

