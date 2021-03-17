package kr.ac.kopo0315;

import java.util.Scanner;

public class IcecreamMarket {
// 이아이가 아이스크림 명, 가격 가지고 있어야함
	
	IceCream[] iceArr;
	//멤버변수로 아이스크림 배열이 들어간다.
	//클래스가 하나 더 늘어난 것, 
	Scanner sc = new Scanner(System.in);
	// 어떨대는 정수형, 어떨때는 문자형을 입력 받는 것이 목적이다.
	// 스캐너를 이용해서 정수 입력받는 것, 하나 문자 입력받는 것하나
	// 나중에 확장을 시키면 늘어날 수 있기 때문
	
	int inputInt(String msg) {
		
		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
		
		
	}
	
	String inputString(String msg) {
		System.out.println(msg);
		String str = sc.nextLine();
		return str;
	}
	
	
	
	void doSomething( ) {
		// 손님이 아이크림을 구매하면,
		buy(); 
		
		info(); //  아이스어레이배열에서 알 수 있다.
		
		// 구매정보 출력
	}
    void info() {
    	System.out.println(iceArr.length +"개 구매정보 출력");
        System.out.println("번호\t아이스크림명\t아이스크림가격");
        int no =1;
        for(IceCream ice : iceArr) {
        	System.out.println(ice.getName());
        	System.out.println(ice.getPrice());
        
        }
        // 아이스크림 마켓에서는 아이스크림 정보는 아이스크림 타입이 알고 있다는 것을 안다.
        // 하지만 멤버변수가 무엇이 있는 지 알수있는 방법은 없다.
        // 하지만 이것은 좋은 방법이 아니다. ice.price로 이름을 고칠수도 잇음
        // 따라서 멤버변수보다는 메서드로 접근하는 것이 좋다.
        // 멤버변수 이름을 바꾸어도, 할 수 있도록 
        
        }
        
    
        
    
	
	
	void buy() {
		int count = inputInt("아이스크림 몇개 구매할래? :");
		iceArr = new IceCream[count];
		for(int i = 0; i < iceArr.length ; i++)
		{
			System.out.println((i+1)+"의 구매정보 출력");
			
			String name = inputString("아이스크림명");
			int price = inputInt("아이스크림 가격");
			
			iceArr[i] = new IceCream();
			iceArr[i].set(name,price);
			// 그러면 이 셋 메서드는 어디 있어야하나? 
			// 아이스크림 클래스에 정의되어있어야함.
			// 리턴값은 없고, 날리는 값은 2개
			// void set(String n, int p) 여기에 날라가야함
			// 몇개인지 저장하는 배열
		}
		//System.out.println(count +'개');
		// 그러면 아이스크림명 입력을 어디서 받을 것인가?
		// 아니면 대입 형태로 만들것인가? 선택을 하면 된다.
	}
	
   
	
	
}
