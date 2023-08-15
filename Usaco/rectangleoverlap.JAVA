import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;


///censored word
public class Main {


    public static void   main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x1_bil1 = in.nextInt();
        int y1_bil1 = in.nextInt();
        int x2_bil1 = in.nextInt();
        int y2_bil1 = in.nextInt();
        int x1_bil2 = in.nextInt();
        int y1_bil2 = in.nextInt();
        int x2_bil2 = in.nextInt();
        int y2_bil2 = in.nextInt();
        int x1_truck = in.nextInt();
        int y1_truck = in.nextInt();
        int x2_truck= in.nextInt();
        int y2_truck= in.nextInt();

        rec bill1 = new rec(x1_bil1,y1_bil1,x2_bil1,y2_bil1);
        rec bill2 = new rec(x1_bil2,y1_bil2,x2_bil2,y2_bil2);
        rec truck = new rec(x1_truck,y1_truck,x2_truck,y2_truck);

        int intersec1=bill1.getSurfaceIntersec(truck) , intersec2=bill2.getSurfaceIntersec(truck);

        //if(bill1.ifintersect(truck))intersec1=;
       // if(bill2.ifintersect(truck))intersec1=;

        System.out.println(bill1.getsurface());
        System.out.println(bill2.getsurface());
        System.out.println(truck.getsurface());
        System.out.println(intersec1);
        System.out.println(intersec2);


        System.out.println("the total surface that bessie can ee is " + ((bill1.getsurface()+bill2.getsurface())-intersec1-intersec2));

/* 1 2 3 5
  6 0 10 4
   2 1 8 3*/

     /*   int X_bill1 =(x2_bil1 - x1_bil1 );       // System.out.println(X_bill1);


        int Y_bill1 =(y2_bil1 - y1_bil1 );        //System.out.println(Y_bill1);

//        System.out.println(bill1);

        int X_bill2 =(x2_bil2 - x1_bil2 );      //  System.out.println(X_bill2);

        int Y_bill2 =(y2_bil2 - y1_bil2 );      //  System.out.println(Y_bill2);


        int X_truck = (x2_truck - x1_truck);      //  System.out.println(X_truck);

        int Y_truck = (y2_truck - y1_truck);        //System.out.println(Y_truck);



        int bill1 = (int) Math.sqrt(Math.pow(X_bill1,2) + Math.pow(Y_bill1,2));
        int bill2 = (int) Math.sqrt(Math.pow(X_bill2,2) + Math.pow(Y_bill2,2));
        int truck = (int) Math.sqrt(Math.pow(X_truck,2) + Math.pow(Y_truck,2));


        System.out.println(Math.pow(bill1,2));
        System.out.println(Math.pow(bill2,2));
        System.out.println(Math.pow(truck,2));*/


        }



        public static class rec {

            int x1 ; int y1 ; int x2 ; int y2 ;

            public  rec (int x1,int y1 , int x2 , int y2){

                this.x1 =x1;
                this.y1 =y1;
                this.x2 =x2;
                this.y2 =y2;

            }
        //if intersect ,int getside , int get area ;

            /*
            public boolean ifintersect (rec r1 ){

                if((this.x1<=r1.x1 && this.x2 >= r1.x1) || (this.x1<=r1.x2 && this.x2 >= r1.x2))return true ;

                if((this.y1<=r1.y1 && this.y2 >= r1.y1) || (this.y1<=r1.y2 && this.y2 >= r1.y2))return true ;

                        return false ;
            }
            */
            public int getside (){
                //return (int) Math.sqrt(Math.pow(this.x2-this.x1,2)+Math.pow( this.y2 - this.y1, 2));
                return (this.x2 - this.x1) + (this.y2 - this.y1) ;
            }

            public int getsurface (){
                return (this.x2 - this.x1) *(this.y2 - this.y1);
            }

            public int getSurfaceIntersec(rec truck){

                int x = Math.min(this.x2,truck.x2) - Math.max(this.x1,truck.x1);
                int y = Math.min(this.y2,truck.y2) - Math.max(this.y1,truck.y1);

                return x*y ;



            }

        }


}




