package Pattern2;

/*
1 2 3 4 5
2 3 4 5 1
3 4 5 1 2
4 5 1 2 3
5 1 2 3 4
 */
public class Pattern34 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(j);
			}
			for (int k = 1; k <= i-1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
