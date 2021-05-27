package utn;

import java.util.Scanner;

public class AliciaYlaMermeradaDeNaranja {

	public static void main(String[] args) {
		
		int mermelada = 0; //variable que indica la mermerada que comio Alicia
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa por favor la altura del tunel:");
		
		int altura = sc.nextInt();  //se guarda la altura ingresada
		
		
		for ( int i=0; i<altura; i++) { //bucle for donde va a pedir N numeros de parejas como N altura. Por ej.si la altura es 3 va a pedir 3 parejas 
			
			
			System.out.println("ingrese la primer pareja: "); 
			
			int parejaIzq = sc.nextInt(); 
			
			System.out.println("ingrese la segunda pareja: ");
			
			int parejaDer = sc.nextInt();  
			
			if(parejaIzq > parejaDer) { //bucle IF donde se valida cual es el frasco que tiene mas mermerada y lo suma a la variable "mermerada" donde se contabiliza el total
				mermelada += parejaIzq; 
			}else{
				mermelada += parejaDer;
			}
			

		}

		System.out.println(mermelada); //se imprime la cantidad maxima que Alicia pudo comer.


	}

}
