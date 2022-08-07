package practice;

//import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
//		int num;
//		System.out.println("Enter any Number: ");
//		Scanner n = new Scanner(System.in);
//		num= n.nextInt();
		
		/* for loop syntax 
		 * for(st1;st2;st3){
		 * code}
		 * 
		 */
		
		//for(int i=1;i<11;i++)
			//System.out.println(num*i);
		
		/* for with break will break the loop after it came false.
		 * loop will close
		 */
		
//		for (int i=0;i<10;i++)
//			if(i>2) {
//				break;
//			}
//			else {
//			System.out.println(i);
//			}

/* for loo with continue clause the condition will skip the condition 
 * when condition will come true.
 */
		for (int i=0;i<10;i++) {
			if(i==2) {
			continue;
			}
		
		System.out.println(i);
		}
			
	}

}
