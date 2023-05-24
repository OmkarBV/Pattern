package AlphabeticalPaterrn;

//A 
//B B 
//C C C 
//D D D D 
//E E E E E 
//F F F F F F
public class Pattern2 {
	public static void main(String[] args) {
		char n = 'F';
		for (char i = 'A'; i <= n; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
