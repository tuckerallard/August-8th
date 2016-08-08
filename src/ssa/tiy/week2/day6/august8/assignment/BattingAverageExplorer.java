package ssa.tiy.week2.day6.august8.assignment;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BattingAverageExplorer 
{
	
	public static void main(String[] args) 
	{
		boolean baseballPlayer = true;
		
		while(baseballPlayer == true)
		{
			DecimalFormat numberFormat = new DecimalFormat("#.000");
			
			System.out.println("How many at-bats did the player take?");
			Scanner baseball = new Scanner(System.in);
			double userInput = baseball.nextInt();
		
			if (userInput < 0)
			{
				System.out.println("The number you entered is invalid. Restarting program. Please enter a positive number next time.");
				continue;
			}
			
			else
			{
			System.out.println("The player was up at bat " + userInput + " times. How many times did they hit the ball?\n");
			}
			
			
			double userInputTwo = baseball.nextInt();
			
			if (userInputTwo < 0)
			{
				System.out.println("The number you entered is invalid. Restarting program. Please enter a positive number next time.\n");
				continue;
			}
			
			if (userInputTwo > userInput)
			{
				System.out.println("The number you entered is too high. Please enter a number lower than number of times at bat next time.\n");
				continue;
			}
			
			else
			{
				System.out.println("The player hit the ball " + userInputTwo + " times out out of " + userInput + " times at bat.\n");

			}
			
			System.out.println("How many bases did the player take in total?");
			double userInputThree = baseball.nextInt();
			
			if (userInputThree < 0)
			{
				System.out.println("The number you entered is invalid. Restarting program. Please enter a positive number next time.\n");
				continue;
			}
			
			else
			{
				System.out.println("The player took " + userInputThree + " bases.\n");
			}
			
			double battingAverage = ((userInputTwo/userInput)*100);
			double sluggingPercentage = ((userInputThree/userInput)*100);
			
			System.out.println("CURRENT PLAYER STATS:");
			System.out.println("The player's batting average is: " + (numberFormat.format(battingAverage)) + "%.");
			System.out.println("The player's slugging percentage is: " + (numberFormat.format(sluggingPercentage)) + "%.\n");
	
		}
	}
}
