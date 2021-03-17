package kr.ac.kopo0315;

public class StringMain01 {

	public static void main(String[] args) {
		String str = new String();
		char[] chars = {'a','b','c','d'};
		String str2 = new String(chars);
		String str3 = new String(chars,1,3);
		byte[] bytes = {97,98,99,100,101};
		String str4 = new String(bytes);
		String str6 = new String(); 
		System.out.println("str:, ["+ str +"]");

		
		String str5 = new String("hello");
		//String str6 = new String("hello");
		System.out.println("str5:, ["+ str +"]");
		
		// 문자열의 
		
		// 1이랑 2는 다른것임
		// str이 누군가를 가르키는데 비어있다 라는 문자열임
	}

}
