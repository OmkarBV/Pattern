package AlphabeticalPaterrn;

/*
   J
  AAA
 VVVVV
AAAAAAA
 */
public class Pattern7 {
	public static void main(String[] args) {
		String s = "JAVA";
		for (int i = 0; i < s.length(); i++) {
			for(int k=s.length();k>=i;k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(s.charAt(i)+" ");
			}
			System.out.println();
		}
	}
}
