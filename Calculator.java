package practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float num1,num2;
		System.out.println("Enter the First Number:");
		Scanner n = new Scanner(System.in);
		num1 = n.nextFloat();
		System.out.println("Enter the second Number:");
		num2 = n.nextFloat();
		
		System.out.print("You have Entered");
		System.out.println(num1); 
		System.out.println("and");
		System.out.println(num2);
		
		System.out.println("Enter 0 for add, 1 for Sub, 2 for Multi, 3 for Divi");
		int input = n.nextInt();
		
		switch(input) {
			case 0 :
				System.out.print("Adding these number Result is ");
				System.out.println(num1+num2);
				break;
			case 1 :
				System.out.print("Subtracting these number Result is ");
				System.out.println(num1-num2);
				break;
			case 2 :
				System.out.print("Multiplying these number Result is ");
				System.out.println(num1*num2);
				break;
			case 3 :
				System.out.print("Dividing these number Result is ");
				System.out.println(num1/num2);
				break;
			default :
				System.out.println("Invalid Input");
			
		}

	}

}
