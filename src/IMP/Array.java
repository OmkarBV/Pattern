package IMP;

public class Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < a.length/2; i++) {
			int t = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = t;
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
