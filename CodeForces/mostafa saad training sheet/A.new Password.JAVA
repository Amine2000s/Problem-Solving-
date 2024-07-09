import java.io.*;
import java.util.Date.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
    	Scanner in = new Scanner(System.in); 
    	
    	int length = in.nextInt();
    	int nofDistinct = in.nextInt() ; 
    	
    	ArrayList <Character> list1 = new ArrayList <>();
    	ArrayList <Character> list2 = new ArrayList <>();
    	
    	for(int i = 97 ; i<97+nofDistinct ; i++) {
    		
    		list1.add((char)i);
    		
    	}
    	
    	int j = 0 ; 
    	
    	for(int i = 0 ; i<length ; i++) {
    		
    		//list1.add((char)i);
    		if(j<list1.size()) {
        		list2.add(list1.get(j));

    			
    		}else {
    			j=0;
    			list2.add(list1.get(j));
    			//j++;
    		}
    		//list2.add(list1.get(j));
    		j++;
    		
    	}
    	for(int i = 0 ; i <list2.size();i++)
    	System.out.print(list2.get(i));
        };
      
    }
