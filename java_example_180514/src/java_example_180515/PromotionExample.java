package java_example_180515;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		// byte형 변수 값의 선언 
		int intValue = byteValue;
		// 기존 byte 타입 변수가 int 타입 변수로 자동 타입변환 발생.
		 // int(정수)형 변수 값은 byte형 변수값과 같다. 결론은 10이라는 말씀~
		System.out.println(intValue);
		// 고래서~ int변수를 출력하면 결론은 byte값과 같으니 두개다 10이나온단 말쓰미다~
		
		char charValue = '가';
		//문자형변수 char 에 '가' 라는 변수를 넣음.
		intValue = charValue;
		//int(정수)타입 변수에 char(문자)타입 변수를 집어넣음.
		//문자가 그대로 들어가는게아닌 '가'에 대응하는 코드값을 변환 출력.
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		//intvalue에 500이라는 숫자를 집어넣고~
		long longValue = intValue;
		// long 이라는 타입에  intvalue 를 집어넣고.  롱이 인트보다 커서 자동 변환.
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
	}

}
