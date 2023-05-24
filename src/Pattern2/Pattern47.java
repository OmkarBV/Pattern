package Pattern2;

/*

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6
7 7 7
8 8
9
 */
public class Pattern47 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n / 2; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}

			System.out.println();
		}
		for (int i = n / 2; i <= n; i++) {
			for (int j = n / 2; j <= n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}
}
