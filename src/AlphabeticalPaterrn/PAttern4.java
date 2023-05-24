package AlphabeticalPaterrn;

//F E D C B A 
//E D C B A 
//D C B A 
//C B A 
//B A 
//A 
//A 
//B A 
//C B A 
//D C B A 
//E D C B A 
//F E D C B A
public class PAttern4 {
	public static void main(String[] args) {
		char n = 'F';
		for (char i = n; i >= 'A'; i--) {
			for (char j = i; j >= 'A'; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (char i = 'A'; i <= n; i++) {
			for (char j = i; j >= 'A'; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
