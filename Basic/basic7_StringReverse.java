package Basic;

/* Recursion 거꾸로 문자열 출력 */
/* 입력 Today
 * 출력 yadoT */

public class basic7_StringReverse {

	public static void main(String[] args) {
		String str="Today";
		printCharsReverse(str);
	}

	public static void printCharsReverse(String str){
		if(str.length()==0)
			return;
		else {
			printCharsReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
}
