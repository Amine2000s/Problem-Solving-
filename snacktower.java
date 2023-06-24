import java.io.*;
import java.util.Date.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
    	Scanner in = new Scanner(System.in); 
    	
    	int n = in.nextInt();
    	int[]arr = new int[n+1];
    	int s = n ;
    	for(int i =0 ;i<n ; i++) {
    		int temp = in.nextInt();
    	
    		arr[temp]=1;
    		while(arr[s]==1) {
    			
    			System.out.print(s+" ");
    			s--;
    		}
    		System.out.println(" ");
    	}

    	
    	}
    	
       
}     
    
