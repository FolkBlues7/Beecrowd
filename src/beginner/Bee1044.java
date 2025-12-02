package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1044 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();

		if (n1 > n2) {
			if (n1 % n2 == 0) {
				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");
			}
		} else if (n2 % n1 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		scanner.close();

	}

}
