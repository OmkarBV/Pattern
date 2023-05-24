package AlphabeticalPaterrn;

/*
      A 
     A B 
    A B C 
   A B C D 
  A B C D E 
 A B C D E F    
 */
public class Pattern5 {
	public static void main(String[] args) {
		char n = 'F';
		for (char i = 'A'; i <= n; i++) {
			for (char j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
