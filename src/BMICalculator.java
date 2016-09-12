import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner( System.in );
		
		double weight, length;
		double BMI;
		
		String sBMI;
		
		System.out.println("Gewicht in KG: ");
		
		weight = user_input.nextDouble();
		
		System.out.println("Lengte in meters: ");
		
		length = user_input.nextDouble();
		
		BMI = weight / (length * length);
		
		sBMI = String.format("%.2f", BMI);
		
		System.out.println("BMI: " +  sBMI);
		
	}
	
}
