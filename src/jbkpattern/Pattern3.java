package jbkpattern;

/*
*
**
***
****
***
**
*
 */
public class Pattern3 {
	public static void main(String[] args) {
		System.out.println("Logic 1");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("logic 2");
		int p = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= p; j++) {
				System.out.print("*");
			}
			if (i < 5) {
				p++;
			} else {
				p--;
			}
			System.out.println();
		}
	}
}
