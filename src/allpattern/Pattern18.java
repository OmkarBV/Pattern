package allpattern;
/*
1        1
12      21
123    321
1234  4321
1234554321

 */
public class Pattern18 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			
			for (int m = i; m >= 1; m--) {
				System.out.print(m);
			}
			System.out.println();
		}
	}
}
