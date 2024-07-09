{
public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in) ;

        int friendLocation = in.nextInt();

        if(friendLocation<5){
        System.out.println(1);
        }else{
        if(friendLocation%5==0){
        System.out.print(friendLocation/5);
        }else{
        System.out.println(friendLocation/5 + 1 );
        }


        }


        }
        }