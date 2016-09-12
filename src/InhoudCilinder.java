import java.util.Scanner;

public class InhoudCilinder {
	
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner( System.in );
		
		long sStraal, sHoogte;
		double inhoud;
		final double pi = 3.141592653;
		
		System.out.println("Voer de straal in: ");
		
		sStraal = user_input.nextInt();
		
		System.out.println("Voer de hoogte in: ");
		
		sHoogte = user_input.nextInt();

		System.out.println("Straal : " + sStraal + " Hoogte " + sHoogte);
		
		inhoud = sStraal * sStraal * pi * sHoogte;
		
		System.out.println("Inhoud van de cilinder: " +  inhoud);
		
	}

}
