package jbkpattern;

public class Pattern12 {
	public static void main(String[] args) {
		int n = 8;

		for (int i = 1; i <= n; i++) {
			int cnt = i - 1;
			for (int j = 1; j <= n; j++) {

				if ((i == 1 || j == 1 || j == n || i == n) && (i != j) && i + j != n + 1)
					System.out.print("* ");
				else if ((i == 1 && j == 1 && i + j == i + j) || (i == n && j == n && i + j == n + n)
						|| (i == 1 && j == n && i + j == n + 1) || (i == n && j == 1 && i + j == n + 1)) {
					System.out.print("  ");
				} else {
					System.out.print(cnt + " ");
					if (cnt <= n)
						cnt++;
					else {
						cnt = 1;
					}
				}

			}
			System.out.println();
		}
	}
}
