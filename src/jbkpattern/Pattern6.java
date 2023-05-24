package jbkpattern;

public class Pattern6 {
	public static void main(String[] args) {
//		int a[] = { 90, 4, 16, 64, 8 };
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				if (a[i] == a[j] * a[j]) {
//					System.out.println(a[i]);
//				}
//			}
//		}

		/*
		 * EEEEE DDDD CCC BB A
		 */

		int a[] = { 2, 4, 4, 3 };
		int b[] = new int[a.length];
		int k = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			b[k++] = a[i];
		}
		a = b;
		for (int i = 0; i < b.length; i++) {
			System.out.println(a[i]);
		}

	}
}
