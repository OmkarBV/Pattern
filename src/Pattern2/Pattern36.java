package Pattern2;

/*
1 3 5 7 9
3 5 7 9 1
5 7 9 1 3
7 9 1 3 5
9 1 3 5 7
 */
public class Pattern36 {
	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i <= n; i += 2) {
			for (int j = i; j <= n; j += 2) {
				System.out.print(j);
			}
			for(int k=1;k<=i-1;k+=2) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
