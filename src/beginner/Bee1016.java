package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1016 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int distance = scanner.nextInt();
		System.out.printf("%d minutos%n", distance * 2);

		scanner.close();

	}

}
