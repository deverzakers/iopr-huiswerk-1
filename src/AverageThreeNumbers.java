import java.util.Scanner;

public class AverageThreeNumbers {

	public static void main (String[] args){
		
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner( System.in );
		
		int number1, number2, number3;
		double average;
		
		System.out.println("Eerste getal: ");
		
		number1 = user_input.nextInt();
		
		System.out.println("Tweede getal: ");
		
		number2 = user_input.nextInt();
		
		System.out.println("Derde getal: ");
		
		number3 = user_input.nextInt();

		average = (number1 + number2 + number3) / 3.0;
		
		System.out.println("Gemiddeld: " +  average);
		
	}
	
}
