package allpattern;

public class Pattern11 {
	public static void main(String[] args) {
		int cnt = 1;
		int a=0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(cnt+' ');
				cnt++;
			}
			System.out.println();
		}	
	}
}
