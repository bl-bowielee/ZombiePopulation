//Bowie Lee

public class Zombies 
{
	private int totalDays;
	private long newZombies;
	private long runningTotal;
	private double estimatedGrowthRate;
	
	//displays or outputs days, zombies, and total zombies
	public void displayGrowth (int numberOfDays, int initialPopulation, double growthRate)
	{
		runningTotal = initialPopulation;
		estimatedGrowthRate = growthRate;
		totalDays = numberOfDays;

		System.out.println("");

		System.out.println("Starting with " + initialPopulation + " zombies and growing at " + growthRate + "%");
		System.out.println("");
		
		System.out.println("                  New           Total");
		System.out.println("  Day         Zombies         Zombies");
		System.out.println("===== =============== ===============");

		
		for (int i = 0; i < numberOfDays; i++) //display number of days 
		{
			int days = i + 1;
			
			newZombies = (long) (runningTotal * estimatedGrowthRate / 100);
		    runningTotal += newZombies;
		    
			System.out.printf("%,5d %,15d %,15d\n", days,newZombies,runningTotal);
		}
		
		System.out.println("");
		System.out.println("After " + numberOfDays + ", the zombie population will grow from " + initialPopulation + " to " + runningTotal);
//find way to put comma in runningTotal
	}
	
}
