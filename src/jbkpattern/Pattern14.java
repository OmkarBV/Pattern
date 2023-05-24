package jbkpattern;

/*
5 5 5 5 5 
4 5 5 5 5 
3 4 5 5 5 
2 3 4 5 5 
1 2 3 4 5 
 */
public class Pattern14 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// for (int i = n; i >= 1; i--) {
//			for (int j = i; j <= n; j++) {
//				System.out.print(j+" ");
//			}
//			for(int j=i-1;j>=1;j--) {
//				System.out.print("5 ");
//			}
//			System.out.println();
//
//		}

	}
}
