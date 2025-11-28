package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1008 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int employessNumber = scanner.nextInt();
		int workedHours = scanner.nextInt();
		double hourValue = scanner.nextDouble();

		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", employessNumber, workedHours * hourValue);

		scanner.close();
	}

}
