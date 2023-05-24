package Pattern2;
/*
 1 2 3 4 5 
  2 3 4 5 
   3 4 5 
    4 5 
     5 
     5 
    4 5 
   3 4 5 
  2 3 4 5 
 1 2 3 4 5 
 */
public class Pattern17 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= 5; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		int t = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = t; k <= 5; k++) {
				System.out.print(k + " ");
			}
			t--;
			System.out.println();
		}
	}
}
