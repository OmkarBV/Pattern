package Apna;

/*
 
*-------*
 *-----*
  *---*
   *-*
    *
 
 */
public class Pattern10 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = n; i >= 1; i--) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j == 1 || (2 * i - 1) == j) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}

		// To Complicated
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 2 * n - 1; j >= i*2-1; j--) {
//				if (j ==(2 * n - 1)  || (2 * i - 1) == j) {
//					System.out.print("*");
//				} else {
//					System.out.print("-");
//				}
//			}
//			System.out.println();
//		}
	}
}
