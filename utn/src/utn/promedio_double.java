package utn;

import java.util.Scanner;

public class promedio_double {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double X = ((A*2.0) + (B*3.0) + (C*5.0)) / 10;
		
		System.out.printf("MEDIA = %.1f\n", X);
 
 

	}

}
