package kr.ac.kopo0315;

public class IceCream {

	String name;
	int price;
	// 내가 필요한 것만 추상화 시킨다.
	
	void set(String n, int p) {
		name = n;
		price = p;
	}
	
	String getName() {
		return name; // 자신의 객체에 들어있는 값을 외부에 알려줄려고 함.
		
	}
	
	int getPrice() {
		return price;
	}
	
}
