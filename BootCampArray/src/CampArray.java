import java.util.Scanner;

public class CampArray
	{
public static void main(String[] args)
	{
		
		// challenge one
		
		Scanner numberOfTreats = new Scanner(System.in);
		
		System.out.println("Enter how many fav treats you have!");
		
		int numberOfTreatsOne = numberOfTreats.nextInt();
		
		String [] treatsArray = new String [numberOfTreatsOne];
		
		for(int i = 0 ; i < numberOfTreatsOne ; i++){
			
			Scanner nameOfTreat = new Scanner(System.in);
		
			System.out.println("Enter the name of your treat:");
			
			String treatName = nameOfTreat.nextLine();
			
			treatsArray [i] = treatName;
			
		}
		
		System.out.println("Your treats are: ");
		
		for( int i = 0 ; i < numberOfTreatsOne ; i++){
			
			System.out.println(treatsArray[i]);
		}
		
		
		// challenge two

		System.out.println("Youre going to enter eight numbers!");
		

		
		int eight = 8;
		
		int [] eightNumbersArray = new int [eight];
		
		for(int i = 0 ; i < eight ; i++){
			
			Scanner numbersInput = new Scanner(System.in);

			System.out.println("enter a number");
			
			int numberInputed = numbersInput.nextInt();
			
			eightNumbersArray [i] = numberInputed;
			
		}
		
		int numbersAdded = 0;
		
		for( int i = 0 ; i < eight ; i++){
			int slightlyAdded = numbersAdded + eightNumbersArray [i];
			
			numbersAdded = slightlyAdded;
			
		}
		
		System.out.println("All those numbers added together is: " + numbersAdded);
		
		
		// challenge three
		
		
	}


	}