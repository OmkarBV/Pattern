package IMP;

/*
1       1
 2     2 
  3   3  
   4 4   
    5    
   4 4   
  3   3  
 2     2 
1       1
 */
public class DiagonalNum {

	public static void main(String[] args) {
//		int n = 9;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				if (i == j || i + j == n + 1) {
//
//					if (i <= 5)
//						System.out.print(i);
//					else
//						System.out.print(n + 1 - i);
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		int nn = 9;
		for (int i = 1; i <= nn; i++) {
			for (int j = 1; j <= nn; j++) {
				if (i == j || i + j == nn + 1) {
					if (i <= nn / 2 + 1) {
						System.out.print(i);
					} else {
						System.out.print(nn - i + 1);
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
