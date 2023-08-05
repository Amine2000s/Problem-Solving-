import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Character> alphabets = new ArrayList<>();
        ArrayList<char[]> words = new ArrayList<>();
        for(int i=0;i<26;i++){
            alphabets.add((char) (i+97));

        }
        int [] occur = new int[26];
        int N = in.nextInt();
        ArrayList<String> lists = new ArrayList<>();
        for(int i=0;i<=N;i++) lists.add(in.nextLine());         //lists.add(in.nextLine());


        System.out.print("=========================================");
        for(int i=0;i<=N;i++)System.out.println(lists.get(i));

        for(int i =0 ; i <=N ; i++){

            HashSet<Character> set = new HashSet<>();
            for(int j =0 ;j < lists.get(i).length();j++)set.add(lists.get(i).charAt(j));

            Object [] sets = set.toArray();
            for(int h=1;h< sets.length;h++)occur[alphabets.indexOf(sets[h])]++;
                //System.out.println(alphabets.indexOf((Character) sets[h]));
               // occur[alphabets.indexOf((Character) sets[h])]++;
            //occur[alphabets.indexOf((Character) sets[h])]++;
            set.clear();
        }
        for(int i=0;i<26;i++){
            System.out.println(occur[i]);
        }
        }

        }
        /*  3
            fox box
            dog cat
            car bus
        */





