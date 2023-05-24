package Pattern2;
/*
11111
11122
11333
14444
55555
 */
public class Pattern23 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(1);
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
