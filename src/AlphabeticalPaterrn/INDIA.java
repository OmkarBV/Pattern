package AlphabeticalPaterrn;

public class INDIA {
	public static void main(String[] args) {

		String s = "INDIA";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
		String ss="";
		for(int i=0;i<s.length();i++) {
			ss=ss+s.charAt(i);
			System.out.println(ss);
		}
	}
}
