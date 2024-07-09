import java.util.;
import java.io.;
 
 
daaaaaaaanh hasing is so sos opowerful
public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null  !st.hasMoreTokens()) {
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
            String str = ;
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
            bw.append( + object);
        }
 
        public void println(Object object) throws IOException {
            print(object);
            bw.append(n);
        }
 
        public void close() throws IOException {
            bw.close();
        }
 
 
    }
 
    public static FastReader in;
    public static FastWriter out;
 
    public static long []arrn  ;
     public static long []arrm ;
 
    public static void main(String[] args) throws IOException {
 
        in = new FastReader();
        out = new FastWriter();
 
        int t = in.nextInt();
        for(int i=0;it;i++){
            int n = in.nextInt();
            int min = Integer.MAX_VALUE;
            for(int j=0;jn;j++) {
                int tr = in.nextInt();
                int sc = in.nextInt();
                min = Math.min(min , tr+(sc-1) 2);
                depart plus duuration minus one second since arriving at that time wont let you enter get out
 
            }
            out.println(min);
        }
        out.close();
 
 
    }
 
}