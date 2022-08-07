package practice;


public class nested_ifelse {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 80, num3 = 45;
		if(num1>num2)
		
			if(num1>num3)
				System.out.println("Maximum Number : "+num1);
			else
				System.out.println("Maximum Number: " +num3);
		
		else
			if(num2>num3)
				System.out.println("Maximum Number :" +num2);
			else
				System.out.println("Maximum Number : "+num3);
					
	}
	
}

			