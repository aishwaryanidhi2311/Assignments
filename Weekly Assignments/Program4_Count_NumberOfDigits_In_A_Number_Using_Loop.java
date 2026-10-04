Question 2: Count Digits
Write a Java program to count the number of digits in a given number using a while loop.

Input:
987654

Expected Output:
Number of digits = 6



package program4;

public class CountDigitsInANumberUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int num=987654;
		for(; num!=0; num/=10)
		{
			count++;
		}
		System.out.println(count);		
	}
}