import java.util.Scanner;

public class IntToTimeDuration {

	public static void main(String[] args) {

		final long secondsInYear = 31556926;
		final long secondsInDay = 86400;
		final long secondsInHour = 3600;
		final long secondsInMinute = 60;

		@SuppressWarnings("resource")
		Scanner user_input = new Scanner( System.in );

		String number;
		long numberL;
		long year, day, hour, minute;

		System.out.println("Voer nummer in: ");

		number = user_input.next();

		try{
			numberL = new Long(number);
		}catch(NumberFormatException ex){
			numberL = (long) 10;
		}



		// Calculate years
		if(numberL >= secondsInYear){
			year = numberL / secondsInYear;
			numberL = numberL % secondsInYear;
			System.out.println("Years: " + year);
		}

		// Calculate days
		if(numberL >= secondsInDay){
			day = numberL / secondsInDay;
			numberL = numberL % secondsInDay;
			System.out.println("Days: " + day);
		}

		// Calculate hours
		if(numberL >= secondsInHour){
			hour = numberL / secondsInHour;
			numberL = numberL % secondsInHour;
			System.out.println("Hours: " + hour);
		}
		
		// Calculate minutes
		if(numberL >= secondsInMinute){
			minute = numberL / secondsInMinute;
			numberL = numberL % secondsInMinute;
			System.out.println("Minutes: " + minute);
		}

		// Leftover = seconds
		System.out.println("Seconds: " + numberL);




	}

}
