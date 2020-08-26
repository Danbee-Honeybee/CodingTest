package Basic;

/* Recursion 이란, 순환 또는 재귀라고 합니다.
 * 자기 자신을 계속 호출한다 = 무한루프에 빠진다
 * base case : 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야한다.
 * resurcive case : recursion을 반복하다보면 결국 base case로 수렴해야한다.*/
public class basic1_Recursion2 {

	public static void main(String[] args) {
			int n=4;
			function(n);
	}

	public static void function(int k) {
		if(k<=0) {
			System.out.println("빠지지 않았네요.");
			return;
		}
		else {
			System.out.println("과연 실행하면 무한루프에 빠질까요?");
			function(k-1);
		}
	}
}
