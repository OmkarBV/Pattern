package Pattern2;

/*
1
2 3
6 5 4
7 8 9 10
15 14 13 12 11
 */
public class Pattern40 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
