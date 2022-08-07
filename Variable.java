package practice;

public class Variable {
	public static void main(String[] arg) {
		int myVar1;
		int myVar2;
		myVar1 = 1024;
		System.out.println("myVar1 contains " + myVar1);
		myVar2 = myVar1 / 2;
		System.out.print("myVar2 contains myVar1 /2 :");
		System.out.println(myVar2);
		
		//Difference between int and double.
		
		int x;
		double y;
		x = 10;
		y = 10.00;
		
		System.out.println("Original value of x= " + x);
		System.out.println("Original Value of y= " + y);
		System.out.println();
		
		x = x / 4;
		y = y / 4;
		
		System.out.println(x);
		System.out.println(y);
		
		
	}
}
