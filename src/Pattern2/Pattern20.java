package Pattern2;
/*
     1
    121
   12321
  1234321
 123454321
 */
public class Pattern20 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int k = i; k <= 5; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			for (int m = i - 1; m >= 1; m--) {
				System.out.print(m);
			}
			System.out.println();
		}
	}
}
