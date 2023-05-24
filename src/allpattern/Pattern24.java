package allpattern;
/*
1
23
456
78910
1112131415
161718192021
22232425262728
2930313233343536
373839404142434445
46474849505152535455

 */
public class Pattern24 {
	public static void main(String[] args) {
		int k = 1;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}
}
