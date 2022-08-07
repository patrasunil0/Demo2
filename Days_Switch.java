package practice;

import java.util.Scanner;

public class Days_Switch {
	

	public static void main(String[] args) {
		
		System.out.println("Enter the Number: ");
		
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		
		switch(day) {
			case 1: 
			System.out.println("Todays is monday");
			break;
			case 2:
			System.out.println("Today is Tuesday");
			break;
			case 4:
			System.out.println("Today is Wednesday");
			case 5:
				System.out.println("Today is Thursday");
				break;
			case 6:
				System.out.println("Today is Friday");
				break;
			case 7 :
				System.out.println("Today is Saturday");
				break;
		default:
			System.out.println("Enter a proper Number");
		
		}
			
		
		
		

	}

}
