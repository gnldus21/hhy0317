package java_example_180529;

public class Ch7_09_Car {
	//필드
	//각 필드는 Tire 클래스 타입으로 선엄됨.(객체)
	Ch7_09_Tire frontLeftTire = new Ch7_09_Tire("앞왼쪽",6);
	Ch7_09_Tire frontRightTire = new Ch7_09_Tire("앞오른쪽",2);
	Ch7_09_Tire backLeftTire = new Ch7_09_Tire("뒤왼쪽",3);
	Ch7_09_Tire backRightTire = new Ch7_09_Tire("뒤오른쪽",4);
	//위내용을 배열로
	//Tire 클래스 타입의 배열변수를 선언 우변에있는 내용을 각각 배열변수에 대입
	/*Tire[] tire = new Tire[100];
	Tire[] tire1 = {};
	Tire[] tire2 = {
			new Tire("앞왼쪽",6),
			new Tire("앞오른쪽",2),
			new Tire("뒤왼쪽",3),
			new Tire("위오른쪽",4)*/
	};
	
	/*tire2[0] = new Tire("앞왼쪽",6);
	tire2[1] = new Tire("앞오른쪽",2);
	tire2[2] = new Tire("뒤왼쪽",3);
	tire2[3] = new Tire("위오른쪽",4);*/
					

	//생성자
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRightTire.roll()==false) {stop(); return 2;}
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		return 0;
		
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}

