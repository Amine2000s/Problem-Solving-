import java.io.*;
import java.util.Date.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
    	Scanner in = new Scanner(System.in); 
    	
    	int n = in.nextInt();
    	
    	int []arr = new int[n+1];
    	int []arr2 = new int [n+1];
    	
    	for(int i=1 ; i<= n ; i++) {
    		
    		arr[i] = in.nextInt();
    	}
    	
    	for(int i=1 ; i<= n ; i++) {
    		for(int j =1;j<=n ; j++) {
    			if(i==arr[j]) {
    				arr2[i]=j ; 
    				continue; 
    			}
    		}
    		
    		
    	}
    	for(int i=1 ; i<= n ; i++)
    	System.out.print(arr2[i]+" ");
    	
        };
      
    }
