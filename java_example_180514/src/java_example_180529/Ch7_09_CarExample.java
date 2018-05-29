package java_example_180529;

public class Ch7_09_CarExample {

	public static void main(String[] args) {
		Ch7_09_Car car = new Ch7_09_Car();
		
		Ch7_09_Tire tire = new Ch7_09_Tire("aaa", 10);
		Ch7_09_HankookTire hktire = new Ch7_09_HankookTire("한국",10);
		
		tire = hktire; // 자식 클래스 타입 변수를 부모클래스 타입 변수에 대입
		hktire = (Ch7_09_HankookTire) tire; // 부모 클래스 타입 변수를 잣기클래스 타입 변수에 대입
		
		for(int i=1; i<=5; i++) 
		{
			int problemLocation = car.run();
		switch(problemLocation) 
		{
		case 1:
			System.out.println("앞왼쪽 HankookTire로 교체");
			car.frontLeftTire = new Ch7_09_HankookTire("앞왼쪽", 15);
			break;
		case 2:
			System.out.println("앞오른쪽 kumhoTire로 교체");
			car.frontRightTire = new Ch7_09_KumhoTire("앞오른쪽", 13);
			break;
		case 3:
			System.out.println("뒤왼쪽 HankookTire로 교체");
			car.backLeftTire = new Ch7_09_HankookTire("뒤왼쪽", 14);
			break;
		case 4:
			System.out.println("뒤오른쪽 kumhoTire로 교체");
			car.backRightTire = new Ch7_09_KumhoTire("뒤오른쪽", 17);
			break;
		}
        	System.out.println("-------------------------------------");
		}
		
	}

}
