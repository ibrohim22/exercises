package assignments.lab1Questions;

public class Lab1_question1 {

	public static void main(String[] args) {

		/*
		 * Write a method that accepts a string and a non-negative number, and prints a
		 * larger string that is number copies of the original String
		 * 
		 * stringTimes("Hi", 2); = > HiHi stringTimes("Hi", 3); = > HiHiHi
		 * stringTimes("Hi", 1); = > Hi
		 */
		stringTimes("Hello", 3);

	}
	
	public static void stringTimes(String word, int num) {
		
		for (int i=1; i<=num; i++) {
			
			System.out.print(word);
		}
		
	}

}
