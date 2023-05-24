package Pattern2;

public class Pattern29 {
	public static void main(String[] args) {
int aa=2;
		for (int i = 1; i <= 5; i++) {
			int t = i;
			for (int j = i; j >= 1; j--) {
				System.out.print(t);
				t = t * j+5;
			}
			System.out.println();
		}
	}
}
