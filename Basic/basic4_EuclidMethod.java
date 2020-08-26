package Basic;

/* Recursive 최대공약수 Euclid Method*/

public class basic4_EuclidMethod {

	public static void main(String[] args) {
		int a=6, b=7;	
		gcd(a, b);
	}

	public static int gcd(int m, int n) {
		if(m<n) {
			int tmp=m; m=n; n=tmp;
		}
		
		if(m%n==0) {
			return n;
		}
		
		else {
			return gcd(m, m%n);
		}
		
	}
}
