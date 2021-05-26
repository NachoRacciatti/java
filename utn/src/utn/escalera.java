package utn;

import java.util.Scanner;

public class escalera {

	public static void main(String[] args) {
		

		Scanner keyboard = new Scanner(System.in);
		System.out.println("escalones");
		int number = keyboard.nextInt();
		for (int  e=1; e<=number; e++) {
			for (int j=1; j<1+e;j++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}