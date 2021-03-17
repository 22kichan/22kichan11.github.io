package kr.ac.kopo0315;



public class ConstructerMain02 {
	
	public static void main(String[] args){
	// 어떤 사람의 이름, 나이 혈액형을 가진 멥버클래스 만들려고한다.
	Member n = new Member();
	Member n2 = new Member("홍길동");
	// 오버로딩해서 만들어야함.
	Member n3 = new Member("이기찬",20);
	Member n4 = new Member("이기찬",30, "AB");
	
	n2.info();
	n3.info();
	n4.info();
	
	n.info();
	// 알수없음, 
		
	

}
}
