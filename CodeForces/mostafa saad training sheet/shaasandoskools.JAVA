
import java.util.* ;

public class Compteur {

				public static void main (String[] args) {
					
						Scanner in = new Scanner(System.in) ; 
						
						ArrayList <Integer> list = new ArrayList <>();
						
						int nbrofbox = in.nextInt();
						
						for(int i = 0 ; i < nbrofbox ; i++) {
							
							list.add(in.nextInt());
							
						}
						
						int nbrkill = in.nextInt();
						
						for(int j = 0 ; j < nbrkill ; j++) {
							
							int boxpos = in.nextInt();
							boxpos--;
							
							int birdn = in.nextInt();
							birdn--;
							
							
							
							if( !(boxpos - 1 < 0) ) {
								
								int ele = list.get(boxpos-1) ; 
								
								ele += list.get(boxpos) - (list.get(boxpos) - birdn) ; 
								
								list.set(boxpos-1, ele) ; 
								
							}
							
							if(!(boxpos + 1 >= nbrofbox)) {
								
								int ele = list.get(boxpos+1) ; 
								
								ele += list.get(boxpos) - birdn  -1 ; 
								
								list.set(boxpos+1, ele) ; 
								
							}
							
							
							
							list.set(boxpos,0) ; 

							
						}
						
						for(int i = 0 ; i < nbrofbox ; i++) {
							
							System.out.println(list.get(i));
							
						}
						
			}

				
}

