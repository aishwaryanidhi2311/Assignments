Question 1: Employee Details
Create a Java program to store and print the following employee details:
•	Employee ID
•	Age
•	Salary
•	Department Initial
•	Whether the employee is permanent

Use appropriate primitive data types.

Expected Output:
Employee ID: 1001
Age: 28
Salary: 55000.50
Department: T
Permanent: true



package program1;

public class EmployeeDetailsUsingPrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short employeeID=1001;
		System.out.println("Employee ID: "+employeeID);
		
		int age=28;
		System.out.println("Age: "+age);
		
		double salary=55000.50;
		System.out.println("Salary: "+salary);
		
		char department='T';
		System.out.println("Department: "+department);
		
		boolean permanent=true;
		System.out.println("Permanent: "+permanent);
	}
}