package allpattern;

public class Pattern8 {
	public static void main(String[] args) {
		int n, c, k,error=0;
		n = 5;
		for (c = 1; c <= n; c++) {
			for (int j = 5; j >= c; j--) {
				System.out.print(" ");
			}
		
			for (k = 1; k <= c; k++) {
				if (k % 2 != 0)
					System.out.print("*");
				else
					System.out.print("A");

			}
			System.out.print("\n");

		}
	}
}
