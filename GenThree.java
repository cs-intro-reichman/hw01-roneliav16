/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
 
 
public class GenThree {
	public static void main(String[] args) {
		int Num1 = Integer.parseInt(args[0]);
		int Num2 = Integer.parseInt(args[1]);
		
		double Random = Math.random();
		Random = Random * (Num2 - Num1) + Num1;
		int intRandom1 = (int)Random;
		Random = Math.random();
		int intRandom2 = (int)(Random * (Num2 - Num1) + Num1);
		Random = Math.random();
		int intRandom3 = (int)(Random * (Num2 - Num1) + Num1);
		
		System.out.println(intRandom1);
		System.out.println(intRandom2);
		System.out.println(intRandom3);
		System.out.println("The minimal generated number was " + Math.min(Math.min(intRandom1,intRandom2),intRandom3));

	}
}
