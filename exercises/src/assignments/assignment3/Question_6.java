package assignments.assignment3;

public class Question_6 {

	public static void main(String[] args) {

		/*
		 * Scientists estimate that roughly 10 grams of caffeine consumed at one time is
		 * a lethal overdose.
		 * Write a program with a variable that holds the number of milligrams of
		 * caffeine in a drink and outputs how many drinks it takes to kill a person.
		 * 
		 * Sample Output
		 * Number of milligrams in drink: 500 
		 * It would take about 20 drinks for a lethal overdose
		 */
		
		int caffeineMilligrams=500;
		int lethalOverdose=10000;
		int drinksToKill=lethalOverdose/caffeineMilligrams;
		
		System.out.println("Number of milligrams in drink: "+ caffeineMilligrams);
		System.out.println("It would take about "+drinksToKill+ " drinks for a lethal overdose");
		

	}

}
