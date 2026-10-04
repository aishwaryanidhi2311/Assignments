Question 2: Even or Odd Number
Write a Java program to check whether the given number 15 is even or odd.

Sample Output:
The number is odd.



package program5;

public class EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15;
		
		if(num%2==0)
		{
			System.out.println("The number is even.");
		}
		else
		{
			System.out.println("The number is odd.");
		}
	}
}