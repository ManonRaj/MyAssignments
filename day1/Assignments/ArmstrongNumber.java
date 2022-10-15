package week1.Assignments;

public class ArmstrongNumber {	

	public static void main(String[] args) {
		
		int number = 153, calculated=0, originalNumber, remainder;

		originalNumber = number;

		while (originalNumber != 0)
		{
			remainder = originalNumber % 10;
			calculated += Math.pow(remainder, 3);
			originalNumber /= 10;
		}

		if(calculated == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");
	}
	// Declare your input
	//int calculated,remainder,original=153;
	// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
	// Assign input into variable original 

	// Use loop to calculate: use while loop to set condition until the number greater than 0
	// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
	// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
	// Within loop: Add calculated with the cube of remainder & assign it to calculated
	// Check whether calculated and original are same
	//When it matches print it as Armstrong number


}


