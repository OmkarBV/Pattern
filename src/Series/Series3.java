package Series;

//3) Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10. 
public class Series3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(" " + -i);
			} else {
				System.out.print(" " + i);
			}
		}
	}
}
