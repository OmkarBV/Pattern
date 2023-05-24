package Series;

//6) Generate the Series... 1  3  6  10  15  21  28  36  45.  
public class Series6 {
	public static void main(String[] args) {
		int cnt = 1;
		int n=1;
		for (int i = 1; i <= 10; i++) {

			System.out.println(n);	//1,3,6,10
			cnt++;					//2,3,4
			n=cnt+n;				//3,6,10
		}
	}
}
