package kr.ac.kopo0315;

public class CarMain {

	public static void main(String[] args) {
		
		Car c = new Car(); {
			
			//  카라는 생성자를 호출한것임 없지만, 에러나지 않는 이유는? jvm
		Car c2 = new Car("소나타");
		
		Car c3 = new Car(1000,"모닝");
		}
			
		}

	}


