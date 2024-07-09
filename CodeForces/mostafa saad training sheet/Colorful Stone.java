
import java.util.*;

import org.w3c.dom.Node;



public class Games{
		
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		String s1,s2 ; 
		
		s1 = input.nextLine();
		
		s2 = input.nextLine();
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		int i,j;
		i = j = 0 ;
		while(i < s1.length()) {
			while(j < s2.length()) {
				if(c1[i]==c2[j]) {
					i++;
				}
				j++;
				
				
			}
			if(j == s2.length() )
				break;
		
		
		}
		//System.out.println(s1);
		System.out.println(i+1);

		
		input.close();
	}
	
	
	
}
