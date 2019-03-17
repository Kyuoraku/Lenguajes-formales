package uno;

import java.util.Scanner;

public class ActUno {

	public static Integer calcularLongitud(String aCalcular) {
		
		char[] c = aCalcular.toCharArray();
		
		Integer contador = 0;
		
		for(int i=0;i<c.length;i++) {
			
			contador++;
			
		}
		
		
		return contador;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la cadena: ");
		String cadena = sc.next();
		System.out.println("El largo de esta cadena es de "+ calcularLongitud(cadena));
		sc.close();
	}

}
