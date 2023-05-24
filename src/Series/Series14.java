package Series;

//14) Generate the Series... 1 2 3 4 5 4 3 2 1.
public class Series14 {
	public static void main(String[] args) {
		int n = 10;
int cnt=1;
for(int i=1;i<n;i++) {
	System.out.println(cnt);
	if(i<n/2) {
		cnt++;
	}else {
		cnt--;
	}
}
		
	}
}
