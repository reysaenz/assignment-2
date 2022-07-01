import java.util.Scanner;
import java.util.Random;
public class RandomNumberGuesser 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random num = new Random();
		RNG x = new RNG();
		int guess,answer,count,hg,lg;
		count =1;
		hg=100;
		lg=0;
		String replay = null;
		do
		{
			Scanner nice = new Scanner(System.in);
			answer = RNG.rand();
			System.out.println(answer);
			System.out.println("Enter your first guess:");
			guess = input.nextInt();
			System.out.println("number of guesses is "+count);
			if(guess == answer)
			{
				System.out.println("Cogradulations, you guessed correctly!");
				System.out.println("Try again? (yes or no)");
				replay = nice.nextLine();
			}
			else
			{
				count++;
				if(RNG.inputValidation(guess, lg, hg))
				{
					 if(guess >= lg && guess<answer)
					 {
						 lg=guess;
						 System.out.println("your guess is too low");
					 }
					 if(guess<=hg&& guess > answer)
					 {
						 hg= guess;
						 System.out.println("Your guess is too high");
					 }
					 System.out.println("Enter your next guess between "+lg+" and "+hg );
					 guess=input.nextInt();
					 System.out.println("Number of guesses is " +count);
					 if(guess == answer)
					 {
							System.out.println("Cogradulations, you guessed correctly!");
							System.out.println("Try again? (yes or no)");
							replay = nice.nextLine();
					 }
					 else
					 {
						 {
								count++;
								if(RNG.inputValidation(guess, lg, hg))
								{
									 if(guess >= lg && guess<answer)
									 {
										 lg=guess;
										 System.out.println("your guess is too low");
									 }
									 if(guess<=hg&& guess > answer)
									 {
										 hg= guess;
										 System.out.println("Your guess is too high");
									 }
									 System.out.println("Enter your next guess between "+lg+" and "+hg );
									 guess=input.nextInt();
									 System.out.println("Number of guesses is " +count);
									 if(guess == answer)
									 {
											System.out.println("Cogradulations, you guessed correctly!");
											System.out.println("Try again? (yes or no)");
											replay = nice.nextLine();
									 }
									 
								}
							}
					 }
				}
			}
		}while(replay.equals("yes"));
		System.out.println("Thanks for playing");
		System.out.println("Rey Saenz");
	}
	
}
