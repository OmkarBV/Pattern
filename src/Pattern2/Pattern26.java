package Pattern2;

/*
5 5 5 5 5 
4 5 5 5 5 
3 4 5 5 5 
2 3 4 5 5 
1 2 3 4 5 
 */
public class Pattern26 {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j <= 5; j++) {
				System.out.print(j + " ");
			}
			for (int k = 1; k <= i - 1; k++) {
				System.out.print(5 + " ");
			}
			System.out.println();
		}
		
	}
}
