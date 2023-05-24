package AlphabeticalPaterrn;

/*
F E D C B A 
F E D C B 
F E D C 
F E D 
F E 
F 
 */
public class Pattern6 {
	public static void main(String[] args) {
		char c = 'F';
		for (char i = 'A'; i <= c; i++) {
			for (char j = 'F'; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
