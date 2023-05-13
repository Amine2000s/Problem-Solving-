import java.util.*;

import org.w3c.dom.Node;



class Games{
		
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		int one_shovel_price = input.nextInt();
		
		int change = input.nextInt();
		
		
		int times = 0 ;
		
		int price = 0 ; 
		while(true) {
			
			times++;
			
			price = one_shovel_price * times ;
			
			if(price % 10 == 0 || price % change == 0)
				break;
			
			
			
			
			
		}
		
		System.out.print(times );
		
		
		
		
		
		input.close();
	}
	
	
	
}
