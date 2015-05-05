package dicegame;
import java.util.Scanner;
public class dicegame {

	public static void main(String[] args) 
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to Dicegame!!");
			dice ndice = new dice();
			String turn ="yes";
			int userguess;
			int cdice;
			while (turn.toLowerCase().equals("yes"))
			{
				cdice = ndice.throwdice();
				System.out.println("Enter dice number guess: ");
				userguess = input.nextInt();
				System.out.println("The Dice number is : "+cdice);
				System.out.println("Player guess is : "+userguess);
				if(cdice == userguess)
				{
					System.out.println("Correct!!");
				}else
				{System.out.println("wrong!!");
				}
				ndice.showhistory();
				ndice.history(cdice,userguess);
				System.out.println("Do you want to play again?(Yes/No); ");
				turn = input.next();

				} 
			}
			}
