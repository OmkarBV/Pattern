package jbkpattern;

public class Pattern5 {
	public static void main(String[] args) {
		int n = 5;
		int cnt = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				System.out.print(cnt);
				cnt++;
			}
			System.out.println();
		}

		System.out.println("------------");

		for (int i = 1; i <= 16; i++) {

			System.out.print(i);
			if (i % 4 == 0) {
				System.out.println();
			}

		}

	}
}
