import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {


    public static void   main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        ArrayList<Character> directions = new ArrayList<>();//recording dirrection

        ArrayList<Integer>  kml = new ArrayList<>();//recording distance

        ArrayList<Pair< Integer,point>> record = new ArrayList<>();//for recording each position and how much distance passed

        int max =9999;


        for (int i=0 ; i< N ; i++){
            directions.add(in.next().charAt(0));
            kml.add(in.nextInt());
        }
        int distance = 0 ;

        point mainPoint = new point(0,0);
        record.add( new Pair<>(distance ,mainPoint) );
        System.out.println("Current Location :  x :"+mainPoint.x + " Y : "+mainPoint.y);
        System.out.println("curr distance "+ distance);
        System.out.println("max"+max);


        for (int i=0 ; i< N ; i++){

            for(int j = 0 ; j < kml.get(i) ; j++){

                mainPoint.movenext(directions.get(i));
                distance++;
                System.out.println("Current Location :  x :"+mainPoint.x + " Y : "+mainPoint.y);
                System.out.println("curr distance "+ distance);

                if(isfound(record,new point(mainPoint.x, mainPoint.y))==true){
                    int g = getindex(record,mainPoint);
                    int temp = record.get(g).distance;

                    int minus = Math.abs(temp- distance );
                    System.out.println("temp " + record.get(g).distance );
                    System.out.println("distance " + distance );
                    System.out.println("g " + g );

                    if(minus<max)max=minus;
                    System.out.println(" changed max  "+max);

                }else{                System.out.println("max :"+max);}

                record.add( new Pair<>(distance ,new point(mainPoint.x, mainPoint.y) ));

            }
            //record.con
        }
        /*for(int i=1 ; i < record.size() ; i++){

            //System.out.println(" step no " + i +" current location x:"+ record.get(i).position.x +" y:"+record.get(i).position.y + " Distance passed : " + record.get(i).distance );

        }*/
        System.out.println(max);



    }

    static class Pair <n,m>{

        n distance ;
        m position ;

        public Pair(n a , m b){
            this.distance = a ;
            this.position = b ;
        }




    }


    public static class point {

        int x ;
        int y ;

        public point (int xa ,int ya){

            this.x = xa;
            this.y = ya;

        }


        public void movenext( char c){

            switch(c){

                case 'N' :  this.y++;
                            break ;
                case 'S' :  this.y--;
                            break;
                case 'E' : this.x++;
                            break;
                case 'W' : this.x--;
                            break;

            }

        }


        public boolean equals (point x){

            if (this.x == x.getX() && this.y == x.getY())return  true ;
            return false ;

        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static boolean isfound  (ArrayList<Pair< Integer,point>> record , point value ){

        for(int i =1 ; i< record.size() ; i++){

            if(record.get(i).position.equals(value)) {
                System.out.println("identically confired becuz record pos x is " + record.get(i).position.x);
                System.out.println("identically confired becuz record pos y is " + record.get(i).position.y);
                System.out.println("identically confired becuz  pos x is " + value.x);
                System.out.println("identically confired becuz  pos y is " + value.y);

           //     return true;

                return true ;

        }
    }

        return false ;

    }
    public static int getindex(ArrayList<Pair<Integer, point>> record, point value){

        for(int i =1 ; i< record.size() ; i++){

            if(record.get(i).position.x== value.x && record.get(i).position.y== value.y) return i ;

        }
        return -1 ;
    }


}




