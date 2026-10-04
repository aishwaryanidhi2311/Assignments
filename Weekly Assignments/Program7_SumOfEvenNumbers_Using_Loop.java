Question 5: Sum of Even Numbers
Write a Java program to find the sum of all even numbers between 1 and 50 using a loop.

Expected Output:
Sum of even numbers = 650



package program7;

public class SumOfEvenNumbersBetween1And50UsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=50;i++)
		{
			if(i % 2 == 0) 
			{
				sum += i;
			}
		}
         System.out.println("Sum of even numbers = "+sum));
	}
}