package AlphabeticalPaterrn;

/*
A 
B F 
C G J 
D H K M 
E I L N O
 */
public class Pattern11 {
	public static void main(String[] args) {
		char c = 'A';
		int n = 5;

		for (int i = 1; i <= n; i++) {
			char ct = c;
			for (int j = 1; j <= i; j++) {
				System.out.print(ct + " ");
				ct += n - j;
			}
			c++;
			System.out.println();
		}
	}
}
