package Apna;

public class Pattern4 {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i <= n * 2; i++) {
			if (i <= n) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = n * 2; j > i; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
