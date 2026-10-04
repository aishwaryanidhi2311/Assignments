Question 4: Print Even and Odd Numbers
Write a Java program to print all even numbers and odd numbers between 1 and 20 using a loop.

Expected Output:
Even numbers:
2 4 6 8 10 12 14 16 18 20

Odd numbers:
1 3 5 7 9 11 13 15 17 19



package program6;

public class EvenAndOddNumbersBetween1And20UsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even numbers:");
		for (int i = 1; i <= 20; i++) 
		{
		     if (i % 2 == 0) 
		     {
		          System.out.print(i + " ");
	         }
	    }
		System.out.println("\n");   
        System.out.println("Odd numbers:");
		for (int i = 1; i <= 20; i++) 
		{
		     if (i % 2 != 0) 
		     {
		          System.out.print(i + " ");
             }
        }
	}
}