package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1035 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();

		boolean c1 = b > c;
		boolean c2 = d > a;
		boolean c3 = (c + d > a + b);
		boolean c4 = c > 0;
		boolean c5 = d > 0;
		boolean c6 = a % 2 == 0;

		if (c1 && c2 && c3 && c4 && c5 && c6) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}

		scanner.close();
	}

}
