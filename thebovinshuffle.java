import javax.management.openmbean.ArrayType;
import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int []pos = new int[N];
        int[]cowsid = new int[N];
        for(int i=0 ; i<N ;i++){
            pos[i]=in.nextInt()-1;
        }for(int i=0 ; i<N;i++){
            cowsid[i]=in.nextInt();
        }
        int []narr=new int[N];
        for(int i=0 ; i<N ;i++){
            narr[pos[i]]=cowsid[i];
        }

        for(int i=0 ; i<N ;i++){

            System.out.println(narr[i]);
        }
    }
}