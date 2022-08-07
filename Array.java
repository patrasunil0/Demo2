package practice;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arrays is the collection of various variable data in one place.
		
//		int [] marks = {1,2,3,5};
//		marks[3] = 34; 						//value opdated in the place if 3 which is from 5 to 34
//		System.out.println(marks[2]);		 //[2] is the value position
//		System.out.println(marks[3]); 
//		
		// to print all value in the arrays 
		// by classical method
		
//		for (int i=0;i<marks.length;i++) {     //marks.length indicate the all value stored in the arrays
//			System.out.println(marks[i]);
//		}
//			System.out.println("This is printed by for each loop method");
//		//by for each loop method
//		for (int values:marks) {
//			System.out.println(values);
//		}
		
		//Two dimensional array
//		
//		int [][] age = {{67,65,1},{12,34,76}};
//		
//		System.out.println(age[0][2]); //first [0] is the first bracket value and 2nd [2] is the place value
//		
//		String [] name = {"Harish","sunil","Susri","Jhuma"};
//		for(String values:name) {
//			System.out.println(values);
//		}
//		
		
		// try catch using
		
		String [] name = {"Harish","sunil","Susri","Jhuma"};
		try {	
		System.out.println(name[4]);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Hello will print if you use try catch");
		
	}

}
