import java.util.*;
import java.io.*;


//daaaaaaaanh hasing is so sos opowerful
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

    //public static long []arrn  ;
    // public static long []arrm ;

    public static void main(String[] args) throws IOException {

        in = new FastReader();
        out = new FastWriter();

        int n = in.nextInt();
        int a=0;
        int d=0;
        String s = in.nextLine();
        for(int i=0 ; i<n;i++) {
            if (s.charAt(i) == 'A') a++;
            if (s.charAt(i) == 'D') d++;
        }
        if(a>d)System.out.print("Anton");
        if(a<d)System.out.print("Danik");
        if(a==d)System.out.print("Friendship");
    }

}


