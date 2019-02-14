//07-02-2019
//13:26
//Jesus Antonio Quezada Sanchez

public class Ej15DosVariables{
    public static void main(String[] args) {
	int a=1, b=2, c=0;
	System.out.println("a=" + a + " b=" + b);
        c=a; a=b; b=c; //la variable c se usara como respaldo para guardar el valor de a
	System.out.println("a=" + a + " b=" + b);
    }
}