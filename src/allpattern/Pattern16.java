package allpattern;
/*
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
 */
public class Pattern16 {
	public static void main(String[] args) {
		int cnt=1;
		for (int i = 1; i <= 5; i++) {
			for (int k = 5; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(cnt+" ");
			}cnt++;
			System.out.println();
		}
	}
}