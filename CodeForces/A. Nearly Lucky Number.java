import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {

                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }




    public static void main(String[] args) {
        /** thought process
         *
         * nearly lucky digit is a number of lucky digits in it is a lucky a number
         * in darija (lazm ykon kayan rab3a rab3at wela 7 raba3at , same with sab3a )
         *
         * */

        FastReader fr = new FastReader();

        long input = fr.nextLong();


        System.out.print( Solver.solve(input));


    }
    static class Solver {
        public static String solve(long input) {

            long luckynumber = 0 ;

            while(input!=0){

                long rem = (input % 10);

                if(rem==7 || rem ==4){

                    luckynumber++;

                }
                
                input = input / 10 ;

            }

            if (luckynumber == 4 || luckynumber == 7 ){
                return "YES" ;
            }


            return "NO";
        }
    }
}