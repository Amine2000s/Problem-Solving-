import java.io.*;
import java.util.Date.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
    	Scanner in = new Scanner(System.in); 
    	
    	int n = in.nextInt();
    	int[]arr = new int[n];
    	int s = 0;
    	for(int i =0 ;i<n ; i++) {
    		arr[i]= in.nextInt();
    		}
    	Arrays.sort(arr);
    	if(arr.length>2) {
    	for(int i =1 ; i< n-1 ;i++) {
    		
    		if(arr[i]>arr[0]&&arr[i]<arr[n-1])
    			s++;
    	
    	}
    	}
    	System.out.print(s);

    	
    	}
    	
       
}     
    

    	}
    	
       
}     
    
