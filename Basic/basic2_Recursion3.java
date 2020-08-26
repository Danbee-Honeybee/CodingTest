package Basic;

/* Recursion 이란, 순환 또는 재귀라고 합니다.
 * 자기 자신을 계속 호출한다 = 무한루프에 빠진다
 * base case : 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야한다.
 * recursive case : recursion을 반복하다보면 결국 base case로 수렴해야한다.*/

public class basic2_Recursion3 {

	public static void main(String[] args) {
			int result = function(4);
			System.out.println(result);
	}

	public static int function(int n) {
		if(n<=0) {
			return 0;
		}
		else {
			return n + function(n-1); // function(n-1) = 3 + 2 + 1 + 0
		}
	}
}
