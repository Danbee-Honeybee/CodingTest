package Basic;

/* Recursion 문자열의 길이 구하기 */
/* 출력결과 : 안녕하세요	*/

public class basic5_StringLength {

	public static void main(String[] args) {
		String str = "안녕하세요";
		length(str);
		System.out.println(str);
	}

	public static int length(String str){
		if(str.equals("")) 
			return 0;
		else {
			System.out.println(str.substring(1));
			return 1+length(str.substring(1));
		}
	}
}
