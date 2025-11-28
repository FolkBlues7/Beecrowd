package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1004 {

	public static void main(String[] args) throws IOException  {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		System.out.printf("PROD = %d%n", A*B);
		scanner.close();

	}

}
