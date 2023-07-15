import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class aminsolu {
    public static void main (String[]args) {
	Scanner in = new Scanner(System.in);
	
	int n = in.nextInt();
	int x = in.nextInt();
	
	boolean check = true ;
	
	for(int i = 0 ; i<n ;i++){
		
		int t1 = in.nextInt();
;
		int t2 = in.nextInt();
		
		if(x==t1||x==7-t1||x==t2||x==7-t2) {
			
			check = false ; 
			
		}
	}
	
	if(check==false) {
		
		System.out.println("NO");
		
	}else {
		
		System.out.print("YES");
	}
	
	
	
}}
 	     	