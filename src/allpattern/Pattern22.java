package allpattern;

public class Pattern22 {
	public static void main(String[] args) {
		int p = 1;
		for (int i = 1; i <= 11; i++) {
			for (int j = 11; j >= p; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= p; k++) {
				System.out.print(" " + k);
			}
			if (i <= 5) {
				p += 2;
			} else {
				p -= 2;
			} 
			System.out.println();
		}
	}
}
