package Series;

//fibonacci
//8) Generate the Series... 0 1 1 2 3 5 8 13 21.
public class Series8 {
	public static void main(String[] args) {
	int n=10;
	int f=0,s=1,l=0;
	
	for(int i=1;i<=n;i++) {
		System.out.println(f);
		l=f+s;
		f=s;
		s=l;
	}
		
	}
}
