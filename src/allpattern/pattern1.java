package allpattern;

/*
* 
**
***
****
*****
 */
public class pattern1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {  // no of line
			for (int j = 1; j <= i; j++) { //no of Star
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
