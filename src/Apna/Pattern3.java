package Apna;

public class Pattern3 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			int cnt = i;
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j < i) {
					System.out.print(cnt);
					cnt++;
				} else {
					System.out.print(cnt);
					cnt--;
				}
			}
			System.out.println();
		}
	}
}
