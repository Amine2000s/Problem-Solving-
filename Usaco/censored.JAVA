import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;


///censored word
public class Main {


    public static void   main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String t = in.nextLine();

        StringBuilder temp = new StringBuilder("");

        int index= 0;
        for(int i =0 ; i<s.length();i++){
            temp.append(s.charAt(i));
            System.out.println(temp);

            if(temp.length()>=t.length()){

                if(temp.substring(temp.length() - t.length()).equals(t)){
                    temp.delete(temp.length() - t.length(),temp.length());

                }else{}
                //index+=temp.length();
            }



        }

        System.out.println(temp);

    }
}




