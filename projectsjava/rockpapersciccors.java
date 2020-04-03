package projectsjava;



import java.util.Random;
import java.util.Scanner;

public class rockpapersciccors {

	
	public static void main(String[] args) {
		String[] choice = {"Rock", "Paper", "Sciccors"};
		Random random = new Random();
		while(true) {
		Scanner sc = new Scanner(System.in);
		String yourChoice = sc.nextLine();
		int botChoice = random.nextInt((choice.length));
		System.out.println(choice[botChoice]);
	
		
		if((yourChoice.toLowerCase()).equals("rock") && (choice[botChoice]).equals("Rock"))
		{
			System.out.println("DRAW");
		}
		else if((yourChoice.toLowerCase()).equals("rock") && (choice[botChoice]).equals("Paper"))
		{
			System.out.println("PC WON");
		}
		else if((yourChoice.toLowerCase()).equals("rock") && (choice[botChoice]).equals("Sciccors"))
		{
			System.out.println("YOU WON");
		}
		else if((yourChoice.toLowerCase()).equals("paper") && (choice[botChoice]).equals("Rock"))
		{
			System.out.println("YOU WON");
		}
		else if((yourChoice.toLowerCase()).equals("paper") && (choice[botChoice]).equals("Paper"))
		{
			System.out.println("DRAW");
		}
		else if((yourChoice.toLowerCase()).equals("paper") && (choice[botChoice]).equals("Sciccors"))
		{
			System.out.println("PC WON");
		}
		else if((yourChoice.toLowerCase()).equals("sciccors") && (choice[botChoice]).equals("Rock"))
		{
			System.out.println("PC WON");
		}
		else if((yourChoice.toLowerCase()).equals("sciccors") && (choice[botChoice]).equals("Paper"))
		{
			System.out.println("YOU WON");
		}
		else if((yourChoice.toLowerCase()).equals("sciccors") && (choice[botChoice]).equals("Sciccors"))
		{
			System.out.println("DRAW");
		}
		
		if(yourChoice.equals("end")) 
		{
			break;
		}
		}
		
		
	}

}

