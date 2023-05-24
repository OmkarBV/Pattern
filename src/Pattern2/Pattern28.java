package Pattern2;
/*
1 
2 4 
3 6 9 
4 8 12 16 
5 10 15 
6 12 
7 

 */
public class Pattern28 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}	int t=5;
		for(int i=3;i>=1;i--,t++) {
		
			for(int j=1;j<=i;j++) {
				System.out.print(j*t+" ");
			}System.out.println();
		}
	}
}
