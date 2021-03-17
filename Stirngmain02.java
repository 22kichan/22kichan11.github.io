package kr.ac.kopo0315;

import java.util.Scanner;

public class Stirngmain02 {

	public static void main(String[] args) {
		
		char[] chars;
		
		String str = "hello world";
		System.out.println(str.length());
		// 스트링에서 첫번째문자를 알고 싶었다면, 0번째에 위치한 문자 : str.charAt0
		System.out.println(str.charAt(0));
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력");
		String input = sc.nextLine();
		// a를 입력해도, "A"로 입력받는다
		//char c = input.charAt(0);
				// 위랑 아래랑 같다.
		char c = sc.nextLine().charAt(0);
		System.out.println(c);
	}

}
