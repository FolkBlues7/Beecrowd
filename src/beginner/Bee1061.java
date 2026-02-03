package beginner;

import java.util.Scanner;

//A much easier solution would the to use Java's DATE lib, check it out!

public class Bee1061 {

	public static void main(String[] args) {

		// first and last day's number
		int firstDay = 0;
		int lastDay = 0;

		// first day's information
		int beginHour = 0;
		int beginMinute = 0;
		int beginSecond = 0;

		// last day's information
		int lastHour = 0;
		int lastMinute = 0;
		int lastSecond = 0;

		// result
		int totalDuration = 0; // will storage the duration in seconds
		int dayDuration = 0;
		int hourDuration = 0;
		int secondDuration = 0;

		// will help us to transform it back to hours and minutes
		int aux = 0;

		String input = "";

		Scanner scanner = new Scanner(System.in);

		// gets the starting day
		input = scanner.nextLine();
		input = input.replaceAll("\\D", "");
		firstDay = Integer.parseInt(input);

		// gets firt's day time
		input = scanner.nextLine();
		input = input.replaceAll("\\D", "");

		// process the first day's input and transform it in hours, minutes and seconds.
		// We transform hours and minutes to seconds here.
		beginHour = Integer.parseInt(input.substring(0, 2)) * 3600;
		beginMinute = Integer.parseInt(input.substring(2, 4)) * 60;
		beginSecond = Integer.parseInt(input.substring(4, 6));

		// gets the last day
		input = scanner.nextLine();
		input = input.replaceAll("\\D", "");
		lastDay = Integer.parseInt(input);

		// gets last day's time
		input = scanner.nextLine();
		input = input.replaceAll("\\D", "");

		// process the first day's input and transform it in hours, minutes and seconds.
		// We transform hours and minutes to seconds here.
		lastHour = Integer.parseInt(input.substring(0, 2)) * 3600;
		lastMinute = Integer.parseInt(input.substring(2, 4)) * 60;
		lastSecond = Integer.parseInt(input.substring(4, 6));

		totalDuration = lastDay - firstDay; // the bigger comes first, so the result is never negative
		totalDuration = totalDuration * 24 * 3600; // now we transform it to seconds. Each day has 24 hours, each hours
													// 60 minutes and each minute 60 seconds

		totalDuration -= beginHour + beginMinute + beginSecond; // now we subtract the time that passed before the event
																// started in the first day

		totalDuration += lastHour + lastMinute + lastSecond; // now we add the remaining day that the event lasted in
																// the last day

		// Now, we just need to transform it all to the expected input in Beecrowd!

		dayDuration = (totalDuration / 3600) / 24;
		System.out.printf("%d dia(s)%n", dayDuration);

		totalDuration -= dayDuration * 24 * 3600; // remove the days
		hourDuration = totalDuration / 3600;
		System.out.printf("%d hora(s)%n", hourDuration);

		totalDuration -= hourDuration * 3600; // remove the hours
		secondDuration = totalDuration / 60;
		System.out.printf("%d minuto(s)%n", secondDuration);

		totalDuration -= secondDuration * 60;
		System.out.printf("%d segundo(s)%n", totalDuration);

		scanner.close();

	}

}
