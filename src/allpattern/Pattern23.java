package allpattern;

/*
1
24
369
481216
510152025
61218243036
7142128354249
816243240485664
91827364554637281
102030405060708090100
 */
public class Pattern23 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + (j * i));
			}
			System.out.println();
		}
	}
}
