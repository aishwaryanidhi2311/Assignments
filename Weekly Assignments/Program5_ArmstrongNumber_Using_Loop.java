Question 5: Armstrong Number
Write a Java program to check whether a number is an Armstrong number using loops.

Input:
153

Expected Output:
153 is an Armstrong number



package program5;

public class ArmstrongNumberUsingLoop {

    public static void main(String[] args) {

        int number = 153;
        int originalNumber = number;
        int sum = 0;

        for (; number > 0; number = number / 10) 
        {
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
        }
        
        if (sum == originalNumber) 
        {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
    }
}