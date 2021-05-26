package utn;
import java.util.Scanner;

public class Problema11338 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa por favor el tamaño de la escalera:");
		
		int tamanio = sc.nextInt(); //se guarda el numero ingresado
		
		if (tamanio >= 1 && tamanio <= 15) {
			
			for (int escalon=1; escalon<=tamanio; escalon++) { //inicia el bucle FOR que maneja la altura de la escalera
				
				for (int j=1; j<=escalon; j++) { //bucle interno que escribe un # depediendo en que escalon este por ej. ESCALON NRO 2 >>> escribe 2 Numerales - Cuando J vale mas que el numero de escalones termina el bucle
					
					System.out.print("#"); //sale un #
					
				}
				
				System.out.println(); //ingresa un salto de linea cuando ya salio del bucle interno
			} // fin del bucle principal 
			
		}else{
			System.out.println("Por favor ingresa un valor que este entre 1 y 15");
		}
		


	}

}
