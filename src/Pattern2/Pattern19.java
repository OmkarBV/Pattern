package Pattern2;
/*
     5 
    4 5 
   3 4 5 
  2 3 4 5 
 1 2 3 4 5 
 */
public class Pattern19 {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int k = i; k >= 1; k--) {
				System.out.print(" ");
			}
			for (int j = i; j <= 5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
