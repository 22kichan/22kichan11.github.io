package kr.ac.kopo0315;


public class Member {
	
	String name;
	int age;
	String bloodType;
	
	// 생성자는 멤버변수와 메소드 사이에 들어간다.
	// 초기화를 알수업음이 아니라, unknown으로 한다면?
	// 하나씩 초기화하는 것이나, 마지막에 3개있는 것을 초기화하는 것은 같음
	// 그렇다면, 
	Member(){ // 아무것도 입력되지 않았다면 이값으로 초기화 시켜!
		this("알수없음");
		//this("알수없음", -1, "알수없음"); /// 하지만 이것도 좋은 방식은 아니였다..
		// 계속 수정해주어야하기때문ㅇ[
		/*name = "알수없음";
		age = -1;
		bloodType = "알수없음";
		*/
	}
	
	Member(String name){
		this(name, -1);
		// 이렇게 하면 2개값이 초기화 되면서 초기화됨.
		//this(name, -1, "알수없음");
		/*this.name = name;
		this.age = -1;
		this.bloodType = "알수 없음.";
	*/
	}
	Member(String name, int age) // 2개만 초기화 했지만, 실제로는 3개로 초기화는것
	{	
		// Member(String name, int age)
		// 2개짜리여도 3개짜리 인거 아닌가?
		
		// 이건 안됨Member(name, age, " 알수없음");
		this(name, age, "알수없음"); 
		// 이건 첫번째 있어야한다. this생성자는 여러번 실행할 수 없다.
		// 자기의 위치에서 하나만 생성해야한다.
	}
		/*this.name = name;
		this.age = -1;
		this.bloodType = "알수 없음.";
	*/
	
	Member(String name, int age, String bloodType)
	{
		this.name = name;
		this.age = -1;
		this.bloodType = bloodType;
	
		
		
		
		// 이렇게 쓰면 컴퓨터가 구분하지 못함!
		// 멤버변수의 네임, 생성자내의 네임을 써주면
		// 자바는 이것을 무엇으로 해석할까?
		// name에서 가장 가까운 지역변수가 우선
		// Member(String name) 여기의 네임을 구분한다.
		// 멤버변수의 이름은 파란색
		// 생성자 안에 정의한 것은 갈색으로 표시
		// 이렇게 하면 같은 지역변수에 지역변수 네임을써주면된다.
		// 원래는 name쓰는 것이 좋은데ㅠㅠ 
		// name = name;
		// this클래스를 이용해서 지역변수와, 전역변수를 구분해준다. 
		// 같은 이름을 쓰고 싶을때는 this추가!!
	}
	
	
	void info() {
		System.out.println("이름 :" + name + "나이 :"+ age + 
				"혈액형 :" + bloodType);
		
	}

}
