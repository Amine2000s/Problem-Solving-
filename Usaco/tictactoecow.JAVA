import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int individuals = 0 ;
        int tteams = 0 ;
        char [][] board = new char[3][3];
        for(int j=0;j<3;j++){
            String temp = in.nextLine();
                board[j][0]=temp.charAt(0);
                board[j][1]=temp.charAt(1);
                board[j][2]=temp.charAt(2);
        }
        //check horizontale
        for(int i=0;i<3;i++){
            //horizontal
            if(board[i][0]==board[i][1] && board[i][2]==board[i][0]){
                    individuals++;
            }else{
                    if(checkteam(board[i][0],board[i][1],board[i][2]))tteams++;
            }

            //vertical
            if(board[0][i]==board[1][i] && board[2][i]==board[0][i]){
                individuals++;

            }else{
                if(checkteam(board[0][i],board[1][i],board[2][i]))tteams++;

            }


        }
        //diagonal
        if(board[0][0]==board[1][1] && board[2][2]==board[0][0]){
            individuals++;

        }else{
            if(checkteam(board[0][0],board[1][1],board[2][2]))tteams++;

        }


            //reverse diagonal
        if(board[0][2]==board[1][1] && board[2][0]==board[0][2]){
            individuals++;

        }else{

            if(checkteam(board[0][2],board[1][1],board[2][0]))tteams++;

        }

        System.out.println(individuals);
        System.out.println(tteams);


    }
        public static boolean checkteam(char a ,char b , char c ){

            if(a == b )return true;
            if(a ==c )return true ;
            if(c==b )return true;

            return false ;

        }
        }
        /*  3
            fox box
            dog cat
            car bus
        */





