import com.sun.source.tree.ContinueTree;

import java.util.*;
import java.io.*;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }


    }

    public static FastReader in;
    public static FastWriter out;

    public static void main(String[] args) {


        try {

            in = new FastReader();
            out = new FastWriter();
            long occur = 0 ;
            int c=0;
            int a =0 ;

            char[] s = in.nextLine().toCharArray();
            for(char v :s) {
                if (v == 'c') ++c;
            }
            for(int i=0 ;i< s.length;i++){
                if(s[i]!='b'){
                    if(s[i]=='a'){
                        ++a;
                    }

                    if(s[i]=='c'){
                        --c;
                    }

                    continue;
                };
                //for(int j = 0 ;j<i;j++)if(s[j]=='a')a++;
                //for(int j = i+1 ;j< s.length;j++)if(s[j]=='c')c++;
                occur+= (long)a * c ;
            }
            System.out.println(occur);

 //           out.print((Object) a);
            out.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}