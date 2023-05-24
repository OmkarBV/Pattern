package IMP;

//3 3 3 2 2 2 1 1 1
//3 3 2 2 1 1
//3 2 1
public class Pattern2 {
	public static void main(String[] args) {
		int n = 3;

		for (int i = n; i >= 1; i--) {
			int t=i;
			for (int j = i+1; j >= 1; j--) {
				System.out.print(t);
			}
			System.out.println();
		}
	}
}
