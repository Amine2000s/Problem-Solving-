import java.util.* ;

public class antonndlletter{

				public static void main (String[] args) {
					
						Scanner in = new Scanner(System.in) ; 
						Set<Character> l = new HashSet<>();
						
						int n = 0 ; 
						String input = in.nextLine() ; 
						
						char[] list  = input.toCharArray();
						char[] no = { '{',' ',',','}'};
						
						for (int i = 0 ; i < list.length ; i++) {
							
							if(!containns(no,list[i])) {
								if(!l.contains(list[i])) {
									l.add(list[i]);
									n++ ; 

								}
							}
							
						}
						
						System.out.print(n);
							
							
			
					
						
		}
				
				static boolean containns (char[] arrayy , char c  ) {
					
					for(int i = 0 ; i < arrayy.length ; i++) {
						
						if(Character.compare(arrayy[i], c) == 0 )
							return true ; 
						
					}
					
					return false ; 
				
			}

				
}

