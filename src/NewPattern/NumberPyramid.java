package NewPattern;

/*
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
 */
public class NumberPyramid {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("  ");
			}
			int t = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(t++ + " ");
			}
			// System.out.println(" 8* "+t+" *8 ");
			t -= 2;
			for (int j = 2; j <= i; j++) {
				System.out.print(t + " ");
				t--;
			}
			System.out.println();
		}

	}
}
