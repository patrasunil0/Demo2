package practice;

/*Demonstrate For conditional statement 
 * for(Initialization; Conditions; Iteration)
 */
public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count;
		for(count = 0; count < 5; count = count+1) 
			/*; not write as counting will happen
			 * count = count+1 is written as count++ and for decrement operator count--
			 */									
		System.out.println("This is Count: " + count);
        System.out.println("Done!");
		
	}

}
