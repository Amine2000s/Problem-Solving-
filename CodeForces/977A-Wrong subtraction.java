import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** thought process
         *
         * if last digit in non zero , it subtract a oe
         * if its is divied the number by 10
         * */
        Scanner in = new Scanner(System.in) ;
        int number = in.nextInt();
        int times  = in.nextInt();
        in.close();//this make a lot of diffrence
        System.out.print( Solver.solve(number,times));


    }
    static class Solver {
        public static int solve(int number , int times ){

                while(times-->0){
                    if(number%10!=0){
                        number --;
                    } else{
                        number = number / 10 ;
                    }
                }
            return number ;
        }
    }
}