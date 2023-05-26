package Apna;
/*
   1
  232
 34543
4567654

 */
public class Pattern12 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			int cnt = i;
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print(cnt);
				if (j < i) {
					cnt++;
				} else {
					cnt--;
				}
			}
			System.out.println();
		}
	}
}
