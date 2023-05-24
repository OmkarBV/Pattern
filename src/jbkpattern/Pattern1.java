package jbkpattern;

/*
1 2 * * @ @ 
1 2 * * @ @ 
1 2 * * @ @ 
 */
public class Pattern1 {
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 6; j++) {
				if (j <= 2)
					System.out.print(j + " ");
				else if (j <= 4)
					System.out.print("* ");
				else
					System.out.print("@ ");
			}
			System.out.println();
		}
	}
}
