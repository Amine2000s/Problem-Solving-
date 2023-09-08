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
 
 
        int t = in.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            float a = in.nextLong();
            float b = in.nextLong();
            float c = in.nextLong();
 
 
            float min = Math.min(a, b);
            float diff = ((a+b)/2);
            /*if (((a + b) % 2) != 0) {
                diff++;
            }*/
            float g = diff - min;
            int times = (int)(g / c);
 
 
            if((g%c) !=0)times++;
            //System.out.println("times is " +times);
 
            //if (times % (float)c != 0) times++;
            arr[i]=(int)times;
        }
        for (int i = 0; i < t; i++) System.out.println(arr[i]);
 
    }
}