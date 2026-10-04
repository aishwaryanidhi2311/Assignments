Question6: Palindrome Number
Write a Java program to check whether a given number is a palindrome using a loop.

Input:
1221

Expected Output:
1221 is a palindrome



package program8;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1221;
		int original = num;
		int Reverse = 0;
		for (; num>0;) 
		{
			int Digit = num%10;
			Reverse = (Reverse*10)+Digit;
			num = num/10;
		}
		if (Reverse==original) 
		{
			System.out.println(Reverse+ " This is Palindrome");
		}
		else 
		{
			System.out.println(Reverse+ " This not a Palindrome");
		}
	}	
}