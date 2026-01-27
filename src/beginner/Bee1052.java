package beginner;

import java.util.Scanner;

public class Bee1052 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		short month = scanner.nextShort();
		
		String[] months = {
				"January", "February", "March", "April",
	            "May", "June", "July", "August",
	            "September", "October", "November", "December"
		};
		
		System.out.println(months[month - 1]);
		
		
		scanner.close();

	}

}
