package utn;

import java.util.Scanner;

public class area_circulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Double A = sc.nextDouble();
		Double pi = 3.14159;
		Double X = A*A * pi;
		
		
		System.out.println("A=%.4f\n" + X);
 

	}

}
