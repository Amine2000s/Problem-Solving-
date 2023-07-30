import java.util.Scanner;

//a nextline forgoetten property herdtni lmaaao 

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N=  in.nextInt();
        int k = in.nextInt();

        String[] sline = new String[M];
        for(int i=0 ; i<M;i++){
            sline[i] = in.next();
        };
       /* for(int i=0;i<sline[0].length();i++){
            for(int j=0;j<2;j++){
                System.out.print(sline[0].charAt(i));
            }

        }*/
       /* for(int i=0 ; i<M;i++){
        System.out.println(sline[i]);

        }*/
        //for all string of the array of strings
        for(int i =0 ; i<M;i++){
            //amplifier k
            for(int v=0 ;v<k;v++){
                //for all charachters in M
                for(int j=0;j<N;j++){
                  //amplifier k
                    for(int s=0;s<k;s++){
                        System.out.print(sline[i].charAt(j));
                        }
                    }
                    System.out.print("\n");
                }
        }
       // System.out.println(sline[0]);

    }
}