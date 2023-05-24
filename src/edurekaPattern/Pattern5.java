package edurekaPattern;

/*
5. Downward Triangle Star Pattern
Enter the number of rows: 5

* * * * * 
* * * * 
* * * 
* * 
* 
 */
public class Pattern5 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
