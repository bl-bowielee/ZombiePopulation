//Bowie Lee

import java.util.Scanner;

public class ZombiePopulation 
{
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner(System.in);
		Zombies ZP = new Zombies();

		int initialPopulation;
		double growthRate;
		int numberOfDays;

		//initial zombie population
		do {
			System.out.print("Enter starting zombie population: ");
			initialPopulation = scan.nextInt();

			if (initialPopulation < 2) {
				System.out.println("Error: Starting population must be at least 2");
			}
		} while (initialPopulation < 2);

		//growth rate
		do {
			System.out.print("Enter zombie growth rate% (example 2.5): ");
			growthRate = scan.nextDouble();

			if (growthRate < 0) {
				System.out.println("Error: Zombie Growth Rate must be at least 0.0");
			}
		} while (growthRate < 0);

		//how many days
		do {
			System.out.print("Enter number of days for predictor to run: ");
			numberOfDays = scan.nextInt();

			if (numberOfDays < 1) {
				System.out.println("Error: number of days for predictor must be at least 1");
			}
		} while (numberOfDays < 1);

		scan.close();
				
		ZP.displayGrowth(numberOfDays, initialPopulation, growthRate);
		
	}
}
