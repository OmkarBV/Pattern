package allpattern;
/*
* * * * * 
* * * * 
 * * * 
  * * 
   * 
*/
public class Pattern6 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // No of line
			for (int j = 1; j <= i; j++) { // Spaces
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) { // Star
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
