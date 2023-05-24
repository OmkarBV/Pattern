package AlphabeticalPaterrn;

//A 
//A B 
//A B C 
//A B C D 
//A B C D E 
//A B C D E F
public class Pattern1 {
	public static void main(String[] args) {
		for (char c = 'A'; c <= 'F'; c++) {
			for (char i = 'A'; i <= c; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
