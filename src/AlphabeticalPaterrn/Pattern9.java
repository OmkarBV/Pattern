package AlphabeticalPaterrn;

/*
ABCDE
BCDEF
CDEFG
DEFGH
EFGHI
 */
public class Pattern9 {
	public static void main(String[] args) {
		int n = 5;
		char c = 65;
		for (int i = 1; i <= n; i++) {
			char t = c;
			for (int j = 1; j <= n; j++) {
				System.out.print(t);
				t++;
			}
			c++;
			System.out.println();
		}

		
	}
}
