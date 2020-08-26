package Basic;

/* Factorial 은 Recursive 의 대표적인 예시이다.
 * Recursive 의 형태로 정수의 값을 곱해준다. */

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
