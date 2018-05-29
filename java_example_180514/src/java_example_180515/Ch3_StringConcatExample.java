package java_example_180515;
// 문자열 연결 연산자.
public class Ch3_StringConcatExample {

	public static void main(String[] args) {
		//String 문자열을 저장할수 있는 타입.
		String str1 = "JDK" + 6.0; //str1 = JDK6.0
		String str2 = str1 + "특징";//str2 = JDK6.0특징
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
		// 결과를 보면 str3은 33이라는 숫자가 나오는데 따악봤을때
		// jdk (문자) 가 나온 후부터 저건 숫자가아니라 문자로 인식하는듯.
		// 아래 str4 를 보면 아시다싶이 jdk전 3 + 3.0 은 숫자로 인식함.
	}  

}
