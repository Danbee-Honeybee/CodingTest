package Basic;

/* Factorial 은 Recursive 의 대표적인 예시이다.
 * Recursive 의 형태로 정수의 값을 곱해준다. */

public class basic3_Factorial {

	public static void main(String[] args) {
			int result = factorial(4);
			System.out.println(result);
	}

	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n * factorial(n-1); // function(n-1) = 3 * 2 * 1
		}
	}
}
