package java_example_180523;
//CarExample 클래스
public class Ch6_03_CarExample {

	public static void main(String[] args) {
		Ch6_03_Car myCar = new Ch6_03_Car("검정",300);
		// String color : 검정
		// int cc : 300
		//으로 필드 초기화하면서 객체 생성.
		Ch6_03_Car myCar1 = new Ch6_03_Car("빨강",2000);
		Ch6_03_Car myCar2 = new Ch6_03_Car("흰색",4500);
		//Ch6_03_Car myCar3 = new Ch6_03_Car("흰색"); 매개변수가 String 타입만 있는 생성자가없다. (오류뜸  int cc 를 채워줘야함.) 
		

	}

}
