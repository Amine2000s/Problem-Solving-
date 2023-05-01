import java.util.*;

public class BlackSquare {
	
	public static void main(String[]args ) {
		
		Scanner input = new Scanner(System.in);
		
		
		int []arr = new int[4];
		
		for(int i=0 ; i<4; i++ ) {
			
			arr[i] = input.nextInt();
			
		}
		
		String nmbrs = input.next();
		
		int kcal = 0 ; 
		
		char[] actuall_numbers = nmbrs.toCharArray();		
			
		
		for(int i =0 ; i < actuall_numbers.length ; i++) {
			
				int tmp = Integer.parseInt(String.valueOf(actuall_numbers[i])) ;
				

				
				kcal += arr[tmp-1];
				
				
			}
				
			System.out.println(kcal);
			
			
			
			
			
			
			
		}
		
		
	}
	

