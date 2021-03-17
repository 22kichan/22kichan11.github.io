package kr.ac.kopo0315;

public class Car {
/*
 * 생성자의 특징
 * 1. 클래스명과 이름이 같음
 * 2. 반환형이 존재 하지 않는다.
 * 3. 디폴트 생성자를 지원한다.
   4. 생성자오버로딩을 지원한다.
   5. 객체의 (멤벼변수)초기화가 생성의 목적이다.
 */
	// 멤버변수가 설정되어있지 않은데 가능한가?
	Car()
	{
		System.out.println("Car()생성자 호출");
	}
	Car(String s){
		System.out.println("Car(String) 생성자 호출");
	}
	Car(int i , String s){
		System.out.println("Car(int, String) 생성자 호출");
	
	/* 이건 생성자가 아닌 일반 메소드 카를 호출한 것임.
	 * Void Car() {
	 * 카를 호출하기위해서는 객체명.
	 * 이걸 사용할때는, 소문자.
	 * 
	 */
		
	}
}
