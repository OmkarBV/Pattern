package AlphabeticalPaterrn;

/*
ABCDEDCBA
ABCDCBA
ABCBA
ABA
A
 */
public class Pattern10 {
	public static void main(String[] args) {
		char c = 'E';
		for (char i = c; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			for (char j = (char)(i - 1); j >= 'A'; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
