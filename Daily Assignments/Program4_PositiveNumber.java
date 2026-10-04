Question 1: Positive Number
Write a Java program to check whether the given number 10 is positive or negative.

Sample Output:
The number is positive.



package dailyAssignment;

public class Program_PositiveNagitiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		if(num>0)
		{
			System.out.println("The number is positive.");
	
		}
		else if(num<0)
		{
			System.out.println("The number is Negative.");
		}
		else
		{
			System.out.println("The number is zero.");
		}
	}
}