Question 1: ASCII value of characters
Write a Java program to print the ASCII value of the following characters:
•	A 
•	a 
•	0 
•	@ 

Expected Output:
ASCII value of A = 65
ASCII value of a = 97
ASCII value of 0 = 48
ASCII value of @ = 64



package program1;

public class AsciiValueOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alpha1='A';
		int num=alpha1;
		System.out.println("ASCII Value of A = "+num);
		
		char alpha2='a';
		int num1=alpha2;
		System.out.println("ASCII Value of a = "+num1);
		
		char alpha3='0';
		int num2=alpha3;
		System.out.println("ASCII Value of 0 = "+num2);
		
		char alpha4='@';
		int num3=alpha4;
		System.out.println("ASCII Value of @ = "+num3);
	}
}