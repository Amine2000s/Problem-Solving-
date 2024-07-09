import java.util.* ;

public class Compteur {

				public static void main (String[] args) {
					
						Scanner in = new Scanner(System.in) ; 
						
						ArrayList <String> list = new ArrayList <>();
						int n = in.nextInt();
						
						for(int i = 0 ; i <= n ; i++) {
							
							list.add(in.nextLine());	
						}
						
						for(int i = 0 ; i <= n ; i++) {
							
							char [] temp = list.get(i).toCharArray();
							
							if(temp.length > 10) {
								
							int s = temp.length - 2 ;
							
							String a = s+"";		
							
							System.out.println(temp[0] + a + temp[temp.length-1]);
								
							}else {
								
								System.out.println(temp);

								
							}
							
							
							
							
						}
						
						
						
			}

				
}

