package utn;

import java.util.Scanner;

public class DIFERENCIA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		/*int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();*/
		int X = (int) (A / ((90 / 60.0) - (60 / 60.0)));
		
		
		System.out.println(X + " minutos");
 

	}

}
