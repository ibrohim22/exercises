package assignments.assignment2;

public class Question6 {

	public static void main(String[] args) {
		
		/*Five friends are going to the theater. They have purchased a row of 
		 * five seats with an aisle on either end. Declare 5 String variables 
		 * and store their names. James doesn't want to sit next to Jill 
		 * Betty and Herb are dating and want to sit next to each other 
		 * Bob wants to sit on a left side aisle 
		 * James wants to sit on the aisle
		   Provide a seating order that conforms to the above rules.
		   An example of an invalid seating order is: 
		   James, Betty, Herb, Bob, Jill 
		   The above arrangement is invalid because: Bob is not sitting on the left aisle. 
   	       Specify the seating order as the names separated by commas and space 
	       (as in the above example). Use variables and print names in the right order.*/

		String James,Betty,Herb,Bob,Jill;
		James="James"; Betty="Betty";
		Jill="Jill";Bob="Bob";Herb="Herb";
		
		System.out.println(Bob+", "+ Jill+ ", "+ Herb+", "+Betty+", "+James);
		
	}

}
