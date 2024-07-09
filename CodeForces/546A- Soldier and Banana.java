import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** thought process
         * so the soldier want to buy a banaka the pric of it is the : initial price * ith position
         * so the first input is the banana price , second is the soldier total dollar , the third is the number of banana
         * first we count the sum using sum formula of the total numbber of n
         * then we multipliy it with the bana price then we substract the soldier price
         *
         * */
        Scanner in = new Scanner(System.in) ;

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(new Solver().solve(a,b,c));


    }
    static class Solver {
        public static int solve(int bananaPrice , int initialmoney , int nbBanana ){
            int sum = nbBanana * (nbBanana+1) / 2 ;

            int totalprice = sum * bananaPrice ;

            int res = totalprice < initialmoney ? 0 : totalprice-initialmoney ;

            return res ;
        }
    }
}