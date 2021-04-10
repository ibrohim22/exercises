package assignments.lab1Questions;

public class Lab1_question4 {

	public static void main(String[] args) {

		/*
		 * The deers in VA spend most of the day playing. In particular, they play if
		 * the temperature is between 60 and 90. Unless it is summer, then the upper
		 * limit is 100 instead of 90. Write a method that accepts temperature and a
		 * boolean isSummer, prints true if the deers play and false otherwise.
		 *  
		 * deerPlay(70, false); - > true 
		 * deerPlay(95, false); - > false 
		 * deerPlay(95, true); - > true
		 */
		
		
		
		deerPlay(70, false);
		deerPlay(95, false);
		deerPlay(95, true);
		

	}

	public static void deerPlay(double degree, boolean isSummer) {

		if (degree>=60 && degree<=90) {
			System.out.println("true");
		}else if (degree>90 && degree<=100 && isSummer) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
			
		
	}

}
