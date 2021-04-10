package assignments.lab1Questions;

public class Lab1_question5 {

	public static void main(String[] args) {

		/*
		 * You are driving a little too fast, and a police officer stops you. Write a
		 * method to compute the result: 0=no ticket, 1=small ticket, 2=big ticket. If
		 * speed is 60 or less, the result is 0. If speed is between 61 and 80
		 * inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless
		 * it is your birthday -- on that day, your speed can be 5 higher in all cases.
		 * 
		 * caughtSpeeding(60, false) → 0 caughtSpeeding(65, false) → 1
		 * caughtSpeeding(65, true) → 0
		 * 
		 */

		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);
		caughtSpeeding(85, false);
		caughtSpeeding(85, true);
		caughtSpeeding(90, true);

	}

	public static void caughtSpeeding(int speed, boolean isBirthday) {

		if (speed<=60) {
			System.out.println("0");
		} else if(speed<=65 && isBirthday) {
			System.out.println("0");
		} else if(speed>=61 && speed<=80 ) {
			System.out.println("1");
		} else if (speed>=61 && speed<=85 && isBirthday) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
		
		
	}

}
