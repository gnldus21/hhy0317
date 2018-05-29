package java_example_180515;

public class CastingExample {

	public static void main(String[] args) {
		 int intValue = 44032;
		 //44032는 문자 '가'의 유니코드 .
		 char charValue = (char) intValue;
		 // 내 예상대로라면 가로안에 char은 그 타입으로 변환 하는걸 뜻할것.
		 System.out.println(charValue);
		 // 그렇다면 출력했을 때 가 가 나오는게 당연한거란 말씀~
		 
		 long longValue = 500;
		 // 롱타입의value에 500의 변수를 줬다.
		 intValue = (int) longValue;
		 //int 는 정수형 타입 결국엔 변환을 정수로 해서 500이 고대로 나온단 뜻.
		 System.out.println(intValue);
		 
		 double doubleValue = 3.14;
		 // 더블타입는 소숫점을 표시함.
		 intValue = (int) doubleValue;
		 // 하지만 정수타입만 뜨게해줘 라고함.
		 System.out.println(intValue);
		 // 소숫점 증발. 개꿀

	}

}
