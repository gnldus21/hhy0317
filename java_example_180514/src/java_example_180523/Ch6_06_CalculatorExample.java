package java_example_180523;

public class Ch6_06_CalculatorExample {

	public static void main(String[] args) {
		// Calculator 객체 생성
		//powerOn  메소드 호출
		//plus 메소드 호출 (매개 값은 알아서)및 호출결과 출력
		//divide 메소드 호출(매개값은 알아서)및 호출결과 출력
		//powerOff 메소드 호출
		
		//Calculator 객체 호출.
		Ch6_06_Calculator cal = new Ch6_06_Calculator();
		//powerOn  메소드 호출
		cal.powerOn();
		//plus 메소드 호출 (매개 값은 알아서)및 호출결과 출력
		int x = cal.plus(20, 30);
		System.out.println(x);
		//divide 메소드 호출(매개값은 알아서)및 호출결과 출력
		int z = 20, y = 3;
		System.out.println(cal.divide(z, y));
		//powerOff 메소드 호출
		cal.powerOff();
		
		
		
		
		

	}

}
