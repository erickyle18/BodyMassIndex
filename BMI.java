//Read in user's weight in pounds and height in inches

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		//Create the scanner object
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int weight;
		int height;
		int BMI;
		
		
		//Prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		weight = input.nextInt();
		
		
		//Prompt the user to enter height in inches
		System.out.print("Enter height in inches: ");
		height = input.nextInt();
		
		
		//Calculate & Display BMI
		BMI = (weight * 703) / (height * height);
		System.out.printf("BMI: %d%n%n", BMI);
		
		//Print BMI values
		System.out.printf("%s%n", "BMI VALUES");
		System.out.printf("%s%n%s%n%s%n%s%n", "Underweight: less than 18.5",
											"Normal: between 18.5 and 24.9",
											"Overweight: between 25 and 29.9",
											"Obese: 30 or greater");
		
		
		
		
	}
}
