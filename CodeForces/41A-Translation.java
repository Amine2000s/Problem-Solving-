import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
/*
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



*/
    public static void main(String[] args) throws IOException {
        /**
         * reverse a string
         *
         * */

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String original = bfr.readLine();
        String reversed = bfr.readLine();


        System.out.print( Solver.solve(original,reversed));


    }
    static class Solver {
        public static String solve(String original , String reversed) {

            if(original.length()!=reversed.length()) return "NO";

                for(int i=0;i<original.length();i++){
                    if(original.charAt(i)!=reversed.charAt(original.length()-i-1)) return "NO";
                }

            return "YES";

        }
    }
}