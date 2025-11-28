package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1007 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();

		int weightedAverage = (A * B - C * D);

		System.out.printf("DIFERENCA = %d%n", weightedAverage);
		scanner.close();

	}

}
