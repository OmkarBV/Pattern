package Pattern2;
/*
5 5 5 5 5 
5 4 4 4 4 
5 4 3 3 3 
5 4 3 2 2 
5 4 3 2 1 
 */
public class Pattern31 {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j+" ");
			}
			for(int k=1;k<i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
