package jbkpattern;

public class Pattern11 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = n; j >= i; j--) {
				if (i == 1 || j == n || j == i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}
	}
}
