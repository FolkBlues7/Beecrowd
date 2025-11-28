package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1005 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		float A = scanner.nextFloat();
		float B = scanner.nextFloat();
		
		double weightedAverage = (A*3.5 + B*7.5)/11;
		
		System.out.printf("MEDIA = %.5f%n", weightedAverage);
		
		scanner.close();

	}

}
