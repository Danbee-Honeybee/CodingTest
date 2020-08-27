package Basic;

/* Recursion 문자열의 길이 구하기 */
/* 출력 결과
		printChars : 안
		printChars : 녕
		printChars : 하
		printChars : 세
		printChars : 요
		안녕하세요
*/
public class basic6_StringPrint {

	public static void main(String[] args) {
		String str = "안녕하세요";
		printChars(str);
		System.out.print(str);
	}

	public static void printChars(String str){
		if(str.length()==0) 
			return;
		else {
			System.out.println("printChars : " + str.charAt(0));
			printChars(str.substring(1));
		}
	}
}
