Question 2: Product Details

Create a Java program with the following variables:
•	Product Price = 499.50
•	Quantity = 3

Calculate the total price using the variables and print:

Product Price: 499.50
Quantity: 3
Total Price: 1498.50


package program2;

public class ProductDetailsUsingVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float productPrice=499.50F;
		int quantity=3;
		float price=productPrice*quantity;
		
		System.out.println("Product Price: "+productPrice);
		System.out.println("Quantity: "+quantity);
		System.out.println("Total Price: "+price);
	}
}