package Pattern2;

public class Pattern27 {

	public static void main(String[] args) {
		int a = 121212;
		for (int i = 1; i <= 5; i++) {
			int t = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(t);
				t = t + 5 - j;
			}
			System.out.println();
		}
	}
}
