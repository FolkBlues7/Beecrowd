package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1041 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		float x = scanner.nextFloat();
		float y = scanner.nextFloat();

		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0) {
			System.out.println("Eixo Y");
		} else if (y == 0) {
			System.out.println("Eixo X");
		} else if (x > 0) {
			if (y > 0) {
				System.out.println("Q1");
			} else {
				System.out.println("Q4");
			}
		} else if (y > 0) {
			System.out.println("Q2");
		} else {
			System.out.println("Q3");
		}
		
		/* A solution such as the example below 
		 * would do the trick, and is easier to read,
		 * but less efficient.
		if (x == 0 && y == 0) {
    		System.out.println("Origem");
		} else if (x == 0) {
    		System.out.println("Eixo Y");
		} else if (y == 0) {
    		System.out.println("Eixo X");
		} else if (x > 0 && y > 0) {
    		System.out.println("Q1");
		} else if (x < 0 && y > 0) {
    		System.out.println("Q2");
		} else if (x < 0 && y < 0) {
    		System.out.println("Q3");
		} else {
    		System.out.println("Q4");
		}
		 */
		

		scanner.close();

	}

}
