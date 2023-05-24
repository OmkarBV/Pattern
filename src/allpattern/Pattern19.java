package allpattern;
/*
1
23
345
4567
56789
 */
public class Pattern19 {
	public static void main(String[] args) {
		int i, j, k;
		for (i = 1; i <= 5; i++) {
			j = i;
			for (k = 1; k <= i; k++) {
				System.out.print(j);
				j++;
			}
			System.out.print("\n");
		}
	}
}
