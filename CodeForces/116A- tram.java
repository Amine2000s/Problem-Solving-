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




    public static void main(String[] args) throws IOException {
        /** thought process
         *
         *  so we keep counting the max number of people who enter the tram mne lkher
         *
         *  */

        FastReader fr = new FastReader() ;

        int n = fr.nextInt();
        int result = 0,max=0 ;
        int a , b ;
        while(n-->0){
            a = fr.nextInt();
            b = fr.nextInt();

            result = Solver.solve(result,a,b);
            if(result>max) max = result ;
        }

        System.out.println(max);

      //  System.out.print( Solver.solve(original,reversed));


    }
    static class Solver {
        public static int solve(int result , int ai,int bi) {

            return result-ai+bi ;

        }
    }
}