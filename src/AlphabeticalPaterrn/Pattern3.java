package AlphabeticalPaterrn;

//A 
//A B 
//A B C 
//A B C D 
//A B C D E 
//A B C D E F 
//A B C D E 
//A B C D 
//A B C 
//A B 
//A
public class Pattern3 {
	public static void main(String[] args) {
		char n = 'F';
		for (char i = 'A'; i <= n; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (char i = (char) (n - 1); i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
