package Apna;

public class Pattern9 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i < 2 * n; i++) {
			if (i <= n) {
				for (int j = 1; j <= i; j++) {
					if (i % 2 == 0) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				}
			} else {
				for (int j = 2 * n; j > i; j--) {
					if (i % 2 == 0) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0)
					System.out.print("-");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0)
					System.out.print("-");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}
}
