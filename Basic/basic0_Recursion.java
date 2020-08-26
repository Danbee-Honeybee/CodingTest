package Basic;

/* Recursion 이란, 순환 또는 재귀라고 합니다.
 * 자기 자신을 계속 호출한다 = 무한루프에 빠진다*/
public class basic0_Recursion {

	public static void main(String[] args) {
			function();
	}

	public static void function() {
		System.out.println("이 함수는 무한루프에 빠질겁니다.");
		function();
	}
	
}
