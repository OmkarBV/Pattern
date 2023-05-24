package jbkpattern;

public class Pattern9 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= i) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("-------------");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			for (int k = n - 1; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
