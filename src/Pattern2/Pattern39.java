package Pattern2;

/*
1
3 2
4 5 6
10 9 8 7
11 12 13 14 15
 */
public class Pattern39 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
