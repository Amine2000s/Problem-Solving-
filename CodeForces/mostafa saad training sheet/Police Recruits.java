// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;



public class policeRecruits
 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int  array_size = input.nextInt();
        
        //input.nextLine ; 
        int [] array = new int[array_size] ;
        
        int nbr_of_crimes = 0;
        int cops = 0 ; 
        
        for(int i = 0 ; i < array_size ; i++){
            array[i] = input.nextInt();
        }
        
        for(int i = 0 ; i < array_size ; i++){
            if(array[i]==-1 && cops == 0){
                    nbr_of_crimes++;
            }else{        
                 if(array[i]>=1)
                    cops+=array[i];
                if(array[i]==-1)
                    cops--;
            }
        }
        System.out.println(nbr_of_crimes);
    }
    
    
   
}