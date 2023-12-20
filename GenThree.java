/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
 
 
public class GenThree {
	public static void main(String[] args) {
		// Gets 2 numbers from the user
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		// Check who is the min and max between the 2 numbers.
		int minNum = Math.min(num1, num2);
		int maxNum = Math.max(num1, num2);
		
		// In each 2 lines, the program create random number between the scale that the user wanted.
		double Random = Math.random();
		Random = Random * (maxNum - minNum) + minNum;
		int intRandom1 = (int)Random;
		Random = Math.random();
		int intRandom2 = (int)(Random * (maxNum - minNum) + minNum);
		Random = Math.random();
		int intRandom3 = (int)(Random * (maxNum - minNum) + minNum);
		
		System.out.println(intRandom1);
		System.out.println(intRandom2);
		System.out.println(intRandom3);
		System.out.println("The minimal generated number was " + Math.min(Math.min(intRandom1,intRandom2),intRandom3));

	}
}
