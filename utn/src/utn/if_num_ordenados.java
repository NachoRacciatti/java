package utn;

import java.util.Scanner;

public class if_num_ordenados {

	public static void main(String[] args) {
		

		Scanner sc =new Scanner(System.in);
		float X = sc.nextFloat();
		float Y = sc.nextFloat();
		
		if (X == 0.0 && Y == 0.0) {
			System.out.print("Origem\n");
		}else if (X == 0.0 && Y != 0.0) {
			System.out.print("Eixo Y\n");
		}else if (Y == 0.0 && X != 0.0) {
			System.out.print("Eixo X\n");
		}else if (X > 0.0 && Y > 0.0) {
			System.out.print("Q1\n");
		}else if (X < 0.0 && Y < 0.0) {
			System.out.print("Q3\n");
		}else if (X < 0.0 && Y > 0.0) {
			System.out.print("Q2\n");
		}else  {
			System.out.print("Q4\n");
		}
		

	}

}
