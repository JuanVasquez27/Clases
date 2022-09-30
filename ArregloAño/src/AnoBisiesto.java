import java.util.Scanner;

public class AnoBisiesto {
	
	int ano;
	
	Scanner entrada = new Scanner(System.in);
	
	public void Entradaaño() {
		System.out.println("Programa para determinar si el año es biciesto");
		System.out.println("Ingrese el año a evaluar");
		ano = entrada.nextInt() ;
	}
	
	public void proceso() {
		if ((ano % 4 ==0) && (ano + 100 != 0 || ano % 400 == 0)) {
			System.out.println(ano+ " es un año bisiesto");
		} 
		else {
			System.out.println(ano+ " no es un año bisiesto");
			}
	}
	public static void main(String[] args) {
		AnoBisiesto fc = new AnoBisiesto();
		fc.Entradaaño();
		fc.proceso();
		
	}




}


