import java.util.Scanner;

/*
 * Session 3 : OOPs class & objects Assignment 
–
To calculate square root and cube root of a 
number in Java.
 * Expected Output
Should print the square root and cube root of a given number.
 */
public class CalculateSqrtCubeRoot {

	public static void main(String[] args) {
		int num = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num = s.nextInt();
		System.out.println("Square root of "+num+" is "+Math.sqrt(num));
		System.out.println("Cube root of "+num+" is "+Math.cbrt(num));
		s.close();
	}

}
