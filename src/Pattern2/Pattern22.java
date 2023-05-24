package Pattern2;
/*
10000
02000
00300
00040
00005
 */
public class Pattern22 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.print(j);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}
