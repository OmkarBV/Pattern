package Pattern2;

/*
1 3 5 7 9
3 5 7 9 1
5 7 9 3 1
7 9 5 3 1
9 7 5 3 1

 */
public class Pattern38 {
	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i <= n; i += 2) {
			for (int j = i; j <= n; j += 2) {
				System.out.print(j);
			}
			for (int j = i; j >= 1; j -= 2) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
