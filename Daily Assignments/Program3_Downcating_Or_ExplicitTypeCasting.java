Question 3: Down Casting or Explicit Type Casting

Create a Java program that:
1.	Stores 10.75 in a double variable. 
2.	Explicitly typecasts it to an int variable. 
3.	Prints both values.



package program3;

public class DowncCastingOrExplicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value1=10.75;
		int value2=(int)value1;
		System.out.println(value1);
		System.out.println(value2);
	}
}