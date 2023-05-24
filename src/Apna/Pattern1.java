package Apna;

/*
12345
1234
123
12
1

 */
public class Pattern1 {
	public static void main(String[] args) {
		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			int cnt = 1;
//			for (int j = n; j >= i; j--) {
//				System.out.print(cnt++);
//			}
//			System.out.println();
//		}
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
