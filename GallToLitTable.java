package practice;

public class GallToLitTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double gallons, liters;
		int counter;
		
		counter = 0;
		for(gallons = 1;gallons<=100;gallons++) {
			liters = 3.7854*gallons;
			System.out.println( gallons + " "+ "gallons is " + liters +"liters");
			
			counter++;
			if(counter == 10){
			System.out.println();
			counter =0;
		}
			
		}

	}

}
