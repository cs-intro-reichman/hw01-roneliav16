/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args){
		double num1 = Integer.parseInt(args[0]);
		double num2 = Integer.parseInt(args[1]);
		double num3 = Integer.parseInt(args[2]);
		System.out.println(num1 + " * x + " + num2 + " = " + num3);
		System.out.println("x = " + ((num3 - num2)/num1));
	}
}