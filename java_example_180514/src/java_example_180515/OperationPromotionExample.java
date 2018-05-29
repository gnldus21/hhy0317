package java_example_180515;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; // 컴파일에러
		//같은 바이트타입 변수에 바이트타입변수 + 바이트타입변수 를 더하면 안됨.
		int intValue1= byteValue1 + byteValue2;
		System.out.println(intValue1);
		//바이트타입 변수 < 인트타입변수 라서 자동으로 정수로 변환되는데
		//10+20 = 30인게 당연한거아님?

		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; // 컴파일 에러
		//위와 같이 차 타입 변수에 차타입 을 더한 걸 대입할수 없음.
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		//charValue1 의 'A'라는 문자를 정수로 바꾸었을시 66 = A라는 문자의 유니코드.
		//위정수 66(A)를 정수 1에 더하면 67이된다. 67을 char타입으로 변환 B(67)이됨.
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		//intValue4 는 10을 4로 나눔. 2.5가 나오지만. 소숫점을 버림. 2가나옴.
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; //컴파일 에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		// 더블타입은 소숫점(실수)를 제공. 10을 4로나누면 2.5가 나와 결과도 2.5~
	}

}
